/**
 * @author ROGÉRIO MOREIRA ALVES JÚNIOR
 * @date 17/06/2023 (BR-PT)
 * @title MODELO DE CONEXÃO VIA API COM CHATGPT
 * @model "gpt-3.5-turbo"
 */

package chatgpt;

//IMPORTANDO AS BIBLIOTECAS NECESSÁRIAS
import java.io.BufferedReader; // Biblioteca para leitura de dados de entrada
import java.io.InputStreamReader; // Biblioteca para leitura de dados de entrada
import java.io.OutputStream; // Biblioteca para saída de dados
import java.net.HttpURLConnection; // Biblioteca para conexão HTTP
import java.net.URL; // Biblioteca para trabalhar com URLs

public class Exemplo {
	// DEFININDO AS CONSTANTES DE URL E API KEY
	private static final String apiUrl = "https://api.openai.com/v1/chat/completions";
	private static final String apiKey = "DIGITE_AQUI_SUA_CHAVE_API";

	public static void main(String[] args) throws Exception {
		// CRIANDO CONSTRUTOR: CRIANDO URL COM O ENDEREÇO DA API
		URL url = new URL(apiUrl); // O construtor da classe URL é responsável por criar uma instância de URL a
									// partir de uma string que representa a URL desejada. O valor da variável
									// apiUrl é passado como argumento para o construtor, especificando a URL que
									// será utilizada no objeto url.

		// ## ABRINDO CONEXÃO HTTP COM A URL
		HttpURLConnection request = (HttpURLConnection) url.openConnection();

		// CONFIGURAÇÃO DA SOLICITAÇÃO
		request.setRequestMethod("POST"); // Definindo o método da solicitação como POST para envio de dados ao servidor
		request.setRequestProperty("Content-Type", "application/json; utf-8"); // Definindo as propriedades da
																				// solicitação, como o tipo de conteúdo
																				// e a autorização (O tipo de conteúdo é
																				// definido como "application/json;
																				// utf-8" para indicar que o corpo da
																				// solicitação está em formato JSON)

		request.setRequestProperty("Authorization", "Bearer " + apiKey); // A autorização é definida como "Bearer"
																			// seguido da chave de API para autenticar a
																			// solicitação

		request.setDoOutput(true); // Habilitando a saída de dados na conexão para enviar o corpo da solicitação ao
									// servidor

		// ARMAZENANDO OS PARÂMETROS EM VARIÁVEIS
		String model = "gpt-3.5-turbo"; // Armazenando o modelo do GPT
		String userInput = "Olá, Chat GPT!"; // Armazenando a entrada do usuário
		int maxTokens = 50; // Definindo o número máximo de tokens

		// MONTANDO O CORPO DA SOLICITAÇÃO NO FORMATO JSON
		String requestData = String.format(
				"{\"model\": \"%s\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}], \"max_tokens\": %d}",
				model, userInput, maxTokens);

		// ENVIANDO A SOLICITAÇÃO PARA O SERVIDOR
		try (OutputStream os = request.getOutputStream()) {
			byte[] input = requestData.getBytes("utf-8");
			os.write(input, 0, input.length);
		}

		// OBTENDO O CÓDIGO DE RESPOSTA HTTP DA CONEXÃO
		int responseCode = request.getResponseCode();
		System.out.println("Response Code: " + responseCode); // Imprime o código de resposta HTTP

		// VERIFICANDO SE O CÓDIGO DE RESPOSTA É DIFERENTE DE 200
		if (responseCode != 200) {
			if (responseCode == 400) {
				System.out.println("Erro de conexão: 400 Bad Request");
				System.out.println(
						"Indica que minha solicitação possui uma sintaxe inválida ou não pode ser processada pelo servidor.");

			} else if (responseCode == 401) {
				System.out.println("Erro de conexão: 401 Unauthorized");
				System.out.println(
						" Indica que eu não tenho permissão para acessar o recurso solicitado. Preciso fornecer autenticação válida.");

			} else if (responseCode == 403) {
				System.out.println("Erro de conexão: 403 Forbidden");
				System.out.println(
						"Indica que não tenho permissão para acessar o recurso solicitado, mesmo que eu esteja autenticado. Isso ocorre devido a restrições de acesso impostas pelo servidor.");

			} else if (responseCode == 404) {
				System.out.println("Erro de conexão: 404 Not Found");
				System.out.println(
						" Indica que o recurso solicitado não foi encontrado no servidor. Pode ser devido a um URL incorreto, recurso movido ou excluído.");

			} else if (responseCode == 500) {
				System.out.println("Erro de conexão: 500 Internal Server Error");
				System.out.println(
						"Indica que ocorreu um erro interno no servidor durante o processamento da minha solicitação. É um problema no código do servidor.");

			} else {
				System.out.println("Erro de conexão: " + responseCode);
			}

			return; // SE A RESPOSTA FOR DIFERENTE DE 200, ENCERRA A OPERAÇÃO
		}

		// LENDO A RESPOSTA DO SERVIDOR
		StringBuilder response = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"))) {
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
		}

		// EXTRAINDO A RESPOSTA DESEJADA DO JSON DE RESPOSTA (MANIPULANDO RESPOSTA JSON
		// - EXTRAINDO O CORPO DE TEXTO RECEBIDO)
		String responseString = response.toString(); // Aqui, convertemos o objeto response do tipo StringBuilder para
														// uma string.
		int startIndex = responseString.indexOf("\"content\": \""); // Procuramos a posição inicial do trecho de texto
																	// que indica o início da resposta desejada no JSON.
																	// Essa posição é armazenada na variável startIndex.

		if (startIndex != -1) { // Verificamos se o startIndex é diferente de -1, o que significa que
								// encontramos a resposta desejada. Caso contrário, a resposta não foi
								// encontrada.
			startIndex += "\"content\": \"".length(); // Se a resposta foi encontrada, ajustamos o startIndex
														// adicionando o comprimento do trecho \"content\": \", para
														// obter a posição inicial do conteúdo da resposta.
			int endIndex = responseString.indexOf("\"", startIndex); // Procuramos a posição final do conteúdo da
																		// resposta, que é o próximo caractere de aspas
																		// duplas após o startIndex.
			String extractedResponse = responseString.substring(startIndex, endIndex); // Usando o método substring,
																						// extraímos o conteúdo da
																						// resposta com base nas
																						// posições startIndex e
																						// endIndex.

			// Imprimindo a resposta extraída (Imprimimos a resposta extraída na saída do
			// console, adicionando uma mensagem informativa.)
			System.out.println("Resposta GPT: " + extractedResponse);
		} else {
			System.out.println("Resposta não encontrada.");
		}
	}
}

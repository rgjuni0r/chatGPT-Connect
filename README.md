# chatGPT-Connect
MODELO DE CONEXÃO VIA API COM CHATGPT
Este repositório contém um exemplo de código em Java que demonstra como estabelecer uma conexão com a API do ChatGPT e obter uma resposta gerada pelo modelo GPT-3.5-turbo.

DESCRIÇÃO DO CÓDIGO
  - O código é uma implementação simples que utiliza bibliotecas nativas do Java para realizar a conexão HTTP com a API do ChatGPT. Ele permite enviar uma solicitação para a API, receber a resposta e extrair o conteúdo desejado.

  - O programa inicia importando as bibliotecas necessárias para lidar com a leitura de dados de entrada, saída de dados, conexão HTTP e manipulação de URLs.

  - Em seguida, o código define duas constantes: apiUrl, que contém o endereço da API do ChatGPT, e apiKey, que representa a chave de API necessária para autenticação.

  - Dentro do método main, o código cria uma instância de URL utilizando o valor de apiUrl. Em seguida, abre uma conexão HTTP com a URL por meio de um objeto HttpURLConnection. A solicitação é configurada com o método POST, o cabeçalho Content-Type é definido como "application/json; utf-8" e a autorização é configurada utilizando a chave de API.

  - Os parâmetros da solicitação são armazenados em variáveis, como o modelo do GPT, a entrada do usuário e o número máximo de tokens. O corpo da solicitação é montado em formato JSON, contendo esses parâmetros.

  - A solicitação é enviada para o servidor por meio do objeto OutputStream da conexão HTTP. Em seguida, é obtido o código de resposta HTTP da conexão e impresso na saída do console.

  - O código verifica se o código de resposta é diferente de 200, o que indica um erro na solicitação. Se for o caso, são exibidas mensagens de erro adequadas com base no código de resposta. Caso contrário, a resposta do servidor é lida e armazenada em um objeto StringBuilder.

  - A resposta é então manipulada para extrair o conteúdo desejado, utilizando índices para identificar a posição inicial e final do trecho de texto desejado no JSON. O conteúdo extraído é impresso na saída do console.

USO
  - Este código pode ser utilizado como ponto de partida para desenvolver aplicações que interagem com a API do ChatGPT. É importante lembrar que é necessário ter uma chave de API válida para autenticação.

AUTOR
  - O código foi desenvolvido por Rogério Moreira Alves Júnior em 17/06/2023 (BR-PT).

TÍTULO
  - MODELO DE CONEXÃO VIA API COM CHATGPT

MODELO
  - O código utiliza o modelo GPT-3.5-turbo do ChatGPT para gerar as respostas.

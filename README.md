# chatGPT-Connect
MODELO DE CONEXÃO VIA API COM CHATGPT
Este repositório contém um exemplo de código em Java que demonstra como estabelecer uma conexão com a API do ChatGPT e obter uma resposta gerada pelo modelo GPT-3.5-turbo.


# Descrição do Código
  - O código é uma implementação simples que utiliza bibliotecas nativas do Java para realizar a conexão HTTP com a API do ChatGPT. Ele permite enviar uma solicitação para a API, receber a resposta e extrair o conteúdo desejado.

  - O programa inicia importando as bibliotecas necessárias para lidar com a leitura de dados de entrada, saída de dados, conexão HTTP e manipulação de URLs.

  - Em seguida, o código define duas constantes: apiUrl, que contém o endereço da API do ChatGPT, e apiKey, que representa a chave de API necessária para autenticação.

  - Dentro do método main, o código cria uma instância de URL utilizando o valor de apiUrl. Em seguida, abre uma conexão HTTP com a URL por meio de um objeto HttpURLConnection. A solicitação é configurada com o método POST, o cabeçalho Content-Type é definido como "application/json; utf-8" e a autorização é configurada utilizando a chave de API.

  - Os parâmetros da solicitação são armazenados em variáveis, como o modelo do GPT, a entrada do usuário e o número máximo de tokens. O corpo da solicitação é montado em formato JSON, contendo esses parâmetros.

  - A solicitação é enviada para o servidor por meio do objeto OutputStream da conexão HTTP. Em seguida, é obtido o código de resposta HTTP da conexão e impresso na saída do console.

  - O código verifica se o código de resposta é diferente de 200, o que indica um erro na solicitação. Se for o caso, são exibidas mensagens de erro adequadas com base no código de resposta. Caso contrário, a resposta do servidor é lida e armazenada em um objeto StringBuilder.

  - A resposta é então manipulada para extrair o conteúdo desejado, utilizando índices para identificar a posição inicial e final do trecho de texto desejado no JSON. O conteúdo extraído é impresso na saída do console.

# Modelo
  - O código utiliza o modelo GPT-3.5-turbo do ChatGPT para gerar as respostas.
  - O modelo GPT-3.5-turbo é conhecido por sua capacidade avançada de processar linguagem natural e gerar respostas coesas e contextualmente relevantes. Ao utilizar esse modelo, o código proporciona uma experiência de conversação mais fluente e natural com o ChatGPT.

# Uso
  - Este código pode ser utilizado como ponto de partida para desenvolver aplicações que interagem com a API do ChatGPT. É importante lembrar que é necessário ter uma chave de API válida para autenticação.

# Informativo sobre os Tokens do ChatGPT
O ChatGPT é um modelo de linguagem poderoso desenvolvido pela OpenAI que usa uma abordagem baseada em tokens para processar texto. Compreender como os tokens funcionam é fundamental para aproveitar ao máximo o modelo. Aqui estão algumas informações importantes sobre os tokens do ChatGPT:

  - Definição de Token: Em termos simples, um token é uma unidade de texto. Pode representar um único caractere, uma palavra ou até mesmo uma parte de uma palavra, dependendo do treinamento do modelo.

  - Limite de Tokens: O ChatGPT tem um limite máximo de 4096 tokens para cada solicitação. Isso inclui tanto a entrada (texto fornecido ao modelo) quanto a saída (resposta gerada pelo modelo). Se um texto exceder esse limite, será necessário reduzi-lo ou dividir em partes menores para processá-lo corretamente.

  - Contagem de Tokens: Ao trabalhar com o ChatGPT, é importante monitorar a contagem de tokens para evitar ultrapassar o limite máximo. É possível usar bibliotecas como a OpenAI's tiktoken para verificar a contagem de tokens antes de enviar uma solicitação ao modelo.

  - Custos de Tokens: Ao utilizar a API do ChatGPT, você será cobrado com base na quantidade de tokens utilizados em suas solicitações. Isso inclui tanto os tokens de entrada quanto os tokens de saída. Portanto, é essencial otimizar o uso de tokens para controlar os custos e garantir uma experiência eficiente.

  - Tokens Especiais: O ChatGPT utiliza tokens especiais para fornecer instruções ou orientações ao modelo. Por exemplo, o token <s> pode ser usado para marcar o início do texto de entrada, e o token </s> para marcar o final. Ao fornecer instruções claras e relevantes ao modelo, você pode obter resultados mais precisos.

Ao compreender esses aspectos dos tokens no ChatGPT, você estará melhor equipado para usar o modelo de forma eficaz e aproveitar ao máximo suas capacidades de processamento de texto.

# Informativo sobre o Limite de Envio de Texto na API do OpenAI
A API do OpenAI é uma plataforma que permite a interação com modelos de linguagem avançados, como o ChatGPT, de forma programática. No entanto, há um limite no tamanho do texto que pode ser enviado para a API em uma única chamada. Aqui estão algumas informações importantes sobre o limite de envio de texto:

  - Limite de Tokens: O limite de envio de texto é baseado na contagem de tokens. Um token pode ser tão curto quanto um caractere ou tão longo quanto uma palavra ou parte de uma palavra, dependendo do treinamento do modelo. O ChatGPT, por exemplo, tem um limite máximo de 4096 tokens por solicitação.

  - Texto de Entrada e de Saída: O limite de tokens se aplica tanto ao texto de entrada fornecido ao modelo quanto ao texto de saída retornado pela API. Isso significa que o tamanho do texto de entrada e o tamanho do texto de saída devem ser considerados ao fazer chamadas para a API.

  - Cálculo da Contagem de Tokens: Para determinar o número de tokens em um texto, você pode usar bibliotecas como a OpenAI's tiktoken para realizar essa contagem antes de enviar uma solicitação à API. Essa verificação prévia pode ajudar a evitar ultrapassar o limite de tokens e ajustar o texto conforme necessário.

  - Custos e Eficiência: Lembre-se de que o uso de mais tokens em uma solicitação pode resultar em um custo mais alto e em tempos de resposta mais longos. É recomendável otimizar o uso de tokens, removendo partes desnecessárias do texto ou dividindo-o em várias chamadas, se necessário.

  - Truncagem e Divisão de Texto: Se o texto exceder o limite máximo de tokens, é necessário fazer ajustes. A truncagem envolve a remoção de partes do texto para que ele se encaixe no limite, mas isso pode afetar a coerência do resultado. A divisão do texto em partes menores pode ser uma alternativa quando a truncagem não é adequada.

Certifique-se de consultar a documentação oficial da OpenAI para obter informações mais detalhadas sobre o limite de envio de texto na API. Isso ajudará você a compreender os detalhes específicos do modelo que está utilizando e a aproveitar ao máximo a plataforma.

# Autor
  - O código foi desenvolvido por Rogério Moreira Alves Júnior em 17/06/2023 (BR-PT).


# Título
  - MODELO DE CONEXÃO VIA API COM CHATGPT


# Sobre o Autor
- Olá! Meu nome é Rogério Moreira Alves Júnior, estudei Engenharia Mecânica (2019 a 2022) na Universidade Federal de Santa Maria, RS, e atualmente sou graduando em Engenharia Elétrica, pela Universidade Federal de Goiás, GO. Tenho paixão por desenvolvimento de programas computacionais, automação e robótica.

- Durante minha jornada acadêmica, tive a oportunidade de participar de diversos projetos de pesquisa e desenvolvimento, incluindo a elaboração de sistemas de automação utilizando Arduino, o estudo de modelos matemáticos para mensuração da competitividade da geração distribuída no Brasil e a construção de um protótipo de veículo off-road para competições promovidas pela SAE Brasil.

- Participei do Núcleo de Inovação e Competitividade (NIC), onde desenvolvi pesquisas de alto nível voltadas para soluções de gestão empresarial. Além disso, fiz parte do Núcleo de Robótica Pequi Mecânico, onde contribuí para o desenvolvimento de robôs autônomos com plano corporal humano e sentidos humanos, onde conquistamos o 1° lugar e 2° lugar em duas categorias na Latin American Competition of Robotics (LARC).

- Tenho experiência na área de Engenharia Elétrica, especialmente em eficientização de iluminação e cálculo da fatura de energia elétrica. Também tenho publicações em conferências renomadas, como a International Conference on Production Research Americas (ICPR) e o Congresso Brasileiro de Energia Solar (CBENS).

Atualmente, meu foco é explorar a interação entre a Inteligência Artificial (IA) e a área de Engenharia. Neste repositório, compartilho um exemplo de código em Java que demonstra como estabelecer uma conexão com a API do ChatGPT e obter respostas geradas pelo modelo GPT-3.5-turbo. Espero que este projeto possa ser útil e inspirador para outros desenvolvedores interessados em explorar o potencial da inteligência artificial na área da Engenharia.

Fique à vontade para explorar o código e, se tiver alguma dúvida ou sugestão, não hesite em entrar em contato. Estou sempre em busca de novos desafios e oportunidades de aprendizado. Vamos construir juntos!

# Contato
- Email: rogeriojr.alves@gmail.com
- Currículo Lattes: http://lattes.cnpq.br/9584593678476487

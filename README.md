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


# Uso
  - Este código pode ser utilizado como ponto de partida para desenvolver aplicações que interagem com a API do ChatGPT. É importante lembrar que é necessário ter uma chave de API válida para autenticação.


# Autor
  - O código foi desenvolvido por Rogério Moreira Alves Júnior em 17/06/2023 (BR-PT).


# Título
  - MODELO DE CONEXÃO VIA API COM CHATGPT


# Modelo
  - O código utiliza o modelo GPT-3.5-turbo do ChatGPT para gerar as respostas.
  - O modelo GPT-3.5-turbo é conhecido por sua capacidade avançada de processar linguagem natural e gerar respostas coesas e contextualmente relevantes. Ao utilizar esse modelo, o código proporciona uma experiência de conversação mais fluente e natural com o ChatGPT.


# Sobre o Autor
- Rogério Moreira Alves Júnior estudou Engenharia Mecânica pela Universidade Federal de Santa Maria, Rio Grande do Sul (2019-2022) e atualmente é graduando em Engenharia Elétrica pela Universidade de Goiás, Goiânia (2022). Possui uma sólida experiência nas áreas de Engenharia Mecânica e Engenharia Elétrica, com ênfase no desenvolvimento de programas computacionais.

  - Possui experiência em elaboração de sistemas de automação utilizando Arduino e participou ativamente do grupo de pesquisa Núcleo de Inovação e Competitividade (NIC) de 2021 a 2022. O NIC tem como objetivo desenvolver pesquisas de alto nível focadas em soluções para problemas de gestão enfrentados por empresas.
  - Além disso, Rogério participou de projetos de pesquisa com foco no desenvolvimento de conteúdo técnico-gerencial, por meio de modelos matemáticos para mensuração da competitividade da geração distribuída no Brasil nos âmbitos empresarial, estrutural e sistêmico.
  - Participou do Projeto BAJA SAE, pela UFSM, que visa a construção de um protótipo de um veículo off-road testado em competições promovidas pela SAE Brasil.
  - Rogério é um desenvolvedor experiente, tendo trabalhado em diversos projetos relacionados à Engenharia Elétrica. Desenvolveu programas computacionais abordando temas como eficientização de iluminação e cálculo da fatura de energia elétrica para consumidores do Grupo B, com o objetivo de auxiliar na tomada de decisão.
  - Possui publicações recentes de alto impacto em conferências renomadas, como International Conference on Production Research Americas (ICPR), 14th Seminar on Power Electronics and Control (SEPOC), Congresso Brasileiro de Energia Solar (CBENS) e Jornada Acadêmica Integrada (JAI - UFSM).
  - Participou do Núcleo de Robótica Pequi Mecânico da Universidade Federal de Goiás, onde contribuiu para o desenvolvimento de robôs autônomos com plano corporal humano e sentidos humanos, conquistando o 1° lugar e 2° lugar em duas categorias na Latin American Competition of Robotics (LARC), demonstrando sua habilidade e conquistas na área da robótica.
  
- A contribuição de Rogério Moreira Alves Júnior nesse projeto reflete sua expertise nas áreas de Engenharia Mecânica, Engenharia Elétrica e desenvolvimento de programas computacionais, enriquecendo a implementação e fornecendo uma solução robusta e eficiente para a conexão com a API do ChatGPT.

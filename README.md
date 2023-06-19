# Rápido Linense

O Rápido Linense é um aplicativo que fornece informações sobre os horários de ônibus da linha Linense. Com ele, você pode consultar os horários de partida e chegada, verificar as rotas disponíveis e muito mais.

## Funcionalidades

- Consulta de horários de ônibus
- Exibição das rotas disponíveis
- Informações sobre os horários de partida e chegada
- Interface fácil de usar

## Tecnologias utilizadas

Java: A linguagem de programação oficial do Android. É amplamente utilizada para desenvolver aplicativos nativos do Android e interagir com a API do Android.

Kotlin: Uma linguagem de programação moderna para o desenvolvimento de aplicativos Android. Ela é totalmente compatível com o Java e oferece recursos adicionais, como segurança de tipo melhorada, código conciso e suporte a programação funcional.

HTML/CSS/JavaScript: Essas linguagens são usadas para desenvolver a interface do usuário do aplicativo WebView. O HTML é usado para estruturar o conteúdo da página, o CSS é utilizado para estilizar a aparência e o JavaScript adiciona interatividade e funcionalidade à página.

XML: É uma linguagem de marcação utilizada para definir a estrutura e a aparência da interface do usuário no Android, como layouts de tela, elementos visuais e recursos.                                                                                                                                                          

## Como executar o aplicativo

1. Faça o download do projeto do aplicativo Rápido Linense em seu computador.
2. Abra o Android Studio e importe o projeto.
3. Certifique-se de ter configurado corretamente o ambiente de desenvolvimento do Android.
4. Navegue até o arquivo MainActivity.java no projeto.
5. Dentro do método onCreate, localize o trecho de código onde a WebView é inicializada.
6. Altere o URL da WebView para o caminho local do arquivo index.html em seu projeto. Por exemplo:

webView.loadUrl("file:///android_asset/index.html");

7. Execute o aplicativo em um dispositivo Android ou em um emulador.
## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão, sinta-se à vontade para abrir uma [issue](https://github.com/Jacker-s/Rapido-Linense)) ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença [MIT](https://raw.githubusercontent.com/Jacker-s/Rapido-Linense/main/LICENSE).

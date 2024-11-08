Neste desafio, foi realizado um diagrama UML com a diagramação das classes e interfaces utilizando o Mermaid, com base no vídeo de lançamento do iPhone de 2007.
Funcionalidades que foram modeladas:
- Reprodutor Musical
Métodos: tocar(), pausar(), selecionarMusica(String musica)
- Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
- Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()


```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    ReprodutorMusical <|-- iPhone
    AparelhoTelefonico <|-- iPhone
    NavegadorInternet <|-- iPhone

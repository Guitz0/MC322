Projeto MC322 - Roguelike Deckbuilder

Este projeto foi desenvolvido como parte dos laboratórios da disciplina MC322 - Programação Orientada a Objetos.
O objetivo é implementar um jogo inspirado em Slay the Spire, no qual o jogador utiliza um baralho de cartas para derrotar inimigos em batalhas por turno.
O projeto foi desenvolvido em Java e executado via terminal.
Estrutura do Projeto

O projeto segue a estrutura padrão criada pelo VSCode para projetos Java:

    .
    ├─ src/
    │  ├─ App.java
    │  ├─ Heroi.java
    │  ├─ Inimigo.java
    │  ├─ Carta.java
    │  ├─ CartaDano.java
    │  ├─ CartaEscudo.java
    │  └─ ...
    ├─ lib/
    ├─ bin/
    └─ README.md


Onde:

    src — contém todos os arquivos .java do projeto
    lib — pasta reservada para dependências externas (não utilizada neste projeto)
    bin — arquivos .class gerados após a compilação

Como Compilar o Projeto

No diretório raiz do projeto, execute:
javac -d bin $(find src -name "*.java")
Esse comando compila todos os arquivos .java dentro da pasta src e coloca os arquivos compilados (.class) na pasta bin.

Como Executar o Projeto

Após compilar, execute:
java -cp bin App
Isso iniciará o programa e o sistema de combate será executado no terminal.

Como Jogar

Durante o combate:
  
    No início de cada turno, voce pode atacar ou usar um escudo
    Cada carta possui um custo de energia
    O jogador pode usar cartas enquanto tiver energia disponível
    Ao final do turno do jogador, os inimigos realizam suas ações

O combate termina quando:

    o herói é derrotado, ou
    todos os inimigos são derrotados

Tecnologias Utilizadas

    Java 25
    Visual Studio Code
    Git e GitHub

Autores

Projeto desenvolvido por:

    Primeiro Guilherme Silva de Paula, RA 115832


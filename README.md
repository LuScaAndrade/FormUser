# Form User
# Aplicação CRUD para Cadastro de Usuários

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) simples para cadastro de usuários utilizando a linguagem Java. O sistema permite gerenciar usuários por meio de um menu interativo no console, incluindo operações de inserção, atualização, exclusão e visualização de informações de usuários.

## 📝 Funcionalidades

- **Criar Usuário:** Permite adicionar novos usuários ao sistema.
- **Ler Usuário:** Verifica e exibe informações de um usuário específico.
- **Atualizar Usuário:** Edita as informações de um usuário existente.
- **Deletar Usuário:** Remove um usuário da lista de usuários cadastrados.

## 🚀 Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Eclipse/IntelliJ IDEA**: IDEs recomendadas para desenvolvimento.
- **JDK 8 ou superior**: Java Development Kit.

## 📦 Estrutura do Projeto

O projeto está dividido em três pacotes principais:

- **`entities`**: Contém as classes de entidades principais, como `User` e `UserFunctions`.
  - `User`: Classe que representa um usuário, contendo atributos como `name`, `email`, `adress` e `number`.
  - `UserFunctions`: Classe que implementa as operações CRUD (Create, Read, Update, Delete) para gerenciar os usuários.

- **`application`**: Contém a classe principal (`Program`) que executa o programa e fornece um menu interativo para o usuário.

## 📚 Pré-requisitos

Certifique-se de ter os seguintes itens instalados em seu ambiente de desenvolvimento:

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- Uma IDE como [Eclipse](https://www.eclipse.org/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## 🔧 Instalação e Execução

1. **Clone o repositório ou baixe o código fonte**

2. **Importe o projeto para sua IDE de preferência (Eclipse, IntelliJ, etc.).**

3. **Compile o código e execute a classe principal Program que está no pacote application.**

## 📄 Como Usar
Ao executar o programa, um menu será exibido no console com as seguintes opções:

1: Inserir novos usuários
2: Atualizar dados dos usuários
3: Excluir usuário
4: Verificar usuário
5: Finalizar programa
Insira o número da opção desejada e siga as instruções exibidas no console para gerenciar os usuários.

## 👥 Contribuição
Contribuições são sempre bem-vindas! Se você tiver alguma ideia de melhoria ou encontrar algum problema, sinta-se à vontade para abrir uma issue ou enviar um pull request.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.User;
import entities.UserFunctions;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int finish = 0;

		while (finish != 1) {

			// menu
			System.out.println("----------------------------------------------");
			System.out.println(
					"1- Inserir novos usuários\n2- Atualizar dados dos usuários\n3- Excluir usuário\n4- Verificar usuário\n5- Finalizar programa");
			System.out.println("----------------------------------------------");
			System.out.println("Insira o número da opção desejada: ");
			int options = sc.nextInt();

			switch (options) {
				case 1:
					// adicionar usuários
					System.out.println("Digite a quantidade de usuários que deseja inserir: ");
					int n = sc.nextInt();

					for (int i = 0; i < n; i++) {
						System.out.printf("\nInsira o nome da %dª pessoa: ", i + 1);
						sc.nextLine();
						String name = sc.nextLine();

						System.out.println("Insira o email: ");
						String email = sc.nextLine();

						System.out.println("Insira o Endereço da pessoa: ");
						String adress = sc.nextLine();

						System.out.println("Insira o número de telefone da pessoa: ");
						Long num = sc.nextLong();

						UserFunctions.createUser(new User(name, email, adress, num));

					}

					break;
				case 2:
					System.out.println("Insira o nome do usuário que deseja atualizar o cadastro: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Insira o novo nome de usuário: ");
					String name1 = sc.nextLine();

					System.out.println("Insira o novo email: ");
					String email = sc.nextLine();

					System.out.println("Insira o novo endereço: ");
					String adress = sc.nextLine();

					System.out.println("Insira o novo número de telefone: ");
					Long number = sc.nextLong();

					UserFunctions.updateUser(name, name1, email, adress, number);
					break;
				case 3:
					// Excluir usuário
					System.out.println("Insira o nome do usuário que deseja excluir da lista: ");
					sc.nextLine();
					name = sc.nextLine();
					UserFunctions.delUser(name);

					break;
				case 4:
					// Verificar o usuário
					System.out.println("Insira o nome do usuário que deseja verificar: ");
					sc.nextLine();
					name = sc.nextLine();
					UserFunctions.verifyUser(name);
					break;

				case 5:
					// finalizar programa
					System.out.println("Programa finalizado!");
					finish++;
					System.exit(0);
					break;

				default:
					System.out.println("Opção Inválida! Digite outra opção: ");
					options = sc.nextInt();
					break;
			}
		}

		sc.close();
	}
}
package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE_BOLD);
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("       A & J Papelaria Personalizada         ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("      1 - Criar Produto                      ");
			System.out.println("      2 - Listar todos as Produtos           ");
			System.out.println("      3 - Buscar Produto por Numero          ");
			System.out.println("      4 - Atualizar Dados da Produto         ");
			System.out.println("      5 - Apagar Produto                     ");
			System.out.println("      0 - Sair                               ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("Entre com a opção desejada:                  ");
			System.out.println("                                             " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 9");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_PURPLE_BOLD
						+ "\nA & J Papelaria Personalizada - Sua papelaria geek, do jeitinho mais fofo." + Cores.TEXT_RESET);
				sobre();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Criar Produto\n" + Cores.TEXT_RESET);

				

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Listar Produtos\n" + Cores.TEXT_RESET);

				

				keyPress();
				break;
			case 3:
				System.out.println(
						Cores.TEXT_PURPLE_UNDERLINED + "Consultar dados da Produto - por número\n" + Cores.TEXT_RESET);

				

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Atualizar dados da Produto\n" + Cores.TEXT_RESET);

				
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Apagar a Produto\n" + Cores.TEXT_RESET);

				

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida!" + Cores.TEXT_RESET);

				keyPress();
				break;

			}
		}

	}
	
	public static void sobre() {

		System.out.println(Cores.TEXT_PURPLE_BOLD + "\n*~*~**~*~**~*~**~*~**~*~**~*~**~*~**~*~**~*~*~*~*");
		System.out.println("Projeto Desenvolvido por ");
		System.out.println("Andressa Regina Funes - andressafunes92@gmail.com");
		System.out.println("https://github.com/andressafunes");
		System.out.println("*~*~**~*~**~*~**~*~**~*~**~*~**~*~**~*~**~*~**~*~*" + Cores.TEXT_RESET);

	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPrecione Enter para continuar...");
		leia.nextLine();
	}

}

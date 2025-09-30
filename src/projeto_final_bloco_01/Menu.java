package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.controller.PapelariaController;
import projeto_final_bloco_01.model.Acessorios;
import projeto_final_bloco_01.model.CadernoAgenda;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	
	private static final PapelariaController papelariaController = new PapelariaController();

	public static void main(String[] args) {
				
		int opcao;
		
		criarprodutoTeste();

		while (true) {

			System.out.println(Cores.TEXT_PURPLE_BOLD);
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("       A & J Papelaria Personalizada         ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("      1 - Cadastrar Produto                  ");
			System.out.println("      2 - Listar Todos os produtos           ");
			System.out.println("      3 - Buscar Produto por ID              ");
			System.out.println("      4 - Buscar Produto por Nome            ");
			System.out.println("      5 - Atualizar Dados do Produto         ");
			System.out.println("      6 - Apagar Produto                     ");
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
				System.out.println(Cores.TEXT_RED_BOLD
						+ "\nDigite um número inteiro entre 0 e 6");
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
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Cadastrar novo produto\n" + Cores.TEXT_RESET);

				cadastrarProduto();

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Listar produtos\n" + Cores.TEXT_RESET);

				listarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println(
						Cores.TEXT_PURPLE_UNDERLINED + "Consultar dados do produto - por ID\n" + Cores.TEXT_RESET);

				buscarProdutoPorId();

				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Buscar por Nome" + Cores.TEXT_RESET);

				procurarPorNome();

				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Atualizar dados do produto\n" + Cores.TEXT_RESET);

				atualizarProduto();
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Apagar o produto\n" + Cores.TEXT_RESET);

				apagarProduto();

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
		System.out.println(Cores.TEXT_PURPLE_BOLD + "\n\nPrecione Enter para continuar...");
		leia.nextLine();
	}
	
	public static void criarprodutoTeste() {
		papelariaController
				.cadastrar(new CadernoAgenda(papelariaController.gerarId(), "Naruto", 1, 1, 20, 35.00f, 200, 1));
		papelariaController.cadastrar(new Acessorios(papelariaController.gerarId(),"Controle PS2", 2, 3, 15, 2.50f, 1, 1));
	}
	
	private static void cadastrarProduto() {

		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite a categoria do produto (1 - CADERNO/AGENDA | 2 - ACESSÓRIO): ");
		int categoria = leia.nextInt();
		
		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o tema do produto (1 - ANIMES | 2 - DORAMAS | 3 - GAMES): ");
		int tema = leia.nextInt();

		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o nome do produto: ");
		leia.skip("\\R");
		String nome = leia.nextLine();

		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o preço do produto: ");
		float preco = leia.nextFloat();

		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite a quantidade de produto em estoque: ");
		int estoque = leia.nextInt();

		switch (categoria) {
		case 1 -> {
			
			System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o número de páginas: ");
			int numeroDePaginas = leia.nextInt();
			leia.nextLine();
			
			System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o tipo de encadernação (1 - ESPIRAL | 2 - WIREO | 3 - BROCHURA): ");
			int tipoEncadernacao = leia.nextInt();
			leia.nextLine();
			
			papelariaController
					.cadastrar(new CadernoAgenda(papelariaController.gerarId(),nome, categoria, tema, estoque, preco, numeroDePaginas, tipoEncadernacao));

		}

		case 2 -> {

			System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o tipo (1 - ADESIVO | 2 - BOTTON | 3 - CHAVEIRO): ");
			int tipo = leia.nextInt();
			leia.nextLine();
			
			System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite a categoria (1 - REDONDO | 2 - QUADRADO | 3 - FLOR): ");
			int formato = leia.nextInt();
			leia.nextLine();
			papelariaController
					.cadastrar(new Acessorios(papelariaController.gerarId(), nome, categoria, tema, estoque, preco, tipo, formato));

		}
		default -> System.out.println(Cores.TEXT_RED_BOLD + "Tipo de produto inválido!" + Cores.TEXT_RESET);
		}
	}
	
	private static void listarProdutos() {
		papelariaController.listar();
	}
	
	private static void buscarProdutoPorId() {
		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o ID do produto: ");
		int id = leia.nextInt();
		leia.nextLine();
		papelariaController.buscarPorId(id);

	}
	
	private static void atualizarProduto() {
		
		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digite o ID do produto que deseja atualizar: ");
		int id = leia.nextInt();
		leia.nextLine();

		Produto produto = papelariaController.buscarNaCollection(id);

		if (produto != null) {
			String nome = produto.getNome();
			int categoria = produto.getCategoria();
			int tema = produto.getTema();
			float preco = produto.getPreco();
			int estoque = produto.getEstoque();
			
			System.out.printf(Cores.TEXT_PURPLE_BOLD +"O nome atual do produto é %s\nNovo nome (Precione Enter para manter o nome atual): ",
					nome);
			String entrada = leia.nextLine();
			nome = entrada.isEmpty() ? nome : entrada;

			System.out.printf(Cores.TEXT_PURPLE_BOLD +"O valor atual do produto é %.2f\nNovo valor (Precione Enter para manter o nome atual): ",
					preco);
			entrada = leia.nextLine();
			preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada);

			System.out.printf(Cores.TEXT_PURPLE_BOLD +
					"A quantidade atual de produto no estoque é %d\nNova quantidade (Precione Enter para manter o nome atual): ",
					estoque);
			entrada = leia.nextLine();
			estoque = entrada.isEmpty() ? estoque : Integer.parseInt(entrada);

			switch (categoria) {

			case 1 -> {

				int numeroDePaginas = ((CadernoAgenda) produto).getNumeroDePaginas();
				int tipoEncadernacao = ((CadernoAgenda) produto).getTipoEncadernacao();

				System.out.printf(Cores.TEXT_PURPLE_BOLD +"O número de paginas atual do produto é %s\nNovo número de páginas (Precione Enter para manter o nome atual): ", numeroDePaginas);
				entrada = leia.nextLine();
				numeroDePaginas = entrada.isEmpty() ? numeroDePaginas : Integer.parseInt(entrada);
				
				System.out.printf(Cores.TEXT_PURPLE_BOLD +"O tipo de encadernação atual do produto é %s\nNovo tipo de encadernação (Precione Enter para manter o nome atual): ", tipoEncadernacao);
				entrada = leia.nextLine();
				tipoEncadernacao = entrada.isEmpty() ? tipoEncadernacao : Integer.parseInt(entrada);
				papelariaController.atualizar(new CadernoAgenda(id,nome, categoria, tema, estoque, preco, numeroDePaginas, tipoEncadernacao));

			}

			case 2 -> {

				int tipo = ((Acessorios) produto).getTipo();
				int formato = ((Acessorios) produto).getFormato();

				System.out.printf(Cores.TEXT_PURPLE_BOLD +"O tipo atual do produto é %s\nNovo tipo (Precione Enter para manter o nome atual): ", tipo);
				entrada = leia.nextLine();
				tipo = entrada.isEmpty() ? tipo : Integer.parseInt(entrada);
				
				System.out.printf(Cores.TEXT_PURPLE_BOLD +"O formato atual do produto é %s\nNovo formato (Precione Enter para manter o nome atual): ", formato);
				entrada = leia.nextLine();
				formato = entrada.isEmpty() ? formato : Integer.parseInt(entrada);
				papelariaController
						.atualizar(new Acessorios(id, nome, categoria, tema, estoque, preco, tipo, formato));


			}

			default -> System.out.println(Cores.TEXT_RED + "Tipo de produto inválido!" + Cores.TEXT_RESET);

			}

		} else {
			System.out.printf(Cores.TEXT_RED_BOLD +"\nO produto de ID %d não foi encontrado!", id);
		}
	}
	
	private static void apagarProduto() {
		System.out.print(Cores.TEXT_PURPLE_BOLD +"Digito o ID do produto que deseja apagar: ");
		int id = leia.nextInt();
		leia.nextLine();

		Produto produto = papelariaController.buscarNaCollection(id);

		if (produto != null) {
			System.out.print(Cores.TEXT_RED_BOLD +"\nTem certeza que deseja excluir esse produto? (S/N): ");
			String confirmacao = leia.nextLine();

			if (confirmacao.equalsIgnoreCase("S")) {
				papelariaController.apagar(id);
			} else {

				System.out.println(Cores.TEXT_PURPLE_BOLD +"\nOperação cancelada!");
			}
		} else {
			System.out.printf(Cores.TEXT_RED_BOLD +"\nO produto de ID %d não foi encontrado!", id);
		}
	}
	
	private static void procurarPorNome() {
		
		System.out.print(Cores.TEXT_PURPLE_BOLD + "\nDigite o nome do produto: ");
		String nome = leia.nextLine();
		
		papelariaController.listarPorNome(nome);
	}

}

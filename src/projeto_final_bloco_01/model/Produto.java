package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public abstract class Produto {

	private int id;
	private String nome;
	private int categoria;
	private int tema;
	private int estoque;
	private float preco;

	public Produto(int id, String nome, int categoria, int tema, int estoque, float preco) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.tema = tema;
		this.estoque = estoque;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getTema() {
		return tema;
	}

	public void setTema(int tema) {
		this.tema = tema;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizador() {

		String categoria = "";

		switch (this.categoria) {
		case 1 -> categoria = "Cadernos/Agendas";
		case 2 -> categoria = "Acessorios";
		default -> categoria = "Desconhecido";
		}
		
		String tema = "";

		switch (this.tema) {
		case 1 -> tema = "Animes";
		case 2 -> tema = "Doramas";
		case 3 -> tema = "Games";
		default -> tema = "Desconhecido";
		}

		System.out.println(Cores.TEXT_PURPLE_BOLD);
		System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println("*~*~*~*~*  Dados do Produto *~*~*~*~*");
		System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println("Código do Produto: " + this.id);
		System.out.printf("Categoria do Produto: %s%n", categoria);
		System.out.printf("Tema do Produto: %s%n", tema);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.printf("Valor: R$ %.2f%n", this.preco);
		System.out.printf("Quantidade em estoque: %d%n", this.estoque);

	}

}

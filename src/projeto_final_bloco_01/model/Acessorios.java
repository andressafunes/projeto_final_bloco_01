package projeto_final_bloco_01.model;


public class Acessorios extends Produto{
	
	private int tipo;
	private int formato;

	public Acessorios(int id, String nome, int categoria, int tema, int estoque, float preco, int tipo, int formato) {
		super(id, nome, categoria, tema, estoque, preco);
		this.tipo = tipo;
		this.formato = formato;
		
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}
	
	public void visualizador(){
		super.visualizador();
		
		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Adesivos";
		case 2 -> tipo = "Bottons";
		case 3 -> tipo = "Chaveiros";
		default -> tipo = "Desconhecido";
		}
		
		String formato = "";

		switch (this.formato) {
		case 1 -> formato = "Redondo";
		case 2 -> formato = "Quadrado";
		case 3 -> formato = "Flor";
		default -> formato = "Desconhecido";
		}
		
		
		System.out.printf("Tipo: %s%n", tipo);
		System.out.printf("Formato: %s%n", formato);
		
	}

}

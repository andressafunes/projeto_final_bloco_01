package projeto_final_bloco_01.model;


public class CadernoAgenda extends Produto {
	
	private int numeroDePaginas;
	private int tipoEncadernacao;

	public CadernoAgenda(int id, String nome, int encadernacao, int tema, int estoque, float preco, int numeroDePaginas, int tipoEncadernacao) {
		super(id, nome, encadernacao, tema, estoque, preco);
		this.numeroDePaginas = numeroDePaginas;
		this.tipoEncadernacao = tipoEncadernacao;
		
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public int getTipoEncadernacao() {
		return tipoEncadernacao;
	}

	public void setTipoEncadernacao(int tipoEncadernacao) {
		this.tipoEncadernacao = tipoEncadernacao;
	}
	
	public void visualizador(){
		super.visualizador();
		
		String tipoEncadernacao = "";

		switch (this.tipoEncadernacao) {
		case 1 -> tipoEncadernacao = "Espiral";
		case 2 -> tipoEncadernacao = "Weri-O";
		case 3 -> tipoEncadernacao = "Brochura";
		default -> tipoEncadernacao = "Desconhecido";
		}
		
		
		System.out.println("Número de páginas: " + this.numeroDePaginas );
		System.out.printf("Tipo de encadernação: %s%n", tipoEncadernacao);
	}

}

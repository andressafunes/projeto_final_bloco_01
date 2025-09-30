package projeto_final_bloco_01.repository;


import projeto_final_bloco_01.model.Produto;

public interface PapelariaRepository {
	
	public void cadastrar (Produto produto);
	public void listar ();
	public void buscarPorId (int id);
	public void atualizar (Produto produto);
	public void apagar (int id);
	public void listarPorNome(String titular);

}

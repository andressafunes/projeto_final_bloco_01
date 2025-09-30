package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.PapelariaRepository;
import projeto_final_bloco_01.util.Cores;

public class PapelariaController implements PapelariaRepository {

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void cadastrar(Produto produto) {
		
		listaProdutos.add(produto);
		System.out.println(Cores.TEXT_PURPLE_BOLD + "\nProduto cadastrado com sucesso!!");

	}

	@Override
	public void listar() {
		
		for (var produto : listaProdutos) {
			produto.visualizador();
		}

	}

	@Override
	public void buscarPorId(int id) {
		
		var produto = buscarNaCollection(id);

		if (produto != null) {
			produto.visualizador();
		} else {
			System.out.printf(Cores.TEXT_RED_BOLD + "\nO produto número %d não foi encontrado!%n", id);
		}

	}

	@Override
	public void atualizar(Produto produto) {
		
		var buscarProduto = buscarNaCollection(produto.getId());

		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.printf(Cores.TEXT_PURPLE_BOLD + "\nO produto número %d foi atualizado com sucesso!%n", produto.getId());
		} else {
			System.out.printf(Cores.TEXT_RED_BOLD + "\nO produto número %d não foi encontrado!%n", produto.getId());
		}

	}

	@Override
	public void apagar(int id) {

		var produto = buscarNaCollection(id);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.printf(Cores.TEXT_PURPLE_BOLD + "\nO produto número %d foi deletado com sucesso!%n", id);
			}
		} else {
			System.out.printf(Cores.TEXT_RED_BOLD + "\nO produto número %d não foi encontrado!%n", id);
		}

	}

	// Metodos Auxiliares

	public int gerarId() {
		return ++id;
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

}

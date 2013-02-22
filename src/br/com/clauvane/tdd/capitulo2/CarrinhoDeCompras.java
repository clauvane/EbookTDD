package br.com.clauvane.tdd.capitulo2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> listaProduto;
	
	public CarrinhoDeCompras() {
		listaProduto = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto){
		listaProduto.add(produto);
	}
	
	public List<Produto> getProdutos(){
		return listaProduto;
	}
	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
}

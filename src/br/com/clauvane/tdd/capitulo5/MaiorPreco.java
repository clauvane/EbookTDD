package br.com.clauvane.tdd.capitulo5;

public class MaiorPreco {

	public double encontra(CarrinhoDeCompras carrinho) {
		if (carrinho.getItens().size() == 0)
			return 0;
		double maior = carrinho.getItens().get(0).getValorTotal();
		for (Item item : carrinho.getItens()) {
			if (maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}
		return maior;
	}

}

package br.com.clauvane.tdd.capitulo5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {
	CarrinhoDeComprasBuilder carrinhoBuilder;
	
	@Before
	public void iniciazar(){
		carrinhoBuilder = new CarrinhoDeComprasBuilder();
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinhoBuilder.cria().maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinhoBuilder.comItens(new double[]{900});
		assertEquals(900.0, carrinhoBuilder.cria().maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinhoBuilder.comItens(new double[]{1500,750});
		assertEquals(1500.0, carrinhoBuilder.cria().maiorValor(), 0.0001);
	}
}

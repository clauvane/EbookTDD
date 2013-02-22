package br.com.clauvane.tdd.capitulo8;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeradorDeNotaFiscalTest {
	@Test
	public void deveGerarNFComValorDeImpostoDescontado() {
		NFDao dao = Mockito.mock(NFDao.class);
		Sap sap = Mockito.mock(Sap.class);
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao,sap);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		assertEquals(1000 * 0.94, nf.getValor(), 0.0001);
	}

	@Test
	public void devePersistirNFGerada() {
		NFDao dao = Mockito.mock(NFDao.class);
		Sap sap = Mockito.mock(Sap.class);
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao,sap);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		Mockito.verify(dao).persiste(nf);
	}

	@Test
	public void deveEnviarNFGeradaParaSAP() {
		NFDao dao = Mockito.mock(NFDao.class);
		Sap sap = Mockito.mock(Sap.class);
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao, sap);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		Mockito.verify(sap).envia(nf);
	}

}

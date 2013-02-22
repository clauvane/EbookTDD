package br.com.clauvane.tdd.capitulo8;

import java.util.Calendar;

public class GeradorDeNotaFiscal {

	private NFDao dao;
	private final Sap sap;
	
	public GeradorDeNotaFiscal(NFDao dao,Sap sap) {
		this.dao = dao;
		this.sap = sap;
	}

	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(),
				pedido.getValorTotal() * 0.94, Calendar.getInstance());
		dao.persiste(nf);
		sap.envia(nf);
		return nf;
	}

	public NFDao getDao() {
		return dao;
	}

	public void setDao(NFDao dao) {
		this.dao = dao;
	}

	public Sap getSap() {
		return sap;
	}

}

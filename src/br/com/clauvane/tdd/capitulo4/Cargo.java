package br.com.clauvane.tdd.capitulo4;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()), 
	DBA(new QuinzeOuVinteCincoPorCento()),
	TESTADOR(new QuinzeOuVinteCincoPorCento());
	
	private final RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}

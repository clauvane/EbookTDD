package br.com.clauvane.tdd.capitulo4;

public abstract class RegraDeCalculo {
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > limite()) {
			return funcionario.getSalario() * porcentagemAcimaDoLimite();
		}
		return funcionario.getSalario() * porcentagemBase();
	}

	protected abstract int limite();

	protected abstract double porcentagemAcimaDoLimite();

	protected abstract double porcentagemBase();
}

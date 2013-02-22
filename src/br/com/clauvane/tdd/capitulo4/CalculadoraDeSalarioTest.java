package br.com.clauvane.tdd.capitulo4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraDeSalarioTest {
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0,
				Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("rafael ponte", 4000.0,
				Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario dba = new Funcionario("jucelino", 500.0,
				Cargo.DBA);
		double salario = calculadora.calculaSalario(dba);
		assertEquals(500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario testador = new Funcionario("jean", 5000.0,
				Cargo.TESTADOR);
		double salario = calculadora.calculaSalario(testador);
		assertEquals(5000.0 * 0.75, salario, 0.00001);
	}
}

package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EfetuarAtualizacaoTest {

	// teste utilizando técnica de percorrer os caminhos básicos
	@Test
	public void testaAtualizacaoDeContasComSelicDois() {
		double selic = 2.0;
		ContaCorrente conta1 = new ContaCorrente(1000);
		ContaCorrente conta2 = new ContaCorrente(2000);
		ContaCorrente conta3 = new ContaCorrente(3000);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		AtualizadorDeContas atualizador = new AtualizadorDeContas(selic);
		EfetuarAtualizacao atualizacao = new EfetuarAtualizacao(contas, atualizador);
		atualizacao.run();
		assertEquals(998, conta1.getSaldo(), 0.0001);
	}
	
	//teste utilizando técnica para percorrer todos os caminhos básicos
	@Test
	public void testaObtencaoTaxaSelicAtualAtualizador() {
		AtualizadorDeContas atualizador = new AtualizadorDeContas(2.0);
		assertEquals(2.0, atualizador.getSelic(), 0.0000001);
	}
	
	// teste utilizando técnica para percorrer todos os caminhos básicos
	@Test
	public void testaObtencaoListaContasEAtualizadorAtualizacao() {
		ContaCorrente conta1 = new ContaCorrente(1000);
		ContaCorrente conta2 = new ContaCorrente(2000);
		ContaCorrente conta3 = new ContaCorrente(3000);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		AtualizadorDeContas atualizador = new AtualizadorDeContas(2.0);
		EfetuarAtualizacao atualizacao = new EfetuarAtualizacao(contas, atualizador);
		assertEquals(3, atualizacao.getContas().size());
		assertEquals(atualizador, atualizacao.getAtualizador());
	}
	
	// teste utilizando técnica para percorrer todos os caminhos básicos e valores limites
	@Test
	public void testaObtencaoSaldoAtualAtualizadorComSelicIgualAZero() {
		ContaCorrente conta1 = new ContaCorrente(1000);
		ContaCorrente conta2 = new ContaCorrente(2000);
		ContaCorrente conta3 = new ContaCorrente(3000);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		AtualizadorDeContas atualizador = new AtualizadorDeContas(0);
		EfetuarAtualizacao atualizacao = new EfetuarAtualizacao(contas, atualizador);
		atualizacao.run();
		assertEquals(6000, atualizador.getSaldoTotal(), 0.00001);
	}
	
	// teste utilizando técnica para percorrer todos os caminhos básicos e valores limites
	@Test
	public void testaObtencaoSaldoAtualAtualizadorComSelicNegativo() {
		ContaCorrente conta1 = new ContaCorrente(1000);
		ContaCorrente conta2 = new ContaCorrente(2000);
		ContaCorrente conta3 = new ContaCorrente(3000);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		AtualizadorDeContas atualizador = new AtualizadorDeContas(-1);
		EfetuarAtualizacao atualizacao = new EfetuarAtualizacao(contas, atualizador);
		atualizacao.run();
		assertEquals(6000, atualizador.getSaldoTotal(), 0.00001);
	}
	
	// teste utilizando técnica para percorrer todos os caminhos básicos e valores limites
	@Test
	public void testaObtencaoSaldoAtualAtualizadorComSelicPositivo() {
		ContaCorrente conta1 = new ContaCorrente(1000);
		ContaCorrente conta2 = new ContaCorrente(2000);
		ContaCorrente conta3 = new ContaCorrente(3000);
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		AtualizadorDeContas atualizador = new AtualizadorDeContas(1);
		EfetuarAtualizacao atualizacao = new EfetuarAtualizacao(contas, atualizador);
		atualizacao.run();
		assertEquals(5997, atualizador.getSaldoTotal(), 0.00001);
	}
}

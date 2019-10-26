package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControleDeBonitifacoesTest {

	// teste utilizando t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testaBonificacoesCaixa() {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Caixa caixa = new Caixa("caixa", "endere�o", "", "", "senha", "caixa", 1500);
		controle.registra(caixa);
		assertEquals(150.00, controle.getTotalDeBonificacoes(), 0.0001);
	}
	
	// teste utilizando t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testaBonificacoesCaixaEGerente() {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Caixa caixa = new Caixa("caixa", "endere�o", "", "", "senha", "caixa", 1500);
		Gerente gerente = new Gerente("gerente", "endere�o", "", "", "senha", "gerente", 3000);
		controle.registra(caixa);
		controle.registra(gerente);
		assertEquals(750.00, controle.getTotalDeBonificacoes(), 0.0001);
	}
	
	// teste utilizando t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testaBonificacoesCaixaEGerenteEDiretor() {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Caixa caixa = new Caixa("caixa", "endere�o", "", "", "senha", "caixa", 1500);
		Gerente gerente = new Gerente("gerente", "endere�o", "", "", "senha", "gerente", 3000);
		Diretor diretor= new Diretor("diretor", "endere�o", "", "", "senha", "diretor", 10000);
		controle.registra(caixa);
		controle.registra(gerente);
		controle.registra(diretor);
		assertEquals(5750.00, controle.getTotalDeBonificacoes(), 0.0001);
	}
	
	// teste utilizando t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testaBonificacoesDiretor() {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Diretor diretor= new Diretor("diretor", "endere�o", "", "", "senha", "diretor", 10000);
		controle.registra(diretor);
		assertEquals(5000.00, controle.getTotalDeBonificacoes(), 0.0001);
	}

}

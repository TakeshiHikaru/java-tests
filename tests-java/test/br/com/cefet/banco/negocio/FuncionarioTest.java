package br.com.cefet.banco.negocio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.cefet.banco.util.BancoUtil;

public class FuncionarioTest {
	
	@Test
	public void testBonificacaoCaixa() {
		Caixa caixa = new Caixa("","","","","","", 1500.00);
		assertEquals(150.00, caixa.getBonificacao(), 0.1);
	}
	
	@Test
	public void testBonificacaoGerente() {
		Gerente gerente = new Gerente("","","","","","", 1500.00);
		assertEquals(300.00, gerente.getBonificacao(), 0.0);
	}
	
	@Test
	public void testBonificacaoDiretor() {
		Diretor diretor = new Diretor("","","","","","", 1500.00);
		assertEquals(750.00, diretor.getBonificacao(), 0.0);
	}

}

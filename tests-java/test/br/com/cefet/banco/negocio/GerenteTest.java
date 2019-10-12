package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBonificacaoGerente() {
		Gerente gerente = new Gerente("","","","","","", 3000.00);
		assertEquals(600.00, gerente.getBonificacao(), 0.0);
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.aumentarSalario(1);
		assertEquals(3030, gerente.getSalario(), 0.001);
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(!gerente.aumentarSalario(-1));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(!gerente.aumentarSalario(0));
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoGerente() {
		Gerente gerente = new Gerente("","","","","caixa","", 3000.00);
		gerente.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, gerente.getEstado());
	}
	
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testAuthenticacaoGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(gerente.autenticar("gerente"));
	}
	
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterNomeGerente() {
		Gerente gerente = new Gerente("Nome Gerente","","","","Gerente","", 3000.00);
		assertEquals("Nome Gerente", gerente.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterEnderecoGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endere�o Gerente","","","Gerente","", 3000.00);
		assertEquals("Endere�o Gerente", gerente.getEndereco());
	}

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterCpfGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endere�o Gerente","111.111.111.11","","Gerente","", 3000.00);
		assertEquals("111.111.111.11", gerente.getCpf());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterDepartamentoGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endere�o Gerente","111.111.111.11","gest�o","Gerente","", 3000.00);
		assertEquals("gest�o", gerente.getDepartamento());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterSenhaGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endere�o Gerente","111.111.111.11","dire��o","gerente","gerente", 3000.00);
		assertEquals("gerente", gerente.getSenha());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterUsuarioGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endere�o Gerente","111.111.111.11","dire��o","gerente","gerente", 3000.00);
		assertEquals("gerente", gerente.getUsuario());
	}

}

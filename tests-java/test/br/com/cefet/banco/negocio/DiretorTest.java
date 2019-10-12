package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiretorTest {

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBonificacaoDiretor() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		assertEquals(5000.00, diretor.getBonificacao(), 0.0);
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testAuthenticacaoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(diretor.autenticar("diretor"));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.aumentarSalario(1);
		assertEquals(10100, diretor.getSalario(), 0.001);
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorEmFerias() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_FERIAS);
		assertEquals(EstadoFuncionario.EM_FERIAS, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorAfastadoPorDoenca() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.AFASTADO_POR_DOENCA);
		assertEquals(EstadoFuncionario.AFASTADO_POR_DOENCA, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorAposentado() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.APOSENTADO);
		assertEquals(EstadoFuncionario.APOSENTADO, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorEmExercicio() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, diretor.getEstado());
	}
	
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(-1));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(0));
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterNomeDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","","","","diretor","", 10000.00);
		assertEquals("Nome Diretor", diretor.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterEnderecoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","","","diretor","", 10000.00);
		assertEquals("Endere�o diretor", diretor.getEndereco());
	}

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterCpfDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","","diretor","", 10000.00);
		assertEquals("111.111.111.11", diretor.getCpf());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterDepartamentoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","", 10000.00);
		assertEquals("dire��o", diretor.getDepartamento());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterSenhaDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getSenha());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterUsuarioDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getUsuario());
	}

}

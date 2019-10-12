package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiretorTest {

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testBonificacaoDiretor() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		assertEquals(5000.00, diretor.getBonificacao(), 0.0);
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testAuthenticacaoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(diretor.autenticar("diretor"));
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.aumentarSalario(1);
		assertEquals(10100, diretor.getSalario(), 0.001);
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoDiretorEmFerias() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_FERIAS);
		assertEquals(EstadoFuncionario.EM_FERIAS, diretor.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoDiretorAfastadoPorDoenca() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.AFASTADO_POR_DOENCA);
		assertEquals(EstadoFuncionario.AFASTADO_POR_DOENCA, diretor.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoDiretorAposentado() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.APOSENTADO);
		assertEquals(EstadoFuncionario.APOSENTADO, diretor.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoDiretorEmExercicio() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, diretor.getEstado());
	}
	
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(-1));
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(0));
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterNomeDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","","","","diretor","", 10000.00);
		assertEquals("Nome Diretor", diretor.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterEnderecoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","","","diretor","", 10000.00);
		assertEquals("Endereço diretor", diretor.getEndereco());
	}

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterCpfDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","111.111.111.11","","diretor","", 10000.00);
		assertEquals("111.111.111.11", diretor.getCpf());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterDepartamentoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","111.111.111.11","direção","diretor","", 10000.00);
		assertEquals("direção", diretor.getDepartamento());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterSenhaDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","111.111.111.11","direção","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getSenha());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterUsuarioDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","111.111.111.11","direção","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getUsuario());
	}

}

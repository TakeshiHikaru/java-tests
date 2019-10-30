package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Funcionario;

public class FuncionarioDAOTest {
	
	FuncionarioDAO funcionarioDAO;
	@Before
	public void inicializaConta() {
		this.funcionarioDAO = new FuncionarioDAO();
	}

	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	@Test
	public void pegaFuncionarioDiretorPeloUsuarioTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario("diretor");
		assertEquals("diretor", funcionario.getUsuario());
	}
	
	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	@Test
	public void pegaFuncionarioCaixaPeloUsuarioTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario("caixa");
		assertEquals("caixa", funcionario.getUsuario());
	}
	
	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	@Test
	public void pegaFuncionarioGerentePeloUsuarioTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario("gerente");
		assertEquals("gerente", funcionario.getUsuario());
	}
	
	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	// considerando que o diretor possui id igual a 1
	@Test
	public void pegaFuncionarioDiretorPeloIdTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario(1);
		assertEquals("diretor", funcionario.getUsuario());
	}
	
	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	// considerando que o caixa tem o id igual a 2
	@Test
	public void pegaFuncionarioCaixaPeloIdTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario(2);
		assertEquals("caixa", funcionario.getUsuario());
	}
	
	// utilizando a t�cnica para percorrer todos os caminhos b�sicos
	// considerando que o gerente tem id igual a 4 MUDAR ISSO FUTURAMENTE
	@Test
	public void pegaFuncionarioGerentePeloIdTest() {
		Funcionario funcionario = this.funcionarioDAO.getFuncionario(3);
		assertEquals("gerente", funcionario.getUsuario());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos 
	// Lista n�o pode ser vazia por qu� o banco j� vai ter alguns dados de cliente
	@Test
	public void testObentacaoListaFuncionarios() {
		assertTrue(!this.funcionarioDAO.getListaFuncionarios().isEmpty());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos 
	// Considerando que no banco possui somente 3 funcion�rios
	@Test
	public void testObentacaoQuantidadeFuncionarios() {
		assertEquals(3, this.funcionarioDAO.getFuncionarioCount());
	}
	

}

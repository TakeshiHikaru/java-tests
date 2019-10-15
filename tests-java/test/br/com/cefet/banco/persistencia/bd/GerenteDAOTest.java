package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Funcionario;
import br.com.cefet.banco.negocio.Gerente;

public class GerenteDAOTest {

	FuncionarioDAO funcionarioDAO;
	@Before
	public void inicializaTesteGerente() {
		this.funcionarioDAO = new FuncionarioDAO();
	}

	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testAlteracaoDeFuncionarioGerente() {
		Funcionario gerente = this.funcionarioDAO.getFuncionario("gerente");
		gerente.setNome("gerente alterado");
		this.funcionarioDAO.altera(gerente);;
		Funcionario gerenteAlterado = this.funcionarioDAO.getFuncionario("gerente");
		assertEquals("gerente alterado", gerenteAlterado.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testExclusaoFuncionarioCaixa() {
		Funcionario funcionarioTest = new Gerente("gerente", "", "", "", "", "gerente exclusão", 3000.00);
		this.funcionarioDAO.adicionaFuncionario(funcionarioTest);
		Funcionario gerente = this.funcionarioDAO.getFuncionario("gerente exclusão");
		this.funcionarioDAO.remove(gerente);
		assertNull(this.funcionarioDAO.getFuncionario("gerente exclusão"));
	}

}

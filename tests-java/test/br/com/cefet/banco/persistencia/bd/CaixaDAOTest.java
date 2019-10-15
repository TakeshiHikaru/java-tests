package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Funcionario;

public class CaixaDAOTest {
	
	FuncionarioDAO funcionarioDAO;
	@Before
	public void inicializaTesteCaixa() {
		this.funcionarioDAO = new FuncionarioDAO();
	}

	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testAlteracaoDeFuncionarioCaixa() {
		Funcionario caixa = this.funcionarioDAO.getFuncionario("caixa");
		caixa.setNome("caixa alterado");
		this.funcionarioDAO.altera(caixa);;
		Funcionario caixaAlterado = this.funcionarioDAO.getFuncionario("caixa");
		assertEquals("caixa alterado", caixaAlterado.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testExclusaoFuncionarioCaixa() {
		Funcionario funcionarioTest = new Caixa("caixa", "", "", "", "", "caixa exclusão", 1500.00);
		this.funcionarioDAO.adicionaFuncionario(funcionarioTest);
		Funcionario caixa = this.funcionarioDAO.getFuncionario("caixa exclusão");
		this.funcionarioDAO.remove(caixa);
		assertNull(this.funcionarioDAO.getFuncionario("caixa exclusão"));
	}


}

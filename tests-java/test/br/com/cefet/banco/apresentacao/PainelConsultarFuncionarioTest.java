package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class PainelConsultarFuncionarioTest {


	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeCriacaoTelaConsultaFuncionario() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
	}
	
	//teste implementado utilizando t�cnica de todas as condi��es
	@Test
	public void testeValidacaoCamposComTodosCamposValidos() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
		assertEquals(true, tela.verificaCampos("nome", "endereco", "111.111.111-11", "caixa", "2000"));
	}
	
	//teste implementado utilizando t�cnica de todas as condi��es
	@Test
	public void testeValidacaoCamposSomenteComNome() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
		assertEquals(false, tela.verificaCampos("nome", "", "", "", ""));
	}
	
	//teste implementado utilizando t�cnica de todas as condi��es
	@Test
	public void testeValidacaoCamposSomenteComEndereco() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
		assertEquals(false, tela.verificaCampos("", "endere�o", "", "", ""));
	}
	
	//teste implementado utilizando t�cnica de todas as condi��es
	@Test
	public void testeValidacaoCamposSomenteComCpf() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
		assertEquals(false, tela.verificaCampos("", "", "dsada", "", ""));
	}
	
	//teste implementado utilizando t�cnica de todas as condi��es
	@Test
	public void testeValidacaoCamposSomenteComDepartamento() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelConsultarFuncionario tela = new PainelConsultarFuncionario(caixa);
		assertEquals(false, tela.verificaCampos("", "", "", "caixa", ""));
	}

}

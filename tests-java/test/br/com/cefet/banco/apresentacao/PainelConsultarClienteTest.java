package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;

public class PainelConsultarClienteTest {

	// técnica de percorrer os caminhos básicos
	@Test
	public void testeCriacaoTelaConsultaCliente() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
	}
	
	//teste implementado utilizando técnica de todas as condições
	@Test
	public void testeValidacaoCamposSomenteComNome() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
		assertEquals(false, tela.verificaCampos("nome", "", ""));
	}
	
	//teste implementado utilizando técnica de todas as condições
	@Test
	public void testeValidacaoCamposSomenteComEndereco() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
		assertEquals(false, tela.verificaCampos("", "endereco", ""));
	}
	
	//teste implementado utilizando técnica de todas as condições
	@Test
	public void testeValidacaoCamposSomenteComCpf() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
		assertEquals(false, tela.verificaCampos("", "", "111.111.111-11"));
	}
	
	//teste implementado utilizando técnica de todas as condições
	@Test
	public void testeValidacaoCamposSomenteComCpfInvalido() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
		assertEquals(false, tela.verificaCampos("", "", "kdsaopkdasdsadsaopdsa"));
	}
	
	//teste implementado utilizando técnica de todas as condições
	@Test
	public void testeValidacaoCamposComCamposValidos() {
		PainelConsultarCliente tela = new PainelConsultarCliente();
		assertEquals(true, tela.verificaCampos("nome", "endereço", "111.111.111-11"));
	}
}

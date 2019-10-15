package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;


public class PainelCadastrarClienteTest {
	
	PainelCadastrarCliente panel;
	
	@Before
	public void inicializaTest() {
		this.panel = new PainelCadastrarCliente();
	}

	
	//Utilizando a técnica do teste de condição
	@Test
	public void testaVerificacaoCamposVaziosFormulario() {
		assertTrue(!this.panel.verificaCampos("", "", "", "", "", ""));
	}
	
	//Utilizando a técnica do teste de condição
	@Test
	public void testaVerificacaoCamposVaziosEUsuarioSenhaComCincoDígitos() {
		assertTrue(!this.panel.verificaCampos("", "", "", "usuar", "usuar", ""));
	}
	
	//Utilizando a técnica do teste de condição
	@Test
	public void testaVerificacaoEnderecoVazioFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "", "", "usuar", "", ""));
	}
	
	//Utilizando a técnica do teste de condição
	@Test
	public void testaVerificacaoCpfVazioFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "endereço", "", "usuar", "usuar", ""));
	}
	
	//Utilizando a técnica do teste de condição
	@Test
	public void testaVerificacaoCpfValidoEUsuarioSenhaComMaisDeCincoDigitosFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "endereço", "111.111.111-11", "usuario", "usuario", "senha"));
	}
	
}

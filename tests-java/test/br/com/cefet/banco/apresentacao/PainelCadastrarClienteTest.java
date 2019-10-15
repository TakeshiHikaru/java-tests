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

	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCamposVaziosFormulario() {
		assertTrue(!this.panel.verificaCampos("", "", "", "", "", ""));
	}
	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCamposVaziosEUsuarioSenhaComCincoD�gitos() {
		assertTrue(!this.panel.verificaCampos("", "", "", "usuar", "usuar", ""));
	}
	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoEnderecoVazioFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "", "", "usuar", "", ""));
	}
	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCpfVazioFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "endere�o", "", "usuar", "usuar", ""));
	}
	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCpfValidoEUsuarioSenhaComMaisDeCincoDigitosFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "endere�o", "111.111.111-11", "usuario", "usuario", "senha"));
	}
	
}

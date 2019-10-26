package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class PainelExcluirFuncionarioTest {
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoFuncionario() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelExcluirFuncionario tela = new PainelExcluirFuncionario(caixa);
		assertEquals("", tela.getNomeTxt().getText());
	}
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoELimpaTodosOsCampos() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelExcluirFuncionario tela = new PainelExcluirFuncionario(caixa);
		tela.apagaCampos();
		assertEquals("", tela.getNomeTxt().getText());
		assertEquals("", tela.getEnderecoTxt().getText());
		assertEquals("", tela.getCpfTxt().getText());
		assertEquals("", tela.getDepartamentoTxt().getText());
		assertEquals("", tela.getSalarioTxt().getText());
		assertEquals("", tela.getBonificacaoTxt().getText());
	}
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoComCaixaEEncontraOCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelExcluirFuncionario tela = new PainelExcluirFuncionario(caixa);
		assertEquals(caixa, tela.getFuncionarioLogado());
	}
	

}

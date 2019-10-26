package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class PainelExcluirFuncionarioTest {
	
	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeInicializaTesteExclusaoFuncionario() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelExcluirFuncionario tela = new PainelExcluirFuncionario(caixa);
		assertEquals("", tela.getNomeTxt().getText());
	}
	
	// t�cnica de percorrer os caminhos b�sicos
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
	
	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeInicializaTesteExclusaoComCaixaEEncontraOCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		PainelExcluirFuncionario tela = new PainelExcluirFuncionario(caixa);
		assertEquals(caixa, tela.getFuncionarioLogado());
	}
	

}

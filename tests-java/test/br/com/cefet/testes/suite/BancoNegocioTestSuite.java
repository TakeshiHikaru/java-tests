package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.negocio.BancoTest;
import br.com.cefet.banco.negocio.CaixaTest;
import br.com.cefet.banco.negocio.ClienteTest;
import br.com.cefet.banco.negocio.ContaCorrenteTest;
import br.com.cefet.banco.negocio.ContaPoupancaTest;
import br.com.cefet.banco.negocio.ControleDeBonitifacoesTest;
import br.com.cefet.banco.negocio.DiretorTest;
import br.com.cefet.banco.negocio.EfetuaDepositoTest;
import br.com.cefet.banco.negocio.EfetuaSaqueTest;
import br.com.cefet.banco.negocio.EfetuarAtualizacaoTest;
import br.com.cefet.banco.negocio.GerenteTest;
import br.com.cefet.banco.negocio.SistemaBancarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	GerenteTest.class,
	DiretorTest.class,
	CaixaTest.class,
	ContaPoupancaTest.class,
	ContaCorrenteTest.class,
	BancoTest.class,
	EfetuaDepositoTest.class,
	EfetuarAtualizacaoTest.class,
	EfetuaSaqueTest.class,
	SistemaBancarioTest.class,
	ControleDeBonitifacoesTest.class,
	ClienteTest.class
})
public class BancoNegocioTestSuite {

}

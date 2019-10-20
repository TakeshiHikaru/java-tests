package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.negocio.BancoTest;
import br.com.cefet.banco.negocio.CaixaTest;
import br.com.cefet.banco.negocio.ContaCorrenteTest;
import br.com.cefet.banco.negocio.ContaPoupancaTest;
import br.com.cefet.banco.negocio.DiretorTest;
import br.com.cefet.banco.negocio.GerenteTest;

@RunWith(Suite.class)
@SuiteClasses({
	GerenteTest.class,
	DiretorTest.class,
	CaixaTest.class,
	ContaPoupancaTest.class,
	ContaCorrenteTest.class,
	BancoTest.class
})
public class BancoNegocioTestSuite {

}

package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.negocio.BancoTest;
import br.com.cefet.banco.negocio.CaixaTest;
import br.com.cefet.banco.negocio.DiretorTest;
import br.com.cefet.banco.negocio.GerenteTest;

@RunWith(Suite.class)
@SuiteClasses({
	BancoTest.class,
	GerenteTest.class,
	DiretorTest.class,
	CaixaTest.class
})
public class BancoNegocioTestSuite {

}

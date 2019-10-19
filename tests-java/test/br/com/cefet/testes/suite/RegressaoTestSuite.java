package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.apresentacao.panels.StatusbarTest;
import br.com.cefet.banco.principal.MainTest;

@RunWith(Suite.class)
@SuiteClasses({
	BancoPersistenciaBdTestSuite.class,
	BancoNegocioTestSuite.class,
	BancoTestSuite.class,
	BancoApresentacaoTestSuite.class,
	MainTest.class,
	ApresentacaoModelTestSuite.class
})
public class RegressaoTestSuite {

}

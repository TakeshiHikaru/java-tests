package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BancoPersistenciaBdTestSuite.class,
	BancoNegocioTestSuite.class, 
	BancoTestSuite.class,
	BancoApresentacaoTestSuite.class
})
public class RegressaoTestSuite {

}

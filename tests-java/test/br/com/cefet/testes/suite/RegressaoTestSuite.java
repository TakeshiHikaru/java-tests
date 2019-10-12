package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BancoNegocioTestSuite.class, 
	BancoTestSuite.class 
})
public class RegressaoTestSuite {

}

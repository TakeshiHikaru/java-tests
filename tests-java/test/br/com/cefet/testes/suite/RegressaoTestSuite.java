package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.persistencia.bd.ClienteDAOTest;
import br.com.cefet.banco.persistencia.bd.ContaDAOTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	BancoNegocioTestSuite.class, 
	BancoTestSuite.class,
	ClienteDAOTest.class,
	ContaDAOTest.class
})
public class RegressaoTestSuite {

}

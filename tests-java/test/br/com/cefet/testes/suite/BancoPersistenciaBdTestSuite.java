package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.persistencia.bd.CaixaDAOTest;
import br.com.cefet.banco.persistencia.bd.ClienteDAOTest;
import br.com.cefet.banco.persistencia.bd.ContaDAOTest;
import br.com.cefet.banco.persistencia.bd.DiretorDAOTest;
import br.com.cefet.banco.persistencia.bd.FuncionarioDAOTest;
import br.com.cefet.banco.persistencia.bd.GerenteDAOTest;

@RunWith(Suite.class)
@SuiteClasses({
		ContaDAOTest.class,
		ClienteDAOTest.class,
		FuncionarioDAOTest.class,
		DiretorDAOTest.class,
		GerenteDAOTest.class,
		CaixaDAOTest.class
	})
public class BancoPersistenciaBdTestSuite {

}

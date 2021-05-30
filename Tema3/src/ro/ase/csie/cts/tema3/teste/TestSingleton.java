package ro.ase.csie.cts.tema3.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.tema3.singleton.Server;


public class TestSingleton {
	
	static Server server1 =  Server.getServer();
	static Server server2 =  Server.getServer();
	static Server server3 =  Server.getServer();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSingletonAdresaIp() {
		assertEquals("Cele 2 referinte sunt identice", server1.getAdresaIp(), server2.getAdresaIp());
	}
	
	@Test
	public void testSibgletonNumarMaximConexiuni() {
			assertEquals("Cele 2 referinte sunt identice", server1.getNrMaximConexiuni(), server2.getNrMaximConexiuni());
	}

}

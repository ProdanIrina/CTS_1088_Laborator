package ro.ase.csie.cts.tema3.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.tema3.prototype.Server;

public class TestPrototype {
	
	static Server server1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		server1 = new Server("10.0.0.1", 5, 20);
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
	public void testPrototypeAdresaIp() throws CloneNotSupportedException  {
		Server server2 = (Server) server1.clone();
		assertEquals("Cele 2 servere sunt identice", server2.getAdresaIp(), server1.getAdresaIp());
	}
	
	@Test
	public void testPrototypePort() throws CloneNotSupportedException  {
		Server server2 = (Server) server1.clone();
		assertEquals("Cele 2 servere sunt identice", server2.getPort(), server1.getPort());
	}
}

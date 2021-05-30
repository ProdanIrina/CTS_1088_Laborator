package ro.ase.csie.cts.tema3.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.tema3.observer.ModulNotificare;
import ro.ase.csie.cts.tema3.observer.ModulStareServer;
import ro.ase.csie.cts.tema3.observer.StareServer;

public class TestObserver {
	
	ModulStareServer server = new ModulStareServer();
	ModulNotificare notificari = new ModulNotificare();


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
	public void testObserverServerConectat() {
		server.stareConexiuneServer(StareServer.ACTIVA);
		server.addServer(notificari);
	}
	
	@Test
	public void testObserverServerDeconectat() {
		server.stareConexiuneServer(StareServer.INACTIVA);
		server.removeServer(notificari);
	}
}

package ro.ase.csie.cts.tema3.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareServer {

	List<InterfataServer> servere = new ArrayList<>();

	public void addServer(InterfataServer server) {
		this.servere.add(server);
	}

	public void removeServer(InterfataServer server) {
		this.servere.remove(server);
	}

	public void stareConexiuneServer(StareServer stare) {
		if (stare == StareServer.ACTIVA) {
			for (InterfataServer server : servere) {
				server.conectare();
			}
		} else if (stare == StareServer.INACTIVA) {
			for (InterfataServer server : servere) {
				server.deconectare();
			}
		}
	}
}

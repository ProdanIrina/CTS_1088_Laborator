package ro.ase.csie.cts.tema3.singleton;


public class Server implements InterfataServer{
	
	String adresaIp;
	int port;
	int numarMaximConexiuni;
	
	private static Server server = null;
	
	private Server() {
		
	}

	private Server(String adresaIp, int port, int numarMaximConexiuni) {
		super();
		this.adresaIp = adresaIp;
		this.port = port;
		this.numarMaximConexiuni = numarMaximConexiuni;
	}
	
	public static synchronized Server getServer() {
		if(server == null) {
			server = new Server("10.0.0.1",5,2);
		}
		return server;
	}

	@Override
	public String getAdresaIp() {
		return this.adresaIp;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getNrMaximConexiuni() {
		return this.numarMaximConexiuni;
	}

	@Override
	public boolean conectare() {
		return false;
	}

	@Override
	public boolean deconectare() {		
		return false;
	}
	

}

package ro.ase.csie.cts.tema3.prototype;

public class Server implements InterfataServer, Cloneable{
	
	String adresaIp;
	int port;
	int nrMaximConexiuni;
	
	private Server() {
		
	}

	public Server(String adresaIp, int port, int nrMaximConexiuni) {
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrMaximConexiuni = nrMaximConexiuni;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Server copie = new Server();
		copie.adresaIp = this.adresaIp;
		copie.port = this.port;
		copie.nrMaximConexiuni = this.nrMaximConexiuni;
		return copie;
	}

	
	
	public void setAdresaIp(String adresaIp) {
		this.adresaIp = adresaIp;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setNrMaximConexiuni(int nrMaximConexiuni) {
		this.nrMaximConexiuni = nrMaximConexiuni;
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
		return this.nrMaximConexiuni;
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

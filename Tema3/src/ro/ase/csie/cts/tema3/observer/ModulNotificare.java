package ro.ase.csie.cts.tema3.observer;

public class ModulNotificare implements InterfataServer{

	@Override
	public String getAdresaIp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNrMaximConexiuni() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean conectare() {
		System.out.println("Conectare server");
		return false;
	}

	@Override
	public boolean deconectare() {
		System.out.println("Deconectare server");
		return false;
	}

}

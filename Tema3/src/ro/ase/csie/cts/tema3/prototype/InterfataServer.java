package ro.ase.csie.cts.tema3.prototype;

public interface InterfataServer {

    public String getAdresaIp();
    public int getPort();
    public int getNrMaximConexiuni();

    public boolean conectare();
    public boolean deconectare();

}
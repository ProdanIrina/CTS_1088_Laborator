package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class SuperErou {
	
	String nume;
	int puncteVata;
	
	public SuperErou(String nume, int puncteVata) {
		super();
		this.nume = nume;
		this.puncteVata = puncteVata;
	}
	
	
	
	public abstract void alearga();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
	
	

}

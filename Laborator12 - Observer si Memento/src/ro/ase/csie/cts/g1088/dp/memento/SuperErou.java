package ro.ase.csie.cts.g1088.dp.memento;

public class SuperErou {
	
	String nume;
	int puncteVita;
	String magie;
	
	public SuperErou(String nume, int puncteVita, String magie) {
		super();
		this.nume = nume;
		this.puncteVita = puncteVita;
		this.magie = magie;
	}
	
	public void ataca() {
		System.out.println("Ataca");
	}
	
	public void esteLovit(int puncte) {
		this.puncteVita -= puncte;	
	}
	
	public void seVindeca(int puncte) {
		this.puncteVita += puncte;
	}
	
	public MementoSuperErou salvare() {
		return new MementoSuperErou(nume, puncteVita, magie);
	}
	
	public void incarcaSalvare(MementoSuperErou memento) {
		this.nume = memento.nume;
		this.puncteVita = memento.puncteVita;
		this.magie = memento.magie;
		
	}
}

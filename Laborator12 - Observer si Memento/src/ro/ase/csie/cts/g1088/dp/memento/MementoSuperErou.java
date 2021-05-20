package ro.ase.csie.cts.g1088.dp.memento;

import java.util.Date;

public class MementoSuperErou {

	String nume;
	int puncteVita;
	String magie;
	
	Date dataSalvare;

	public MementoSuperErou(String nume, int puncteVita, String magie) {
		super();
		this.nume = nume;
		this.puncteVita = puncteVita;
		this.magie = magie;
		this.dataSalvare = new Date();
	}
	
	
}

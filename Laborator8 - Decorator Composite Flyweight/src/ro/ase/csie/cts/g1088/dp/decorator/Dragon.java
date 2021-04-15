package ro.ase.csie.cts.g1088.dp.decorator;

public class Dragon extends SuperErou {

	public Dragon(String nume, int puncteVata) {
		super(nume, puncteVata);
		
	}

	@Override
	public void alearga() {
		System.out.println("Zboara catre o noua destinatie");
		
	}

	@Override
	public void esteLovit(int puncte) {
		System.out.println(String.format("%s este lovit si pierde %d puncte", this.nume, puncte));
		this.puncteVata -= puncte;
		
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(String.format("%s se vindeca si recupereaza %d puncte", this.nume, puncte));
		this.puncteVata += puncte;
		
	}

	@Override
	public int getPuncteViata() {
		// TODO Auto-generated method stub
		return this.puncteVata;
	}

}

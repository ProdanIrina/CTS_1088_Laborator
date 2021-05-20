package ro.ase.csie.cts.g1088.dp.memento;

public class TestMemento {
	
	public static void main(String[] args) {
		
		ManagerIstoric istoric = new ManagerIstoric();
				
		SuperErou superman = new SuperErou("Suprman", 100, "Zboara");
		
		istoric.adaugaSalvare(superman.salvare());
		
		superman.esteLovit(10);
		superman.esteLovit(50);
		
		System.out.println("Puncte viata: " + superman.puncteVita);
		
		superman.incarcaSalvare(istoric.getUltimaSlavare());
		
		System.out.println("Puncte viata: " + superman.puncteVita);
	}
}

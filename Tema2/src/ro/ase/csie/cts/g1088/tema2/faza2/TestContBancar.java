package ro.ase.csie.cts.g1088.tema2.faza2;

import java.lang.reflect.Array;
import java.util.ArrayList;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;
import ro.ase.csie.cts.g1088.tema2.servicii.DobandaPrincipala;
import ro.ase.csie.cts.g1088.tema2.servicii.InterfataDobandaPrincipala;
import ro.ase.csie.cts.g1088.tema2.servicii.InterfataValidare;
import ro.ase.csie.cts.g1088.tema2.servicii.ServiciuValidari;

public class TestContBancar {
	
	public static ArrayList<Object> servicii = new ArrayList<>();
	public static ContBancar[] conturiBancare = new ContBancar[2];
	
	public void startUp() {
		InterfataValidare serviciuValidare = new ServiciuValidari();
		InterfataDobandaPrincipala serviciuDobanda = new DobandaPrincipala();
		servicii.add(serviciuValidare);
		servicii.add(serviciuDobanda);
	}

	public static void main(String[] args) {
		try {
			ContBancar contBancar1 = new ContBancar(5000, 10, TipContBancar.PREMIUM);
			ContBancar contBancar2 = new ContBancar(1000, 12, TipContBancar.SUPER_PREMIUM);
			conturiBancare[0] = contBancar1;
			conturiBancare[1] = contBancar2;
			contBancar1.setDobandaPrincipala(new DobandaPrincipala());
			double comisionTotal  = contBancar1.getComisionTotal(conturiBancare);
			System.out.println("Comisionul total este: " + comisionTotal);
		} catch (ExceptieImprumutInvalid e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

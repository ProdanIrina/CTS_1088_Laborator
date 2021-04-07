package ro.ase.csie.cts.g1088.tema2.servicii;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;
import ro.ase.csie.cts.g1088.tema2.faza2.ContBancar;

public class DobandaPrincipala extends ServiciuValidari implements InterfataDobandaPrincipala{

	@Override
	public double getDobandaPrincipala(ContBancar cont) throws ExceptieImprumutInvalid {
		validareImprumut(cont.valoareImprumut);
		return cont.valoareImprumut * Math.pow(cont.numarRate, (cont.durataImprumut / NUMAR_ZILE_AN));
	
	}

}

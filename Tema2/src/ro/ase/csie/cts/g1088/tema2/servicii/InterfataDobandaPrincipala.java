package ro.ase.csie.cts.g1088.tema2.servicii;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;
import ro.ase.csie.cts.g1088.tema2.faza2.ContBancar;

public interface InterfataDobandaPrincipala {

	public static final int NUMAR_ZILE_AN = 365;

	public double getDobandaPrincipala(ContBancar cont) throws ExceptieImprumutInvalid;
}

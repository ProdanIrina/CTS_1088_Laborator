package ro.ase.csie.cts.g1088.tema2.servicii;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;

public interface InterfataValidare {

	public void validareImprumut(double valoareImprumut) throws ExceptieImprumutInvalid;
}

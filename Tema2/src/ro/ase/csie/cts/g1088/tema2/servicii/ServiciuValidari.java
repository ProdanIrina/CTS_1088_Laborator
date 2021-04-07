package ro.ase.csie.cts.g1088.tema2.servicii;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;

public class ServiciuValidari implements InterfataValidare{

	@Override
	public void validareImprumut(double valoareImprumut) throws ExceptieImprumutInvalid {
		if(valoareImprumut <= 0) {
			throw new ExceptieImprumutInvalid();
		}
		
	}

}

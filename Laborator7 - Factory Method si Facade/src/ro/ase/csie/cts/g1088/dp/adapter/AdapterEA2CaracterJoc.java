package ro.ase.csie.cts.g1088.dp.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc{

	InterfataCaracterEA caracterEA;

	//trebuie sa ai reverinta la adaptor
	public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}

	@Override
	public void seDeplaseaza() {
		//scrii cod folosindu te de metodele specifice contextului folosidu te si de caracterEA creat
		caracterEA.move();
	}
	
}

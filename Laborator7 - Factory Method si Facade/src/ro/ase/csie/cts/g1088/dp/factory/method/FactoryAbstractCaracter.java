package ro.ase.csie.cts.g1088.dp.factory.method;

public abstract class FactoryAbstractCaracter {
	//metoda nu mai este statica
	//vom instntia factory
	public abstract CaracterJoc getCaracter(TipCaracter tip, String nume);
	

}

package ro.ase.csie.cts.g1088.dp.composite;

public class CaracterNPC extends UnitateAbstractaJoc {
	
	String tip;
	int putere;

	public CaracterNPC(String tip, int putere) {
		super();
		this.tip = tip;
		this.putere = putere;
	}

	@Override
	public void seDeplaseaza(int x, int y) {
		System.out.println(String.format("%s se deplasaza", tip));
	}

	@Override
	public void atacaJucator(int puncte) {
		System.out.println(String.format("%s ataca jucatorul", tip));
		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage", tip));
		
	}
	
// SOLUTIE CAND NU SUNT IIMPLEMENTATE IN NIVELUL ABSTRACT
	
//	@Override
//	public void adaugaCaracter(UnitateAbstractaJoc unitate) {
//		throw new UnsupportedOperationException();
//		
//	}
//
//	@Override
//	public void stergeCaracter(UnitateAbstractaJoc unitate) {
//		throw new UnsupportedOperationException();
//		
//	}
//
//	@Override
//	public UnitateAbstractaJoc getCaracter(int index) {
//		throw new UnsupportedOperationException();
//		return null;
//	}

}

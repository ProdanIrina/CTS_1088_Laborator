package ro.ase.csie.cts.g1088.tema2.faza2;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;
import ro.ase.csie.cts.g1088.tema2.servicii.InterfataDobandaPrincipala;
import ro.ase.csie.cts.g1088.tema2.servicii.InterfataValidare;

public class ContBancar {
	public double valoareImprumut;
	public double numarRate;
	public int durataImprumut;
	public TipContBancar tipCont;

	InterfataDobandaPrincipala dobandaPrincipala = null;
	InterfataValidare serviciuValidare = null;

	public static final double COMISION_BROKER = 0.0125f;

	public ContBancar(InterfataDobandaPrincipala dp, InterfataValidare validare) {
		if (validare == null) {
			throw new NullPointerException();
		}
		this.setDobandaPrincipala(dp);
		this.serviciuValidare = validare;

	}

	public ContBancar(double valoare, double numarRate, TipContBancar tipCont) throws ExceptieImprumutInvalid {
//		this.serviciuValidare.validareImprumut(valoare);

		this.valoareImprumut = valoare;
		this.numarRate = numarRate;
		this.tipCont = tipCont;
	}

	public double getValoareImprumut() {
		System.out.println("Valoarea imprumutului este: " + this.valoareImprumut);
		return valoareImprumut;
	}

	public void setValoareImprumut(double valoare) throws ExceptieImprumutInvalid {
		this.serviciuValidare.validareImprumut(valoare);
		this.valoareImprumut = valoare;
	}

	public double getNumarRate() {
		System.out.println("Numarul de rate este: " + this.numarRate);
		return numarRate;
	}

	public void setNumarRate(double numarRate) {
		this.numarRate = numarRate;
	}

	// metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return valoareImprumut / numarRate;
	}

	@Override
	public String toString() {
		return "ContBancar [valoareImprumut=" + valoareImprumut + ", rata=" + numarRate + ", zileActiv="
				+ durataImprumut + ", tipCont=" + tipCont + "]";
	}

	public void setDobandaPrincipala(InterfataDobandaPrincipala dobanda) {
		if (dobanda == null) {
			throw new NullPointerException();
		}
		this.dobandaPrincipala = dobanda;
	}

	public double getComisionTotal(ContBancar[] conturi) throws ExceptieImprumutInvalid {
		double comisionTotal = 0.0f;
		for (int i = 0; i < conturi.length; i++) {
			if (conturi[i].tipCont == TipContBancar.PREMIUM || conturi[i].tipCont == TipContBancar.SUPER_PREMIUM)
				comisionTotal += COMISION_BROKER * dobandaPrincipala.getDobandaPrincipala(conturi[i]);
		}
		return comisionTotal;
	}

}
package ro.ase.csie.cts.g1088.tema2.faza1;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutInvalid;

public class ContBancar {
	double valoareImprumut;
	double rata;
	int durataImprumut;
	TipContBancar tipCont;

	public static final int NUMAR_ZILE_AN = 365;
	public static final double COMISION_BROKER = 0.0125f;

	public ContBancar(double valoare, double rata, TipContBancar tipCont) throws Exception {
		if (valoare < 0)
			throw new Exception();
		else {
			valoareImprumut = valoare;
		}
		this.rata = rata;
		this.tipCont = tipCont;
	}

	public double getValoareImprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoareImprumut);
		return valoareImprumut;
	}

	public double getNumarRate() {
		System.out.println("Numarul de rate este " + this.rata);
		return rata;
	}

	// metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return valoareImprumut * rata;
	}

	public void setValoareImprumut(double valoare) throws Exception {
		if (valoare < 0)
			throw new Exception();
		else {
			valoareImprumut = valoare;
		}
	}

	@Override
	public String toString() {
		return "ContBancar [valoareImprumut=" + valoareImprumut + ", rata=" + rata + ", zileActiv=" + durataImprumut
				+ ", tipCont=" + tipCont + "]";
	}

	public static double getComisionTotal(ContBancar[] conturi) {
		double comisionTotal = 0.0;
		ContBancar cont;
		for (int i = 0; i < conturi.length; i++) {
			cont = conturi[i];
			if (cont.tipCont == TipContBancar.PREMIUM || cont.tipCont == TipContBancar.SUPER_PREMIUM)
				comisionTotal += COMISION_BROKER * ( // 1.25% broker's fee
				cont.valoareImprumut * Math.pow(cont.rata, (cont.durataImprumut / NUMAR_ZILE_AN))
						- cont.valoareImprumut); // dobanda-principala
		}
		return comisionTotal;
	}

}
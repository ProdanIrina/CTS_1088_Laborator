package ro.ase.csie.cts.g1088.tema2.faza1;

public class ContBancar {
	double valoareImprumut;
	double rata;	
	int	zileActiv;
	TipContBancar tipCont;
	
	public ContBancar(double valoare, double rata, TipContBancar tipCont) throws Exception {
		if (valoare < 0)
			throw new Exception();
		else {
			valoareImprumut = valoare;
		}
		this.rata = rata;
		this.tipCont = tipCont;
	}
	
	public double imprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoareImprumut);
		return valoareImprumut;
	}
	
	public double getRata() {
		System.out.println("Rata este "+rata);
		return this.rata;
	}
	
	//metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return valoareImprumut*rata;
	}
	
	public void setValoare(double valoare) throws Exception {
		if(valoare<0)
			throw new Exception();
		else
		{
			valoareImprumut = valoare;
		}
	}
	
	@Override
	public String toString() {
		return "ContBancar [valoareImprumut=" + valoareImprumut + ", rata=" + rata + ", zileActiv=" + zileActiv
				+ ", tipCont=" + tipCont + "]";
	}

	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double getComisionTotal(ContBancar[] conturi)
	{
	double comisionTotal=0.0;
	int temp = 365;
	double comisionBroker = 0.0125f;
	ContBancar cont;
	for (int i = 0; i < conturi.length; i++) {
		cont = conturi[i];
		if (cont.tipCont == TipContBancar.PREMIUM || cont.tipCont == TipContBancar.SUPER_PREMIUM)
			comisionTotal += comisionBroker * ( // 1.25% broker's fee
			cont.valoareImprumut * Math.pow(cont.rata, (cont.zileActiv / temp)) - cont.valoareImprumut); // dobanda-principala
	}
	return	comisionTotal;
	}

	
}
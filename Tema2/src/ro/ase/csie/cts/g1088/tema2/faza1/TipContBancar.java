package ro.ase.csie.cts.g1088.tema2.faza1;

public enum TipContBancar {
	STANDARD(0), BUGET(1), PREMIUM(2), SUPER_PREMIUM(3);

	private final float comision;
	
	private TipContBancar(float comision) {
		this.comision = comision;
	}
	
	public float getComision() {
		return this.comision;
	}

}

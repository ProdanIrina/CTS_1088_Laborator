package ro.ase.csie.cts.g1088.dp.factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {
		
//		CaracterAbstract mikeyMouse = new CaracterDisney("rosu", "Mikey Mouse");
//		CaracterAbstract spiderMan = new CaracterMarvel(100,"Spiderman");
		
		CaracterAbstract mikeyMouse = FactoryCaractere.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");
		
		ArrayList<CaracterAbstract> caractere = new ArrayList<>();
		
	}

}

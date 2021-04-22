package ro.ase.csie.cts.g1088.dp.flyweight;
import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {

	public static Map<String, InterfataFlyweightModel3D> modele = new HashMap<>();
	
	//parte de eager
	static {
		modele.put(TipModel3D.CLADIRE.toString(), new FlyweightModelD("Cladire"));
		modele.put(TipModel3D.SOLDAT.toString(), new FlyweightModelD("Soldat"));
	}
	
	public static InterfataFlyweightModel3D getModel(TipModel3D tip) {
		return modele.get(tip.toString());
	}
}

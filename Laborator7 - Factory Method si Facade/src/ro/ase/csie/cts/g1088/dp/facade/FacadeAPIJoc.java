package ro.ase.csie.cts.g1088.dp.facade;

public class FacadeAPIJoc {

	//Interfata simplificata pentru a obtine profilul unui jucator
	public static String getProfil(String username, String password) {
		
		//1. Creare conexiune
				ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
				conexiune.conectare();
				
				//2 Login player
				Player player = new Player();
				player.login(conexiune);
				
				//3. Obtinem profilul
				ProfilPlayer profil = player.getProfil();
				
				//4. Obtinem datele
				String dateProfil = profil.getProfil();

				return dateProfil;
	}
}

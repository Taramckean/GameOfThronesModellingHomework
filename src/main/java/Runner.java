import db.DBHelper;
import models.*;
import sun.security.pkcs11.Secmod;

public class Runner {
	public static void main(String[] args) {
		House houseStark = new House("Stark", 8000);
		House houseLannister = new House("Lannister",6000 );
		DBHelper.saveOrUpdate(houseStark);
		DBHelper.saveOrUpdate(houseLannister);

		Ruler currentRuler = new Ruler("Cersei Lannister", 42, houseLannister, Side.BAD, 1000);
		DBHelper.saveOrUpdate(currentRuler);

//		GoTWorld goTWorld = new GoTWorld("The world", currentRuler);
//		DBHelper.saveOrUpdate(goTWorld);

		Stark jonSnow = new Stark("Jon Snow", 22, houseStark, Side.GOOD, 50);
		DBHelper.saveOrUpdate(jonSnow);

		Direwolf ghost = new Direwolf( SpecialPower.MAULING, true, 150, 250, jonSnow);
		DBHelper.saveOrUpdate(ghost);




	}
}

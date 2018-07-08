import db.DBHelper;
import models.*;
import sun.security.pkcs11.Secmod;

public class Runner {
	public static void main(String[] args) {
		House houseStark = new House("Stark", 8000);
		House houseLannister = new House("Lannister",6000 );
		House houseTargaryen = new House("Targaryen",12000 );
		DBHelper.saveOrUpdate(houseStark);
		DBHelper.saveOrUpdate(houseLannister);
		DBHelper.saveOrUpdate(houseTargaryen);


		Ruler currentRuler = new Ruler("Cersei Lannister", 42, houseLannister, Side.BAD, 900);
		DBHelper.saveOrUpdate(currentRuler);


		Direwolf ghost = new Direwolf( SpecialPower.MAULING, true, 150, 250);
		DBHelper.saveOrUpdate(ghost);

		Stark jonSnow = new Stark("Jon Snow", 22, houseStark, Side.GOOD, 50, ghost);
		DBHelper.saveOrUpdate(jonSnow);

		GoTWorld goTWorld = new GoTWorld("The world", currentRuler);
		DBHelper.saveOrUpdate(goTWorld);




	}
}

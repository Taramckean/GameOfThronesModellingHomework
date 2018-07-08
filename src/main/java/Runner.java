import db.DBHelper;
import db.DBMysticalCreature;
import db.DBTargaryen;
import models.*;
import sun.security.pkcs11.Secmod;

import java.util.List;
import java.util.Set;

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


		Targaryen Daenerys = new Targaryen("Daenerys Targaryen", 22, houseTargaryen, Side.UNKNOWN, true);
		DBHelper.saveOrUpdate(Daenerys);

		Dragon Drogon = new Dragon(SpecialPower.FIREBREATHING, true, 500, 400, Daenerys);
		DBHelper.saveOrUpdate(Drogon);

		Dragon Rhaegal = new Dragon(SpecialPower.FIREBREATHING, true, 500, 400, Daenerys);
		DBHelper.saveOrUpdate(Rhaegal);


		Whitewalker oldestWW = new Whitewalker(SpecialPower.ICEPOWERS, false, 380, 300, true);
		DBHelper.saveOrUpdate(oldestWW);

		NightKing nightKing = new NightKing(SpecialPower.RAISINGDEAD, false, 600, 500, true);
		DBHelper.saveOrUpdate(nightKing);

		IceDragon Viserion = new IceDragon(SpecialPower.ICEBREATHING, false, 500, 400, oldestWW);
		DBHelper.saveOrUpdate(Viserion);

		Wight wight1 = new Wight(SpecialPower.FISTFIGHTING, false, 25, 75,100,  nightKing);
		DBHelper.saveOrUpdate(wight1);

		Wight wight2 = new Wight(SpecialPower.FISTFIGHTING, false, 25, 75,150,  nightKing);
		DBHelper.saveOrUpdate(wight2);


		Direwolf ghost = new Direwolf( SpecialPower.MAULING, true, 150, 250);
		DBHelper.saveOrUpdate(ghost);

		Stark jonSnow = new Stark("Jon Snow", 22, houseStark, Side.GOOD, 50, ghost);
		DBHelper.saveOrUpdate(jonSnow);


		Lannister JamieLannister = new Lannister("Jamie Lannister", 42, houseLannister, Side.GOOD, 150, 10000);
		DBHelper.saveOrUpdate(JamieLannister);


		IronThrone ironThrone = new IronThrone(1000, 500, currentRuler);
		DBHelper.saveOrUpdate(ironThrone);

		GoTWorld goTWorld = new GoTWorld("The world", currentRuler);
		DBHelper.saveOrUpdate(goTWorld);

		List<Dragon> dragonList = DBTargaryen.getDragonsForTargaryen(Daenerys);

		List<MysticalCreature> whichIsScariest = DBMysticalCreature.orderByScariness();


	}
}

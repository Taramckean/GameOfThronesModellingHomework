import db.DBHelper;
import models.*;

public class Runner {
	public static void main(String[] args) {

		House houseStark = new House("Stark", 8000);
		DBHelper.saveOrUpdate(houseStark);

		Stark jonSnow = new Stark("Jon Snow", 22, houseStark, Side.GOOD, 50);
		DBHelper.saveOrUpdate(jonSnow);

		Direwolf ghost = new Direwolf( SpecialPower.MAULING, true, 150, 250, jonSnow);
		DBHelper.saveOrUpdate(ghost);




	}
}

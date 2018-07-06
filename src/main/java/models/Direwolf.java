package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "direwolves")
public class Direwolf extends MysticalCreature{
	public Direwolf(){


	}

	public Direwolf(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, Stark stark) {
		super(specialPower, alive, strength, attackPoints);
	}



	public String howl(){
		return "AWOOOOOOOOO!";
	}
}

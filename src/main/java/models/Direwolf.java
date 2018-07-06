package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "direwolves")
public class Direwolf extends MysticalCreature{
	private Stark stark;

	public Direwolf(){


	}

	public Direwolf(SpecialPower specialPower, Boolean alive, int strength, int attackPoints) {
		super(specialPower, alive, strength, attackPoints);
		this.stark = stark;


	}
	@ManyToOne
	@JoinColumn(name="stark_id", nullable = false)
	public Stark getStark() {
		return stark;
	}



	public String howl(){
		return "AWOOOOOOOOO!";
	}

	public void setStark(Stark stark) {
		this.stark = stark;
	}
}

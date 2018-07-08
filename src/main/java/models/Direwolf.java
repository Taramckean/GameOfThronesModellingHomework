package models;

import javax.persistence.*;

@Entity
@Table(name = "direwolves")
public class Direwolf extends MysticalCreature{
	private Stark stark;

	public Direwolf(){


	}

	public Direwolf(SpecialPower specialPower, Boolean alive, int strength, int attackPoints) {
		super(specialPower, alive, strength, attackPoints);



	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stark_id", nullable = false)
	public Stark getStark() {
		return stark;
	}

	public void setStark(Stark stark) {
		this.stark = stark;
	}
	public String howl(){
		return "AWOOOOOOOOO!";
	}
}

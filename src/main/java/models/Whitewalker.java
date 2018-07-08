package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "whitewalkers")
public class Whitewalker extends MysticalCreature{
	private boolean areTheyBlue;
	private Set<IceDragon> iceDragons;

	public Whitewalker(){}

	public Whitewalker(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, boolean areTheyBlue) {
		super(specialPower, alive, strength, attackPoints);
		this.areTheyBlue = areTheyBlue;
	}
	@Column(name="areTheyBlue")
	public boolean isAreTheyBlue() {
		return areTheyBlue;
	}

	public void setAreTheyBlue(boolean areTheyBlue) {
		this.areTheyBlue = areTheyBlue;
	}
	@OneToMany(mappedBy = "whitewalker", fetch = FetchType.LAZY)
	public Set<IceDragon> getIceDragons() {
		return iceDragons;
	}

	public void setIceDragons(Set<IceDragon> iceDragons) {
		this.iceDragons = iceDragons;
	}
}

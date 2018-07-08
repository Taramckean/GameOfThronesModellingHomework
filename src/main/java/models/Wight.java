package models;
import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "wights")
public class Wight extends MysticalCreature{
	private int grossoutDeadFactor;
	private NightKing nightKing;

	public Wight(){

	}

	public Wight(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, int grossoutDeadFactor, NightKing nightKing) {
		super(specialPower, alive, strength, attackPoints);
		this.grossoutDeadFactor = grossoutDeadFactor;
		this.nightKing = nightKing;
	}
	@Column(name = "grossoutDeadFactor")
	public int getGrossoutDeadFactor() {
		return grossoutDeadFactor;
	}
	@ManyToOne
	@JoinColumn(name="nightKing_id", nullable = false)
	public NightKing getNightKing() {
		return nightKing;
	}

	public void setGrossoutDeadFactor(int grossoutDeadFactor) {
		this.grossoutDeadFactor = grossoutDeadFactor;
	}

	public void setNightKing(NightKing nightKing) {
		this.nightKing = nightKing;
	}
}

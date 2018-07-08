package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dragons")
public class Dragon extends MysticalCreature{
	private Targaryen targaryen;

	public Dragon(){}

	public Dragon(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, Targaryen targaryen) {
		super(specialPower, alive, strength, attackPoints);
		this.targaryen = targaryen;
	}
	@ManyToOne
	@JoinColumn(name="targaryen_id", nullable = true)
	public Targaryen getTargaryen() {
		return targaryen;
	}

	public void setTargaryen(Targaryen targaryen) {
		this.targaryen = targaryen;
	}
}

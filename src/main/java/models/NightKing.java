package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name ="NightKing")
public class NightKing extends Whitewalker{
private Set<Wight> wightArmy;


	public NightKing(){

	}

	public NightKing(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, boolean areTheyBlue) {
		super(specialPower, alive, strength, attackPoints, areTheyBlue);
	}
	@OneToMany(mappedBy = "nightking", fetch = FetchType.LAZY)
	public Set<Wight> getWightArmy() {
		return wightArmy;
	}

	public void setWightArmy(Set<Wight> wightArmy) {
		this.wightArmy = wightArmy;
	}
}

package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rulers")
public class Ruler extends Human{
	private int powerLevel;
	private IronThrone ironThrone;

	public Ruler(){

	}

	public Ruler(String name, int age, House house, int powerLevel) {
		super(name, age, house);
		this.powerLevel = powerLevel;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	@OneToOne(mappedBy = "ironThrone", fetch = FetchType.LAZY)
	public IronThrone getIronThrone() {
		return ironThrone;
	}

	public void setIronThrone(IronThrone ironThrone) {
		this.ironThrone = ironThrone;
	}
}


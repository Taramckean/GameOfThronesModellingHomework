package models;

import javax.persistence.*;

@Entity
@Table(name = "rulers")
public class Ruler extends Human {
	private int powerLevel;
	private GoTWorld goTWorld;
	private IronThrone ironThrone;

	public Ruler(){

	}

	public Ruler(String name, int age, House house, Side side, int powerLevel) {
		super(name, age, house, side);
		this.powerLevel = powerLevel;

	}
	@Column(name="powerLevel")
	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	@OneToOne(mappedBy = "ruler", fetch = FetchType.LAZY)
	public GoTWorld getGoTWorld() {
		return goTWorld;
	}


	public void setGoTWorld(GoTWorld goTWorld) {
		this.goTWorld = goTWorld;
	}

	@OneToOne(mappedBy = "ruler",fetch = FetchType.LAZY)
	public IronThrone getIronThrone() {
		return ironThrone;
	}

	public void setIronThrone(IronThrone ironThrone) {
		this.ironThrone = ironThrone;
	}
}


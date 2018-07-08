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
//		this.goTWorld = goTWorld;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruler_id", nullable = true)
	public GoTWorld getGoTWorld() {
		return goTWorld;
	}


	public void setGoTWorld(GoTWorld goTWorld) {
		this.goTWorld = goTWorld;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "throne_id", nullable = true)
	public IronThrone getIronThrone() {
		return ironThrone;
	}

	public void setIronThrone(IronThrone ironThrone) {
		this.ironThrone = ironThrone;
	}
}


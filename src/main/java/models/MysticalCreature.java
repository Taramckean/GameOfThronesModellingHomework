package models;

import javax.persistence.*;
import javax.xml.ws.BindingType;

@Entity
@Table(name ="mysticalCreatures")
@Inheritance(strategy = InheritanceType.JOINED)
public class MysticalCreature {
	private int id;
	private SpecialPower specialPower;
	private Boolean alive;
	private int strength;
	private int attackPoints;
	private Stark stark;
	private GoTWorld goTWorld;


	public MysticalCreature(){

	}

	public MysticalCreature(SpecialPower specialPower, Boolean alive, int strength, int attackPoints) {
		this.specialPower = specialPower;
		this.alive = alive;
		this.strength = strength;
		this.attackPoints = attackPoints;

	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	public int getId() {
		return id;
	}

	@Enumerated(value = EnumType.STRING)
	public Enum getSpecialPower() {
		return specialPower;
	}
	@Column(name ="alive")
	public Boolean getAlive() {
		return alive;
	}
	@Column(name ="strength")
	public int getStrength() {
		return strength;
	}
	@Column(name ="attackPoints")
	public int getAttackPoints() {
		return attackPoints;
	}

	@ManyToOne
	@JoinColumn(name="got_id", nullable = false)
	public GoTWorld getGoTWorld() {
		return goTWorld;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setSpecialPower(SpecialPower specialPower) {
		this.specialPower = specialPower;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}


	public void setGoTWorld(GoTWorld goTWorld) {
		this.goTWorld = goTWorld;
	}
}

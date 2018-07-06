package models;

import javax.persistence.*;
import javax.xml.ws.BindingType;

@Entity
@Table(name ="mysticalCreatures")
@Inheritance(strategy = InheritanceType.JOINED)
public class MysticalCreature {
	private int id;
	private String type;
	private SpecialPower specialPower;
	private Boolean alive;
	private int strength;
	private int attackPoints;
	private Stark stark;
	private Targaryen targaryen;


	public MysticalCreature(){

	}

	public MysticalCreature(String type, SpecialPower specialPower, Boolean alive, int strength, int attackPoints) {
		this.type = type;
		this.specialPower = specialPower;
		this.alive = alive;
		this.strength = strength;
		this.attackPoints = attackPoints;
		this.stark = stark;
		this.targaryen = targaryen;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	public int getId() {
		return id;
	}
	@Column(name ="type")
	public String getType() {
		return type;
	}
	@Enumerated(value = EnumType.STRING)
	public Enum getSpecialPower() {
		return specialPower;
	}
	@Column(name ="alive")
	public Boolean getLivingOrDead() {
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
	@JoinColumn(name="stark_id", nullable = false)
	public Stark getStark() {
		return stark;
	}

	@ManyToOne
	@JoinColumn(name="targaryen_id", nullable = false)
	public Targaryen getTargaryen() {
		return targaryen;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSpecialPower(SpecialPower specialPower) {
		this.specialPower = specialPower;
	}

	public void setLivingOrDead(Boolean alive) {
		this.alive = alive;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public void setStark(Stark stark) {
		this.stark = stark;
	}

	public void setTargaryen(Targaryen targaryen) {
		this.targaryen = targaryen;
	}
}

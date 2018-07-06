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
	private Boolean livingOrDead;
	private int strength;
	private int attackPoints;
	private MagicHuman magicHuman;


	public MysticalCreature(){

	}

	public MysticalCreature(String type, SpecialPower specialPower, Boolean livingOrDead, int strength, int attackPoints) {
		this.type = type;
		this.specialPower = specialPower;
		this.livingOrDead = livingOrDead;
		this.strength = strength;
		this.attackPoints = attackPoints;
		this.magicHuman = magicHuman;
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
	@Column(name ="livingOrDead")
	public Boolean getLivingOrDead() {
		return livingOrDead;
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
	@JoinColumn(name="magicHuman_id", nullable = false)
	public MagicHuman getMagicHuman() {
		return magicHuman;
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

	public void setLivingOrDead(Boolean livingOrDead) {
		this.livingOrDead = livingOrDead;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public void setMagicHuman(MagicHuman magicHuman) {
		this.magicHuman = magicHuman;
	}
}

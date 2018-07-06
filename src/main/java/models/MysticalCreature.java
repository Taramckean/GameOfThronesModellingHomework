package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.ws.BindingType;

@Entity
@Table(name ="mystical_creatures")
public class MysticalCreature {
	private int id;
	private Enum specialPower;
	private Boolean livingOrDead;
	private int strength;
	private int attackPoints;

	public MysticalCreature(){

	}

	pu
}

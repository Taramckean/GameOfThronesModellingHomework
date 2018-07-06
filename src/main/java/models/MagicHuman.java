package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="magicHumans")
public class MagicHuman extends Human{
	private MysticalCreature mysticalCreature;

	public MagicHuman(){

	}

	public MagicHuman(String name, int age, House house, MysticalCreature mysticalCreature) {
		super(name, age, house);
		this.mysticalCreature = mysticalCreature;
	}

	@OneToMany
			(mappedBy = "magicHuman", fetch = FetchType.LAZY)
	public MysticalCreature getMysticalCreature() {
		return mysticalCreature;
	}

	public void setMysticalCreature(MysticalCreature mysticalCreature) {
		this.mysticalCreature = mysticalCreature;
	}
}

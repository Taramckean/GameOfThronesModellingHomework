package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "targaryens")
public class Targaryen extends Human{
	private MysticalCreature mysticalCreature;
	private boolean mad;

	public Targaryen(){

	}

	public Targaryen(String name, int age, House house, boolean mad) {
		super(name, age, house);
		this.mad = mad;
		this.mysticalCreature = mysticalCreature;
	}

	public boolean isMad() {
		return mad;
	}

	public void setMad(boolean mad) {
		this.mad = mad;
	}

	@OneToMany
			(mappedBy = "targaryen", fetch = FetchType.LAZY)
	public MysticalCreature getMysticalCreature() {
		return mysticalCreature;
	}

	public void setMysticalCreature(MysticalCreature mysticalCreature) {
		this.mysticalCreature = mysticalCreature;
	}


}

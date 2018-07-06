package models;

import javax.persistence.*;

@Entity
@Table(name="starks")
public class Stark extends Human{
	private MysticalCreature mysticalCreature;
	private int grumpinessLevel;


	public Stark(){

	}

	public Stark(String name, int age, House house, int grumpinessLevel) {
		super(name, age, house);
		this.grumpinessLevel = grumpinessLevel;
		this.mysticalCreature = mysticalCreature;
	}

	public int getGrumpinessLevel() {
		return grumpinessLevel;
	}


	public void setGrumpinessLevel(int grumpinessLevel) {
		this.grumpinessLevel = grumpinessLevel;
	}
	@OneToMany
			(mappedBy = "stark", fetch = FetchType.LAZY)
	public MysticalCreature getMysticalCreature() {
		return mysticalCreature;
	}

	public void setMysticalCreature(MysticalCreature mysticalCreature) {
		this.mysticalCreature = mysticalCreature;
	}
}

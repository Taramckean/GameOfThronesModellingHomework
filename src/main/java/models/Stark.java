package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="starks")
public class Stark extends Human{
	private List<MysticalCreature> mysticalCreatures;
	private int grumpinessLevel;


	public Stark(){

	}

	public Stark(String name, int age, House house, Side side, int grumpinessLevel) {
		super(name, age, house, side);
		this.grumpinessLevel = grumpinessLevel;
		this.mysticalCreatures = new ArrayList<MysticalCreature>();
	}

	public int getGrumpinessLevel() {
		return grumpinessLevel;
	}


	public void setGrumpinessLevel(int grumpinessLevel) {
		this.grumpinessLevel = grumpinessLevel;
	}
	@OneToMany
			(mappedBy = "stark", fetch = FetchType.LAZY)
	public List<MysticalCreature> getMysticalCreatures() {
		return mysticalCreatures;
	}

	public void setMysticalCreatures(List<MysticalCreature> mysticalCreatures) {
		this.mysticalCreatures = mysticalCreatures;
	}
}

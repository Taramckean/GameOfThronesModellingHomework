package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "targaryens")
public class Targaryen extends Human{
	private List<MysticalCreature> mysticalCreatures;
	private boolean mad;

	public Targaryen(){

	}

	public Targaryen(String name, int age, House house, Side side,  boolean mad) {
		super(name, age, house, side);
		this.mad = mad;
		this.mysticalCreatures = new ArrayList<MysticalCreature>();
	}

	public boolean isMad() {
		return mad;
	}

	public void setMad(boolean mad) {
		this.mad = mad;
	}


	@OneToMany
			(mappedBy = "targaryen", fetch = FetchType.LAZY)
	public List<MysticalCreature> getMysticalCreatures() {
		return mysticalCreatures;
	}

	public void setMysticalCreatures(List<MysticalCreature> mysticalCreatures) {
		this.mysticalCreatures = mysticalCreatures;
	}
}

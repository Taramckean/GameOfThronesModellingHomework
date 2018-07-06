package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gotWorld")
public class GoTWorld {
	private int id;
	private String name;
	private Ruler ruler;
	private List<Human> people;
	private List <MysticalCreature> mysticalCreatures;

	public GoTWorld(){

	}

	public GoTWorld(String name, Ruler ruler) {
		this.name = name;
		this.ruler = ruler;
		this.people = new ArrayList<Human>();
		this.mysticalCreatures = new ArrayList<MysticalCreature>(mysticalCreatures);
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	public int getId() {
		return id;
	}
	@Column(name ="name")
	public String getName() {
		return name;
	}
	@OneToOne(mappedBy = "goTWorld", fetch = FetchType.LAZY)
	public Ruler getRuler() {
		return ruler;
	}
	@OneToMany(mappedBy="goTWorld", fetch = FetchType.LAZY)
	public List<Human> getPeople() {
		return people;
	}
	@OneToMany(mappedBy="goTWorld", fetch = FetchType.LAZY)
	public List<MysticalCreature> getMysticalCreatures() {
		return mysticalCreatures;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRuler(Ruler ruler) {
		this.ruler = ruler;
	}

	public void setPeople(List<Human> people) {
		this.people = people;
	}

	public void setMysticalCreatures(List<MysticalCreature> mysticalCreatures) {
		this.mysticalCreatures = mysticalCreatures;
	}
}

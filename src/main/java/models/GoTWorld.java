package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "gotWorld")
public class GoTWorld {
	private int id;
	private String name;
	private Ruler ruler;

	public GoTWorld(){

	}

	public GoTWorld(String name, Ruler ruler) {
		this.name = name;
		this.ruler = ruler;
//		this.people = new ArrayList<Human>();
//		this.mysticalCreatures = new ArrayList<MysticalCreature>();
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
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="gotworld_id", nullable = false)
	public Ruler getRuler() {
		return ruler;
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


}

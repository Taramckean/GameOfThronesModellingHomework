package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="houses")
public class House {
	private int id;
	private String name;
	private int age;
	private List<Human> descendants;

	public House(){

	}

	public House(String name, int age) {
		this.name = name;
		this.age = age;
		this.descendants = descendants;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	@Column(name = "age")
	public int getAge() {
		return age;
	}
	@OneToMany(mappedBy = "house", fetch = FetchType.LAZY)
	public List<Human> getDescendants() {
		return descendants;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescendants(List<Human> descendants) {
		this.descendants = descendants;
	}
}

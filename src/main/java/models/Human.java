package models;

import javax.persistence.*;

@Entity
@Table(name ="humans")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Human {
	private int id;
	private String name;
	private int age;
	private House house;

	public Human(){

	}

	public Human(String name, int age, House house) {
		this.name = name;
		this.age = age;
		this.house = house;
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
	@ManyToOne
	@JoinColumn(name = "house_id", nullable = false)
	public House getHouse() {
		return this.house;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}


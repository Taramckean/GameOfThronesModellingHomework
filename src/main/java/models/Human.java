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
	private Side side;
	private GoTWorld goTWorld;

	public Human(){

	}

	public Human(String name, int age, House house, Side side) {
		this.name = name;
		this.age = age;
		this.house = house;
		this.side = side;
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
	@Enumerated(value = EnumType.STRING)
	public Side getSide() {
		return side;
	}

	@ManyToOne
	@JoinColumn(name = "house_id", nullable = false)
	public House getHouse() {
		return this.house;
	}
	@ManyToOne
	@JoinColumn(name = "got_id", nullable = false)
	public GoTWorld getGoTWorld() {
		return goTWorld;
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

	public void setSide(Side side) {
		this.side = side;
	}

	public void setGoTWorld(GoTWorld goTWorld) {
		this.goTWorld = goTWorld;
	}
}


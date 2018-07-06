package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lannisters")
public class Lannister extends Human {
	private int arroganceLevel;
	private int money;

	public Lannister(){

	}

	public Lannister(String name, int age, House house, int arroganceLevel, int money) {
		super(name, age, house);
		this.arroganceLevel = arroganceLevel;
		this.money = money;
	}

	public int getArroganceLevel() {
		return arroganceLevel;
	}

	public int getMoney() {
		return money;
	}

	public void setArroganceLevel(int arroganceLevel) {
		this.arroganceLevel = arroganceLevel;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

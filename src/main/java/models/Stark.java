package models;

import javax.persistence.*;

@Entity
@Table(name="starks")
public class Stark extends Human{
	private int grumpinessLevel;


	public Stark(){

	}

	public Stark(String name, int age, House house, int grumpinessLevel) {
		super(name, age, house);
		this.grumpinessLevel = grumpinessLevel;
	}

	public int getGrumpinessLevel() {
		return grumpinessLevel;
	}


	public void setGrumpinessLevel(int grumpinessLevel) {
		this.grumpinessLevel = grumpinessLevel;
	}
}

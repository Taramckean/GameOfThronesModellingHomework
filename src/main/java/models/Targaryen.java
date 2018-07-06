package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "targaryens")
public class Targaryen extends MagicHuman{
	private boolean mad;

	public Targaryen(){

	}

	public Targaryen(String name, int age, House house, boolean mad) {
		super(name, age, house);
		this.mad = mad;
	}

	public boolean isMad() {
		return mad;
	}

	public void setMad(boolean mad) {
		this.mad = mad;
	}
}

package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="starks")
public class Stark extends Human{
	private Direwolf direwolf;
	private int grumpinessLevel;


	public Stark(){

	}

	public Stark(String name, int age, House house, Side side, int grumpinessLevel, Direwolf direwolf) {
		super(name, age, house, side);
		this.grumpinessLevel = grumpinessLevel;
		this.direwolf = direwolf;
	}
	@Column(name="grumpinesslevel")
	public int getGrumpinessLevel() {
		return grumpinessLevel;
	}


	public void setGrumpinessLevel(int grumpinessLevel) {
		this.grumpinessLevel = grumpinessLevel;
	}
	@OneToOne(mappedBy = "stark", fetch = FetchType.LAZY)
	public Direwolf getDirewolf() {
		return direwolf;
	}

	public void setDirewolf(Direwolf direwolf) {
		this.direwolf = direwolf;
	}
}

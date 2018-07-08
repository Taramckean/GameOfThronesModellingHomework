package models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "targaryens")
public class Targaryen extends Human {
	private Set<Dragon> dragons;
	private boolean mad;

	public Targaryen() {

	}

	public Targaryen(String name, int age, House house, Side side, boolean mad) {
		super(name, age, house, side);
		this.mad = mad;
//		this.dragons = new ArrayList<Dragon>();
	}
	@Column(name="isMad")
	public boolean isMad() {
		return mad;
	}

	public void setMad(boolean mad) {
		this.mad = mad;
	}


	@OneToMany(mappedBy = "targaryen", fetch = FetchType.LAZY)
	public Set<Dragon> getDragons() {
		return dragons;
	}

	public void setDragons(Set<Dragon> dragons) {
		this.dragons = dragons;
	}
}


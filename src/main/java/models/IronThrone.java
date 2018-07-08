package models;

import javax.persistence.*;

@Entity
@Table(name = "ironThrone")
public class IronThrone {
	private int id;
	private int noOfSwords;
	private int painfulnessFactor;
	private Ruler ruler;

	public IronThrone(){

	}

	public IronThrone(int noOfSwords, int painfulnessFactor, Ruler ruler) {
		this.noOfSwords = noOfSwords;
		this.painfulnessFactor = painfulnessFactor;
		this.ruler = ruler;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	public int getId() {
		return id;
	}
	@Column(name ="noOfSwords")
	public int getNoOfSwords() {
		return noOfSwords;
	}
	@Column(name ="painfulnessFactor")
	public int getPainfulnessFactor() {
		return painfulnessFactor;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruler_id", nullable = false)
	public Ruler getRuler() {
		return ruler;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNoOfSwords(int noOfSwords) {
		this.noOfSwords = noOfSwords;
	}

	public void setPainfulnessFactor(int painfulnessFactor) {
		this.painfulnessFactor = painfulnessFactor;
	}

	public void setRuler(Ruler ruler) {
		this.ruler = ruler;
	}
}

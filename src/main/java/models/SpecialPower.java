package models;

public enum SpecialPower {
	FIREBREATHING(400),
	ICEBREATHING(400),
	FISTFIGHTING(50),
	MAULING(150),
	ICEPOWERS(200),
	RAISINGDEAD(300);


	private int damageValue;

	SpecialPower(int damageValue) {
		this.damageValue = damageValue;
	}

	public int getDamageValue() {
		return damageValue;
	}

}


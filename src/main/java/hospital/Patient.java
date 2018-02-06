package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_BLOODS = 42;
	static final int DEFAULT_HEALTH = 70;

	private int bloods = DEFAULT_BLOODS;
	private int health = DEFAULT_HEALTH;

	public Patient() {
	}

	public Patient(int incomingHealth) {
		this.health = incomingHealth;
	}

	public int getBloods() {
		return bloods;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int updateHealth(int amount) {
		setHealth(getHealth() + amount);
		return getHealth();
	}

	public void removeBlood(int amount) {
		bloods -= amount;
	}
}

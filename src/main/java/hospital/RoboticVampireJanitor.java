package hospital;

public class RoboticVampireJanitor extends VampireJanitor implements BatteriesRequired {

	private static final int STARTING_BATTERY_LEVEL = 75;
	private int batteryLevel;

	public RoboticVampireJanitor(String employeeName, String employeeNumber) {
		super(employeeName, employeeNumber);
		patientHealth = super.VAMPIRE_HEAL_VALUE;
		this.setBatteryLevel(STARTING_BATTERY_LEVEL);
	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	@Override
	public int careForPatient(Patient patient) {
		patient.updateHealth(patientHealth);
		setBatteryLevel(getBatteryLevel() + (patientHealth / 3));
		return patient.getHealth();
	}

	@Override
	public void drawBlood(Bleedable bleeder, int amount) {
		bleeder.removeBlood(amount);
		setBatteryLevel(getBatteryLevel() + amount);
	}

	@Override
	public int getBatteryLevel() {
		return batteryLevel;
	}

	@Override
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + "Battery Level: " + batteryLevel;

	}

}

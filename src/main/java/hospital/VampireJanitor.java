package hospital;

public class VampireJanitor extends Janitor implements Phlebotomist,MedicalDuties {

	protected final int VAMPIRE_HEAL_VALUE = -25;

	public VampireJanitor(String employeeName, String employeeNumber) {
		super(employeeName, employeeNumber);
		patientHealth = VAMPIRE_HEAL_VALUE;
	}

	@Override
	public int calculatePay() {
		return 40000;
	}
	
	@Override
	public int careForPatient(Patient patient) {
		patient.updateHealth(patientHealth);
		return patient.getHealth();
	}

}

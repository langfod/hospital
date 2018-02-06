package hospital;

public class Nurse extends Employee implements Phlebotomist,MedicalDuties {

	private int numPatients;

	protected Nurse(String employeeName, String employeeNumber, int numPatients) {
		super(employeeName, employeeNumber);
		this.setNumPatients(numPatients);
	}
	
	protected Nurse(String employeeName, String employeeNumber) {
		this(employeeName, employeeNumber, 0);
	}

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public int careForPatient(Patient patient) {
		patient.updateHealth(patientHealth);
		return patient.getHealth();
	}

	public int getNumPatients() {
		return numPatients;
	}

	public void setNumPatients(int numPatients) {
		this.numPatients = numPatients;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+"Patients: "+getNumPatients();
				
	}

}

package hospital;

public class Doctor extends Employee implements Phlebotomist,MedicalDuties {
	
	private static final int DOCTORS_HEAL_VALUE = 15;
	private String specialty;
	
	public Doctor(String employeeName, String employeeNumber, String specialty) {
		super(employeeName, employeeNumber);
		this.specialty = specialty;
		patientHealth = DOCTORS_HEAL_VALUE;
	}

	@Override
	public int calculatePay() {
		return 95000;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"Specialty: "+specialty;
				
	}

	@Override
	public int careForPatient(Patient patient) {
		patient.updateHealth(patientHealth);
		return patient.getHealth();
	}
}

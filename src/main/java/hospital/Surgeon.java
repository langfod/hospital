package hospital;

public class Surgeon extends Doctor implements MedicalDuties {

	private static final int SURGEONS_HEAL_VALUE = 25;
	private boolean operating;
	
	public Surgeon(String employeeName, String employeeNumber, String specialty) {
		super(employeeName, employeeNumber, specialty);
		patientHealth = SURGEONS_HEAL_VALUE ;
		this.setOperating(false);
	}

	@Override
	public int calculatePay() {
		return 120000;
	}

	public boolean isOperating() {
		return operating;
	}

	public void setOperating(boolean operating) {
		this.operating = operating;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+(operating?"Operating":"Not Operating");
				
	}
	


}

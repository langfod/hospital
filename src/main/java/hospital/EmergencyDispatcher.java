package hospital;

public class EmergencyDispatcher extends Nurse implements PhoneUser,MedicalDuties,Phlebotomist {

	private boolean onPhone = false;

	protected EmergencyDispatcher(String employeeName, String employeeNumber, String specialty) {
		super(employeeName, employeeNumber);
	}

	@Override
	public int calculatePay() {
		return 45000;
	}

	@Override
	public boolean isOnPhone() {
		return this.onPhone;
	}
	
	@Override
	public void setCurrentPhoneUsage(boolean currentPhoneUsage) {
		this.onPhone = currentPhoneUsage;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+(isOnPhone()?"On phone":"Off Phone");
				
	}

}

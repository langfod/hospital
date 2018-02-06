package hospital;

public class Receptionist extends Employee implements PhoneUser {

	private boolean onPhone = false;

	protected Receptionist(String employeeName, String employeeNumber) {
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

package hospital;

public abstract class Employee {

	protected int patientHealth = 10;
	private String employeeName;
	private String employeeNumber;

	public abstract int calculatePay();

	protected Employee(String employeeName, String employeeNumber) {
		setEmployeeName(employeeName);
		setEmployeeNumber(employeeNumber);
	}

	int getPatientHealth() {
		return patientHealth;
	}

	void setPatientHealth(int patientHealth) {
		this.patientHealth = patientHealth;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	void setEmployeeNumber(String number) {
		employeeNumber = number;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	void setEmployeeName(String name) {
		employeeName = name;
	}
	
	public String toString() {
		return employeeName+"\t"+employeeNumber;
	}

}

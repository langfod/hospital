package hospital;

public class Janitor extends Employee implements Sweeper {



	private boolean sweeping;

	protected Janitor(String employeeName, String employeeNumber) {
		super(employeeName, employeeNumber);
		this.setSweeping(false);
	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	@Override
	public boolean isSweeping() {
		return sweeping;
	}

	@Override
	public void setSweeping(boolean sweeping) {
		this.sweeping = sweeping;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+(isSweeping()?"Sweeping":"Not Sweeping");
				
	}

}

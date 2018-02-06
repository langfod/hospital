package hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalApp {

	@SuppressWarnings("serial")
	public static void main(String[] args) {

		Map<String, Employee> employees = new HashMap<String, Employee>() {
			{
				Employee emp = new Janitor("Bob", "0002");
				put(emp.getEmployeeNumber(), emp);
				emp = new Janitor("Steve", "0023");
				put(emp.getEmployeeNumber(), emp);
				emp = new VampireJanitor("Vlad", "0222");
				put(emp.getEmployeeNumber(), emp);
				emp = new RoboticVampireJanitor("Vlad2.0", "0009");
				put(emp.getEmployeeNumber(), emp);
				emp = new Receptionist("Rhonda", "0231");
				put(emp.getEmployeeNumber(), emp);
				emp = new Nurse("Jake", "1023", 2);
				put(emp.getEmployeeNumber(), emp);
				emp = new Nurse("Jill", "2243", 6);
				put(emp.getEmployeeNumber(), emp);
				emp = new Doctor("Phil", "4567", "Toes");
				put(emp.getEmployeeNumber(), emp);
				emp = new Doctor("Sarah", "8387", "Funny Bones");
				put(emp.getEmployeeNumber(), emp);
				emp = new Surgeon("Smithy", "4532", "Bleeding Hearts");
				put(emp.getEmployeeNumber(), emp);
				emp = new EmergencyDispatcher("Jane", "8764", "Field Medic");
				put(emp.getEmployeeNumber(), emp);
			}
		};

		System.out.println("Here are the employees at High St. Hospital");
		employees.values().forEach(System.out::println);

		System.out.println("\nHere are the pay rates at High St. Hospital");
		employees.values().forEach(emp -> {
			String employeeName = emp.getEmployeeName();
			int employeePay = emp.calculatePay();
			System.out.println(employeeName + " gets paid a salary of $" + employeePay + " per year.");
		});

		System.out.println("\nSome Employees can draw blood");
		employees.values().forEach(emp -> {
			if (emp instanceof Phlebotomist) {
				String employeeName = emp.getEmployeeName();
				String className = emp.getClass().getSimpleName();
				System.out.println(employeeName + " the " + className + " can draw blood.");
			}
		});

		System.out.println("\nSome Employees can administer patient care");
		employees.values().forEach(emp -> {
			if (emp instanceof MedicalDuties) {
				String employeeName = emp.getEmployeeName();
				String className = emp.getClass().getSimpleName();
				Patient guineaPig = new Patient();
				int oldHealth = guineaPig.getHealth();
				int newHealth = ((MedicalDuties) emp).careForPatient(guineaPig);
				System.out.println(employeeName + " the " + className + " has increased patient health from "
						+ oldHealth + " to " + newHealth + ".");
			}
		});
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("\nEnter an employee name (or quit):");
			String name = input.nextLine();
			if ("quit".equals(name))
				break;
			employees.values().stream().filter(e -> e.getEmployeeName().equals(name)).forEach(System.out::println);
		}

		input.close();

	}// Main
}

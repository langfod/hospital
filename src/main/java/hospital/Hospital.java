package hospital;

import java.util.ArrayList;
import java.util.Collection;

public class Hospital {

	// private Map<String, Employee> employees = new HashMap<String, Employee>() {
	// {
	// Employee emp = new Janitor("Bob", "0002");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Janitor("Steve", "0023");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new VampireJanitor("Vlad", "0222");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Receptionist("John", "0009");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Receptionist("Rhonda", "0231");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Nurse("Jake", "1023",2);
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Nurse("Jill", "2243",6);
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Doctor("Phil", "4567", "Toes");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Doctor("Sarah", "8387", "Funny Bones");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new Surgeon("Smithy", "4532", "Bleeding Hearts");
	// put(emp.getEmployeeNumber(), emp);
	// emp = new EmergencyDispatcher("Jane", "8764", "Field Medic");
	// put(emp.getEmployeeNumber(), emp);
	// }
	// };

	private Collection<Employee> employees = new ArrayList<>();

	public void addEmp(Employee employee) {
		employees.add(employee);
	}

	public Collection<Employee> getAllEmployees() {
		return employees;
	}

}

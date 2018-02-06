
package hospital;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	Hospital hospitalUnderTest = new Hospital();
	
	
//	@Test
//	public void shouldAddDoctor() {
//		Employee empUnderTest = new Doctor("Bob", "111", "leeching");
//		hospitalUnderTest.addEmp(empUnderTest);
//		Collection<Employee> empList = hospitalUnderTest.getAllEmployees();
//		assertThat(empList, contains(empUnderTest));
//	}
//	
//
//	@Test
//	public void shouldAddNurse() {
//		Employee empUnderTest = new Nurse("Bob", "111");
//		hospitalUnderTest.addEmp(empUnderTest);
//		Collection<Employee> empList = hospitalUnderTest.getAllEmployees();
//		assertThat(empList, contains(empUnderTest));
//	}
//	
//	@Test
//	public void shouldAddJanitor() {
//		Employee empUnderTest = new Janitor("Bob", "111");
//		hospitalUnderTest.addEmp(empUnderTest);
//		Collection<Employee> empList = hospitalUnderTest.getAllEmployees();
//		assertThat(empList, contains(empUnderTest));
//	}
	
	@Test
	public void shouldAddVarious() {
		Employee janitorUnderTest = new Janitor("Bob", "111");
		Employee docUnderTest = new Doctor("Phil", "113", "leeching");
		Employee nurseUnderTest = new Nurse("Jane", "112");

		hospitalUnderTest.addEmp(janitorUnderTest);
		hospitalUnderTest.addEmp(docUnderTest);
		hospitalUnderTest.addEmp(nurseUnderTest);

		Collection<Employee> empList = hospitalUnderTest.getAllEmployees();
		
		assertThat(empList, containsInAnyOrder(janitorUnderTest,nurseUnderTest,docUnderTest));

	}
	
	

}

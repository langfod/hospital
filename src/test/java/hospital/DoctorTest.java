package hospital;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class DoctorTest {
	private static Doctor underTest = new Doctor("Bob", "111", "foot stuff");

	@Test
	public void shouldDoctorDrawBlood() {
		Patient patientUnderTest = new Patient();
		int bloodsBefore = patientUnderTest.getBloods();
		underTest.drawBlood(patientUnderTest);
		int bloodsAfter = patientUnderTest.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}

	boolean wasBled = false;

	public class BleedableTestDummy implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}

	}

	@Test
	public void shouldDrawBloodFromDouble() {
		Bleedable bagOfMostlyWater = new BleedableTestDummy();
		underTest.drawBlood(bagOfMostlyWater);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveSalary() {
		int salary = underTest.calculatePay();
		assertThat(salary, is(95000));

	}

	@Test
	public void shouldHaveDefaultPatientHealthTen() {
		int patientHealth = underTest.getPatientHealth();
		assertThat(patientHealth, is(10));
	}

	@Test
	public void shouldSettingPatientHealth() {
		underTest.setPatientHealth(42);
		assertThat(underTest.getPatientHealth(), is(42));
	}

}

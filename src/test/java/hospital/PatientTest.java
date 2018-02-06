package hospital;

import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Test;

public class PatientTest {
	
	@Test
	public void patientDrawBlood() {
		Patient underTest = new Patient();
		underTest.removeBlood(3);
		Assert.assertThat(underTest.getBloods(),is(Patient.DEFAULT_BLOODS - 3));
	}

}

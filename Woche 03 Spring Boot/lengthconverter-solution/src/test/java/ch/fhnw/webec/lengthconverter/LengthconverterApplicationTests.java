package ch.fhnw.webec.lengthconverter;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.ui.ConcurrentModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertControllerTest {

	@Test
	void testConvertController() {
		// Create a new instance of the controller
		ConvertController controller = new ConvertController();

		// Set input values
		int feet = 5;
		int inches = 10;

		// Create a model to hold the attributes
		Model model = new ConcurrentModel();

		// Call the convert method
		String viewName = controller.convert(feet, inches, model);

		// Verify that the view name is "convert"
		assertEquals("convert", viewName);

		// Verify that the model contains the expected attributes
		assertEquals(feet, model.getAttribute("feet"));
		assertEquals(inches, model.getAttribute("inches"));

		// Calculate the expected cm and mm values
		double cm = 30.48 * feet + 2.54 * inches;
		int cmPart = (int) cm;
		int mmPart = (int) (cm * 10 % 10);

		// Verify that the model contains the expected cm and mm values
		assertEquals(cmPart, model.getAttribute("cmPart"));
		assertEquals(mmPart, model.getAttribute("mmPart"));
	}
}


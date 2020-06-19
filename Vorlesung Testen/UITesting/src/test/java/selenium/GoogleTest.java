package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.htwg.selenium.HtwgWebDriver;

class GoogleTest {
	
	private HtwgWebDriver htwgWebDriver;

	@BeforeEach
	void setUpBeforeTest() throws Exception {
		htwgWebDriver = new HtwgWebDriver(); // "--headless"
	}

	@AfterEach
	void tearDownAfterTest() throws Exception {
		htwgWebDriver = null;
	}

	@Test
	void testGoogle() throws Exception {

	}
}

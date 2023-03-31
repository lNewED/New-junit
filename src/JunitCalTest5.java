import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitCalTest5 {
	
	Calculator c1 = new Calculator();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddnumber1() {
		c1.addnumber(6,6);
		assertEquals(12,c1.getResult());
	}
	
	@Test
	void testAddnumber2() {
		c1.addnumber(10,10);
		assertEquals(20,c1.getResult());
	}

}

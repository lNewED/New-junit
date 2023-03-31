import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitCalTest4 {
	Calculator c1 = new Calculator();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddnumber1() {
			c1.addnumber(6,6);
			assertEquals(12,c1.getResult());
	}
	
	@Test
	public void testAddnumber2() {
			c1.addnumber(10,10);
			assertEquals(20,c1.getResult());
	}
}

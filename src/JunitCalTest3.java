import junit.framework.TestCase;

public class JunitCalTest3 extends TestCase {
	Calculator c1;
	protected void setUp() throws Exception {
		c1 = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAddnumber1() {
		c1.addnumber(6,6);
		assertEquals(12,c1.getResult());
	}
	public void testAddnumber2() {
		c1.addnumber(10,10);
		assertEquals(20,c1.getResult());
	}

}

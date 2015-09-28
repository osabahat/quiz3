package quiz3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {


	Triangle t;
	
	@Before
	public void setUp(){
		t = new Triangle();
	}

	@After
	
	public void tearDown(){
		t = null;
	}

	@Test
	public void test() {
		t.side1 = 3.0;
		t.side2 = 4.0;
		t.side3 = 5.0;
		
		assertTrue(t.getArea()==6);
		assertTrue(t.getPerimeter()==12);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}

import junit.framework.TestCase;

public class Test1CircleArea extends TestCase {

	public void testArea() {
		//fail("Not yet implemented");
		Circle c = new Circle();
		Float t=c.area(1);
		assertEquals((Double)Math.PI,t);
	}

}

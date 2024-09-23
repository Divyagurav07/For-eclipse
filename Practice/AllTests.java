import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {
	
	/**
	 * regular
	 * @author Divya gurav
	 * @param
	 * @return
	 * since 01-01-2000
	 * @version 1.0
	 * @exception
	 */

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TriangleTest.class);
		suite.addTestSuite(TriangleTest2.class);
		//$JUnit-END$
		return suite;
	}

}

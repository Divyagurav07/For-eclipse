import junit.framework.TestCase;

public class RectangleAreaTest extends TestCase {
	public void Testareavl() {
		RectangleArea R = new RectangleArea();
		R.setLength(3);
		R.setBreadth(2);
		float Y=R.area();
		System.out.println(Y);
		assertEquals((float)6,Y);
	}

}

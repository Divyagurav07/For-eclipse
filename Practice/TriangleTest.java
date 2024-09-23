import junit.framework.TestCase;

public class TriangleTest extends TestCase {
	public void testareaval() {
		Triangle t1=new Triangle();
		t1.setB(2);
		t1.setH(4);
		float Y=t1.area();
		assertEquals((float)4,Y); //pass
	}
	public void testareaval1() {
		Triangle t2=new Triangle();
		t2.setB(2);
		t2.setH(4);
		float Y=t2.area();
		assertEquals((float)5,Y); //fail
	}
	public void testareaval3() {
		Triangle t3=new Triangle();
		t3.setB(4);
		t3.setH(4);
		float Y=t3.area();
		assertEquals((float)8,Y); //pass
	}	
	
	public void testareaval4() {
		Triangle t4=new Triangle();
		t4.setB(2);
		t4.setH(4);
		float Y=t4.area();
		assertEquals((float)8,Y); //fail
	}
	
			
	}


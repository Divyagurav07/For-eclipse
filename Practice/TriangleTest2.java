import junit.framework.TestCase;
public class TriangleTest2 extends TestCase {
	public void testperi() {
		Triangle t1=new Triangle();
		t1.setA(4);
		t1.setB(2);
		t1.setC(4);
		float P=t1.peri();
		assertEquals((float)4,P); //fail
	}
	public void testperi2() {
		Triangle t2=new Triangle();
		t2.setA(7);
		t2.setB(2);
		t2.setC(4);
		float Y=t2.peri();
		assertEquals((float)13,Y); //pass
	}
	public void testperi3() {
		Triangle t3=new Triangle();
		t3.setA(3);
		t3.setB(2);
		t3.setC(1);
		float P=t3.peri();
		assertEquals((float)6,P); //pass
	}
	public void testperi4() {
		Triangle t4=new Triangle();
		t4.setA(3);
		t4.setB(2);
		t4.setC(1);
		float P=t4.peri();
		assertEquals((float)9,P); //pass
	}
}

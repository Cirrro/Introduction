package TestPackage;

import org.testng.annotations.Test;

public class PS1 extends PS{      //extends keyword established the parent and child class, meaning also child want to access what ever in parent class

	
	
	@Test
	public void testRun()
	{
		PS2 ps2 = new PS2(3);  //Parameterised constructor
		
		int a = 3;
		doThis(); // you can call any method from parent class without creating object
		
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3 = new PS3(3);
		
		System.out.println(ps2.multiplyThree());
	}
	

}

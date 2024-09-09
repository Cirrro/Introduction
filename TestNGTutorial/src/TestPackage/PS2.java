package TestPackage;

public class PS2 extends PS3 {
	
	int a;
	public PS2(int a) {
		// TODO Auto-generated constructor stub
		super(a);  //parent class constructors is invoked
		this.a = a;  //this passing the value of instance variable to the global variable
	}

	public int increment()
	{
		
		a= a+1;
		return a;
	}

	public int decrement()
	{
		
		a= a-1;
		return a;
	}

}

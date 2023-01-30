package instanceBlock;

public class InstanceBlock {
	
	{
		System.out.println("Instance Block");
	}
	
	public static void main(String[] args) {
		InstanceBlock i=new InstanceBlock();
		InstanceBlock i1=new InstanceBlock();
	}

}

/*	Instance Block: 
 
 * Instance block is similar to method which has no name.
 * When we create object at that time instance will be executed.

*/
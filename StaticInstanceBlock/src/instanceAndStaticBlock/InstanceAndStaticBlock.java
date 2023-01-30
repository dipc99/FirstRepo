package instanceAndStaticBlock;

public class InstanceAndStaticBlock {
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public static void main(String[] args) {
		
		InstanceAndStaticBlock d=new InstanceAndStaticBlock();
		//InstanceAndStaticBlock d1=new InstanceAndStaticBlock();
	}

}

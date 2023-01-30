package staticBlock;

public class StaticDemo {
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		StaticDemo sd1=new StaticDemo();		//static call only one time
	}									// without object we call static

}

/* Static Block :

static block gets executed only one time.
static block gets executed at the time of loading .class file into jvm.
*/
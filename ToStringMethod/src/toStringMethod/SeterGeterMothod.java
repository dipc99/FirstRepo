package toStringMethod;

public class SeterGeterMothod {
	int a;
	String name;
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


@Override
	public String toString() {
		return "SeterGeterMothod [a=" + a + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		SeterGeterMothod SG=new SeterGeterMothod();
		SG.setA(1);
		SG.setName("dipali");
		System.out.println(SG.getA());
		System.out.println(SG.getName());
		
		System.out.println(SG);		// Or Syso for toStringMethod

		SeterGeterMothod SG1=new SeterGeterMothod();
		SG1.setA(2);
		SG1.setName("Chaudhari");
		System.out.println(SG1.getA());
		System.out.println(SG1.getName());
		
		System.out.println(SG1);		// Or Syso for toStringMethod
	}

}
package toStringMethod;

public class Student {
	
	int Rno;
	String Name;
	float Marks;
	
	@Override
	public String toString() {
		return "Student [Rno=" + Rno + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	
	public static void main(String[] args) {
	
		Student s=new Student();
		s.Rno=1;
		s.Name="Dipali";
		s.Marks=66;
		System.out.println(s.toString());
		
		Student s1=new Student();
		s1.Rno=2;
		s1.Name="DipS";
		s1.Marks=70;
		System.out.println(s1.toString());
	}

}

import java.util.*;
class Subject{
	int studentMarks;
	int credits;
	int grade;
}

class Student{
	Subject subject[];
	String name;
	String USN;
	double SGPA;
	Scanner s;

	Student()
	{
		int i;
		subject=new Subject[3];
		for(i=0;i<3;i++)
		{
			subject[i]=new Subject();
		}
		s=new Scanner(System.in);
	}

void getStudentDetails()
{
	System.out.println("Enter the Name");
	name=s.next();
	System.out.println("Enter the USN");
	USN=s.next();
}
void getMarks()
{
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the marks of subject "+(i+1)+":");
		subject[i].studentMarks=s.nextInt();
		System.out.println("Enter the credits of subject "+(i+1)+":");
		subject[i].credits=s.nextInt();
		subject[i].grade=(subject[i].studentMarks/10)+1;
		if(subject[i].grade==11)
		{
			subject[i].grade=10;
		}
		if(subject[i].grade<=4)
		{
			subject[i].grade=0;
		}
	}
}
void computeSGPA()
{
	int Effectivecredit=0;
	int Effgrade=0;
	int i;
	for(i=0;i<3;i++)
	{
		Effectivecredit+=subject[i].credits*subject[i].grade;
		Effgrade+=subject[i].credits;
	}
	SGPA=(double)Effectivecredit/(double)Effgrade;	
}
}

class Main
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();
		System.out.println("Name:"+s1.name);
		System.out.println("USN:"+s1.USN);
		System.out.println("SGPA:"+s1.SGPA);
	}
}











	
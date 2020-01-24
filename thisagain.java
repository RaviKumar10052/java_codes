import java.util.*;
class thisagain{
	int marks1,marks2,marks3;
	thisagain(int marks1,int marks2,int marks3)
	{
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	thisagain compare(thisagain ref)
	{
		if(marks1+marks2+marks3>=ref.marks1+ref.marks2+ref.marks3) return this;
		else return ref;
	}
	void show()
	{
		System.out.println("Sum: "+marks1+marks2+marks3);
	}
	public static void main(String args[])
	{
		thisagain ref1 = new thisagain(10,20,30);
		thisagain ref = new thisagain(10,20,25);
		thisagain dref;
		dref= ref1.compare(ref);
		dref.show();

	}
}
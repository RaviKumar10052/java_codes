import java.util.*;

class usethis
{
	int a;
        usethis(int a)
	{
		this.a=a;
	}
	int get(int a)
	{
	return this.a;
	}
	public static void main(String args[])
        {
		usethis ref1= new usethis(10);
                System.out.println("value: "+ ref1.get(20));
	}
}

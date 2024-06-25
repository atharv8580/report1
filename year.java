import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		int year;
		String x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a leaf year");
		year=sc.nextInt();
		x=(year % 400==0)?"leaf year":"not leaf year";
		y=(year % 4==0)?"leaf year":"not leaf year";
		z=(year%100==0)?x:y;
		System.out.println(z);
	}
}
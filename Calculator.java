
								// arithmetic calculator //
import java.util.Scanner;
public class Calculator {
	double newnumber;
	double value1;
	double value2;
	double result;
	public static void main(String[] args) {
		Scanner bh = new Scanner(System.in);
		System.out.println("Please press 1 for Addition");
		System.out.println("Please press 2 for Subtraction");
		System.out.println("Please press 3 for Multipliction");
		System.out.println("Please press 4 for Division");
		System.out.println("Please press 5 for Modulo");
		System.out.print("Enter your choice 1 to 5 : ");
		double newnumber=bh.nextInt();
		if(newnumber==1) {
			System.out.print("Enter your first number : ");
			double value1=bh.nextInt();
			System.out.print("Enter your2 number : ");
			double value2 = bh.nextInt();
			double result = value1+value2;
			System.out.println("Your Addition answer is : " +result);	
		}
			if(newnumber==2) {
			System.out.print("Enter your first number : ");
			double value1=bh.nextInt();
			System.out.print("Enter your2 number : ");
			double value2 = bh.nextInt();
			double result = value1-value2;
			System.out.println("Your Subtraction answer is : " +result);
		}
		if(newnumber==3) {
			System.out.print("Enter your first number : ");
			double value1=bh.nextInt();
			System.out.print("Enter your2 number : ");
			double value2 = bh.nextInt();
			double result = value1*value2;
			System.out.println("Your Multipliction answer is : " +result);
		}
		if(newnumber==4) {
			System.out.print("Enter your first number : ");
			double value1=bh.nextInt();
			System.out.print("Enter your2 number : ");
			double value2 = bh.nextInt();
			double result = value1/value2;
			System.out.println("Your Division answer is : " +result);
		}
		if(newnumber==5) {
			System.out.print("Enter your first number : ");
			double value1=bh.nextInt();
			System.out.print("Enter your2 number : ");
			double value2 = bh.nextInt();
			double result = value1%value2;
			System.out.print("Your modulo answer is : " +result);		
		}
		}
	}




package conditionalstatement;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=scan.nextInt();
		int temp=a;
		int remainder=0;
		int sum=0;
		
		while(temp!=0)
		{
			remainder=temp%10;
			sum+=remainder;
			temp=temp/10;
		}
		
		System.out.println("The Sum of the digits of the number "+ a +" is "+ sum);

	}

}

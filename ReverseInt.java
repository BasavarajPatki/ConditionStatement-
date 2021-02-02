package conditionalstatement;

import java.util.Scanner;

public class ReverseInt {

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
			sum=sum*10 + remainder;
			temp=temp/10;
		}
		
		System.out.println("The Reverse of  "+ a +" is "+ sum);

	}

}

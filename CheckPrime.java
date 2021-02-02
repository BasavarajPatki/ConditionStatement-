package conditionalstatement;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int flag=0;
		
		System.out.println("Enter a number : ");
		int a=scan.nextInt();
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not a Prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
		
		
		

	}

}

package conditionalstatement;

import java.util.Scanner;

public class SeriesOFPrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of series ");
		int a=scan.nextInt();
		System.out.println("The first "+ a +" Prime numbers are :  ");
		int flag=0;
		int i=1;
		while(a!=0)
		{ 
			i++;
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
				a--;
			}
		}
	}

}

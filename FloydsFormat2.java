package conditionalstatement;

import java.util.Scanner;

public class FloydsFormat2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the Pattern : ");
		int a=scan.nextInt();
		int count=0;
		int temp=0;
		while(a!=0)
		{ 
			count++;
			temp=count;
			
			while(temp!=0)
			{
				System.out.print("* ");
				temp--;
				
			}
			System.out.println();
			a--;
		}

	}

}

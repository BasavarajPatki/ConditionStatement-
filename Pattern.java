package conditionalstatement;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of series ");
		int a=scan.nextInt();
		int count;
		for(int i=a;i>0;i--)
		{ count = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}

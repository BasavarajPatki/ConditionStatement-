package conditionalstatement;

import java.util.Scanner;

public class Divisble {

	public static void main(String[] args) {
		int count=0;
		int temp=0;
		int flag=1;
		System.out.println("First five numbers which are divisble by 2,3 and 5 are : ");
		while(flag==1)
		{
			count++;
			if(count%2==0 && count%3==0 && count%5==0)
			{
				System.out.println(count);
				temp++;
			}
			if(temp==5)
			{
				flag=0;
			}
		}

	}

}

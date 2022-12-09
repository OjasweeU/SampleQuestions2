package samp2;
import java.util.*;
public class Q1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kilograms: ");
		int cCh=0;
		int x=sc.nextInt();
		if(x>0&&x<3)
		{
			System.out.println("The charge is $8.00");
		}
		else if(x>=3&&x<=5)
		{
			System.out.println("The charge is $12.00");
		}
		else if(x>5&&x<=25)
		{
			System.out.println("The charge is $" +(12.00+((x-5)*1.5)));
		}
		else 
		{
			System.out.println("Invalid weight and can't calculate the charge");
		}
	}

}

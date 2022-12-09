package samp2;
import java.util.*;
public class Q2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of property you want to buy NIGGA:");
        int ty=sc.nextInt();
        switch(ty)
        {
        case 0:
        	System.out.println("You have bought a Residential Property");
        	break;
        case 1:
        	System.out.println("You have bought a Non-Residential Property");
        	break;
        }
        System.out.println("Enter the pp of the property: ");
        int pp=sc.nextInt();
        if(pp<180000)
		{
        	if(ty==0)
        	{
        		System.out.println("The charge is:" + (pp)*((1)/100));
        	}
        	else 
        	{
        		System.out.println("The charge is:" + (pp)*((1.5)/100));
        	}
			
		}
		else if(pp>=180000&&pp<=600000)
		{
			if(ty==0)
        	{
        		System.out.println("The charge is:" + (pp)*((2)/100));
        	}
        	else 
        	{
        		System.out.println("The charge is:" + (pp)*((2.5)/100));
        	}
		}
		else if(pp>=600000)
		{
			if(ty==0)
        	{
        		System.out.println("The charge is:" + (pp)*((3)/100));
        	}
        	else 
        	{
        		System.out.println("The charge is:" + (pp)*((3.5)/100));
        	}
		}
		else 
		{
			System.out.println("Sorry the price isn't registered in the system");
		}
        
	}

}



//Chapter-1&2
//what is full stack development and what is front end and development
//Six advantages of bootstrap
//ER Diagram
//Advantages of ECommerce
//Required Entities
//Flow Diagram
//Get vs Post

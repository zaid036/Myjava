package com.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class NetBanking {
	Scanner sc=new Scanner(System.in);
	Account acc =new Account();
	
    float amount;
	
	public void Process(List l)
	{
		List<Account> list=new ArrayList<>(l);
		ListIterator<Account> it=list.listIterator();
		System.out.println("1 Add Money");
		System.out.println("2 Check Balance");
		System.out.println("3 Withdraw Money");
		System.out.println("0 Back");
		System.out.println("Enter Number: ");
		//int num1;
		int num =sc.nextInt();
		switch (num) {
		    case 1:
			      System.out.println("Enter Amount you want to Add");
			      this.amount=sc.nextFloat(); 
			      while(it.hasNext())
			      {
			    	  acc=it.next();
			          acc.setBalance(amount);
			      System.out.println("Added Successful");
			      System.out.println("------------------");
			      
			      }
			      Process(list);
			break;
            case 2:
            	while(it.hasNext())
			      {
			    	  acc=it.next();
			                	
			      System.out.println("Available Balance is" +acc.getBalance());
			      System.out.println("----------------------------------");
			      }
			    	  Process(list);
			      
			break;
            case 3:
  			      System.out.println("Enter Amount you want to Withdraw");
  			      this.amount=sc.nextFloat();
  			    while(it.hasNext())
			      {
			    	  acc=it.next();
			       
  			      if(acc.getBalance()>=amount)
  			      {
  			      acc.withdrawMoney(amount);
  			      System.out.println("withdrawal Successful");
                  System.out.println("----------------------------------");  			   
			         Process(list);
  			      }
  			      else
  			      {
  			    	  System.out.println("inefficient Balance");
  			    	System.out.println("----------------------------------");
  			    	Process(list);
  			      }
			      }
  			break;
            case 0:
            	System.out.println("----------------------------------");
                     	
            break;

		default:
			System.out.println(num +" not Valid Number");
			Process(list);
			break;
		}
	
		
	}
	
}

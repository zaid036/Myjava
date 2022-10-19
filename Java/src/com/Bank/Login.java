package com.Bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Login extends Account {
      Scanner sc=new Scanner(System.in);
      MyBank mb=new MyBank();
      Account acc=new Account();	
      
	public void login(List list2)
	{
		List<Account> list= new ArrayList<>(list2);
		System.out.println(list.isEmpty());
		System.out.println("Enter IPIN");
		   int ipin=sc.nextInt();
		   Iterator<Account> it=list.iterator();
		   while(it.hasNext())
		   {
			   acc=it.next();
		   if(acc.getIpin()==ipin)
		   {
			   System.out.println("Login Successful");
			   NetBanking nb=new NetBanking();
			   nb.Process(list);
		   }
		   else
		   {
			   System.out.println("Wrong IPIN");
		   }
		   }
		
		 	
		}
	}


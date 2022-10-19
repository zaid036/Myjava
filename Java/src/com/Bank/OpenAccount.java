package com.Bank;

import java.util.*;


public class OpenAccount extends Account{
	       MyBank mb=new MyBank();
	       Random r=new Random();
	       Account acc=new Account();
           Scanner sc=new Scanner(System.in);
           Scanner sc1=new Scanner(System.in);
           Login l=new Login();
           String name,email,gender,phone;
           int age,ipin,accountno;
           float balance;
           List<Account> list=new ArrayList<>();
           
           public int setAccountno()   {
               
           	int accno=r.nextInt(54321);
           	
           	return accno;}
        public void openAccount()
        {
        	System.out.println("Opeing Account");
        	System.out.print("Enter your Name:");
        	name=sc1.nextLine();
        	System.out.print("Enter your Age :");
        	age=sc.nextInt();
        	System.out.print("Enter your Phone Number :");
        	phone=sc1.nextLine();
        	System.out.print("Enter your Email :");
        	email=sc1.nextLine();
        	System.out.print("Enter your Gender :");
        	gender=sc1.nextLine();
        	System.out.print("Set your Internet PIN :");
        	ipin=sc.nextInt();
        	accountno=setAccountno();
        	
        	System.out.println("Do you want to add Money Enter Yes / No ");
        	String value=sc1.nextLine().trim().toLowerCase();
        	if(value.equals("yes"))
        	{
        		System.out.println("Enter Amount you want to Add");
			      this.balance=sc.nextFloat(); 
			      list.add(new Account(name, email, gender, phone, age, accountno, ipin, balance));  
			      System.out.println(list.isEmpty());
                  System.out.println("Account Open Successful");
                  System.out.println("------------------");
                  acc.setList(list);
                  mb.myBank();
			      //new Login().login(list);
			     //l.login(list);
			      
        	}
        	else
        	{
        		list.add(new Account(name, email, gender, phone, age, accountno, ipin, balance));
        		System.out.println("Account Open Successful");
			    System.out.println("------------------");
			    acc.setList(list);
			    //l.login(list);
			    mb.myBank();
        	}
        }
    
}

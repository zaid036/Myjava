package com.Bank;

import java.util.*;
public class MyBank
{
	Scanner sc=new Scanner(System.in);
	Account acc=new Account(); 
	List l=acc.getList();
public void myBank()
{  
	
	 
	List<Account> list=new ArrayList<>();
	list.addAll(l);
	OpenAccount oa=new OpenAccount();
    System.out.println("Welcome to MyBank");
	System.out.println("1 Login");
	System.out.println("2 Open Account");
	System.out.println("3 Exit");  
	System.out.print("Enter Number");
    System.out.println(list.isEmpty());
   
    
    
    int value=sc.nextInt();
    
    switch (value) {
	case 1:
		   System.out.println(list.isEmpty());
		   Login l=new Login();
		   l.login(list);
		break;
    case 2:
    	oa.openAccount();
		break;
    case 0:
    	myBank();
	   break;
	default:
		System.out.println(value +" not Valid Number");
		myBank();
		break;
	}
	
}

	public static void main(String[] args) {
		
		MyBank mb=new MyBank();
		mb.myBank();
	    
         		
		
	}

}

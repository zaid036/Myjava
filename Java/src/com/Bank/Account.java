package com.Bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    
	private String name, email,gender,phone;
	private int age, accountno, ipin;
	private float balance;
    
	private List<Account> list=new ArrayList<>();
	
	
	
	
      public Account()
      {}
	
	
		public Account(String name, String email, String gender, String phone, int age, int accountno, int ipin,
			float balance) {
		
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
		this.accountno = accountno;
		this.ipin = ipin;
		this.balance = balance;
		
	}
       
	



		public String getName() {
		return name;
	}
  	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public int getIpin() {
		return ipin;
	}
	public void setIpin(int ipin) {
		this.ipin = ipin;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
		public void withdrawMoney(float amount)
	{
		this.balance=balance-amount;
	}
	 
	
		
	
		public List<Account> getList() {
			return list;
		}


		public void setList(List<Account> list) {
			this.list = list;
		}


		@Override
		public String toString() {
			return "Account [name=" + name + ", email=" + email + ", gender=" + gender + ", phone=" + phone + ", age=" + age
					+ ", accountno=" + accountno + ", ipin=" + ipin + ", balance=" + balance +  "]";
		}
}

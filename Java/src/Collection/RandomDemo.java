package Collection;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
	
	public static void main(String[] args) {
		
		Random s=new Random();
		int a=s.nextInt(9999);
		System.out.println("OTP " +a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP Here ");
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Valid OTP");
		}
		else {
			System.out.println(" Not Valid");
		}
		
	}

}

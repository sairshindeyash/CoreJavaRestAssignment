package com.yash.assignment;

public class SpyNumber {

	public Boolean checkSpyNumber(int number) {
		int multiplication=1,sum=0;
		while(number>0) {
			int digit=number%10;
			number=number/10;
			multiplication=multiplication*digit;
			sum=sum+digit;
		}
		/*
		 * System.out.println("multiplication=="+multiplication);
		 * System.out.println("sum=="+sum);
		 */
		if(multiplication==sum)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		SpyNumber number=new SpyNumber();
		System.out.println(number.checkSpyNumber(123));
	}

}

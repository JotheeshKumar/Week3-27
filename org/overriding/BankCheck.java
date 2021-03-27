package org.overriding;

public class BankCheck extends BankInfo {

	public void depositAmount() 
	{

		System.out.println("current amount in the deposit : 3000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCheck bank = new BankCheck();
		BankInfo bankinfo = new BankInfo();
		bankinfo.depositAmount();
		bank.fixedAmount();
		bank.savingLimit();
		bank.depositAmount();
		

	}

}


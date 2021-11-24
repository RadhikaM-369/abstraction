package com.xworkz.Bank;

abstract public class Bank {
public void createAccount(String custname,Long AdharNo, Long contactNo,int amount) {
	System.out.println("Account created..! ");
}
public void closeAccount(String custname,Long AdharNo, Long contactNo) {
	System.out.println("Account closed..! ");
}
public void depositAmount(Long accountNo, String CustName, int amount) {
	System.out.println("Amount credited to account ");
}
public void Withdraw(Long accountNo, String CustName, int amount) {
	System.out.println(" Amount debited from account");
}
abstract public void checkDetails();

}

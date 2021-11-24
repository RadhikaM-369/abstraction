package com.xworkz.InterviewPortal;

abstract public class InterviewApp {
	int serialNumber;
	String companyName;
	
public void login(String userName, String password) {
System.out.println("Login successful..!");
}


public void logout() {
System.out.println("Logout successful..!");
}

public void viewResult(int rollNumber) {
System.out.println("Score 80");
}

public void interviewSchedule(int rollNumber) {
System.out.println("View schedule");
}

abstract public void prepareQuestionSet();
abstract public void takeTest();
}

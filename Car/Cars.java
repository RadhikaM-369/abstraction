package com.xworkz.Car;

abstract public class Cars {
	
public void engineStart() {
	System.out.println("Engine starts");
}
public void engineStop() {
	System.out.println("Engine stopped");
}
abstract public void engineMech();
abstract public void rearSuspension();
abstract public void frontSuspension();
}

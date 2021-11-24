package com.xworkz.SmartPhone;

abstract public class SmartPhone {

	public void unlock(String password) {
		System.out.println("Phone unlocked");
	}
	public void playSong() {
		System.out.println("Playing a song");
	}
	public void videoShoot() {
		System.out.println("Shooting video");
	}
	abstract public void uploadVideo(); 
}

package com.automobile.fourwheeler;
import com.automobile.*;
public class Logan extends Vehicle{
	String modelName;
	String RegistrationNumber;
	String OwnerName;
	int speed;
	int gps;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int gps(int gps) {
		this.gps=gps;
		return gps;
	}
	public void display() {
		System.out.println("Owner Name:-"+getOwnerName());
		System.out.println("Registation Number:-"+getRegistrationNumber());
		System.out.println("Model Name:-"+getModelName());
		System.out.println("Speed:-"+getSpeed());
		System.out.println("GPS:-"+gps(10));
	}

}

package com.apple.model;

import com.phone.Phone;

public class Apple implements Phone {

	private final String name = "Apple";

	public void watchMovie(){
		System.out.println("Movie time yo!!!");
	}

	public void call(){
		System.out.println("Calling from "+this.name);
	}
	
	public void sendMessage(){
		System.out.println("Sending message from "+this.name);
	}
	
	public void receiveMessage(String message){
		System.out.println("Received message "+message+" in the "+this.name+" phone");
	}
	
	public String getContact(String name){
		System.out.println("Get the contact for "+name+" from the phone : "+this.name);
		return "ContactInformation";
	}
	
	public void storeContactInformation(String name, String phoneNumber){
		System.out.println("Storing contact information in the "+this.name+" phone");
	}

}
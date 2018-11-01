package com.phone;

public interface Phone {

	public void call();
	
	public void sendMessage();
	
	public void receiveMessage(String message);
	
	public String getContact(String name);
	
	public void storeContactInformation(String name, String phoneNumber);
}
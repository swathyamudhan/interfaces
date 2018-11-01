package com.myphone;
import com.phone.Phone;
import com.nokia.model.Nokia;
import com.apple.model.Apple;

public class MyPhoneApp {

	public static void main(String...args){
		Phone phone1 = new Nokia();
		phone1.call();

		Phone phone2 = new Apple();
		phone2.call();
		((Apple)phone2).watchMovie();

		Apple phone3 = new Apple();
		phone3.call();
		phone3.watchMovie();
	}

}
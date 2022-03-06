package LockedMe;


import LockedMe.FileHandling.HandleOptions;
import LockedMe.FileHandling.MenuOptions;



public class LockedMain {
	public static void main(String[] args) {
		MenuOptions.WelcomeScreen();
		HandleOptions.WelcomeScreen();
		FileHandling.viewFiles("FileHandling/Locked");
	}

}
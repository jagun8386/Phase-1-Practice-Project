package nonassistedproject;

import java.util.ArrayList;

import java.util.Scanner;

public class Validationofmail {
		public static void main(String[]args) {//main program
			ArrayList<String>emailID=new ArrayList<String>();
			emailID.add("manoj@abc.com");
			emailID.add("tarun@abc.com");
			emailID.add("hemanth@abc.com"); 
			emailID.add("gowri@abc.com");
			emailID.add("uday@abc.com");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter EmailID");
			String Validationofmail =sc.nextLine();
			if(emailID.contains(Validationofmail)) {
				System.out.println("email ID" + Validationofmail+"is found");
			}
			else {
				System.out.println("email ID" + Validationofmail+"is not found");
			}
			
		}
		 
}

package PracticeProj;

import java.util.ArrayList;
import java.util.Scanner;
public class screachEID
{
   public static void main(String[] args)
   {
      ArrayList <String> email = new ArrayList<String>();
     
      email.add("raju@gmail.com");
      email.add("kartheek@gmail.com");
      email.add("varma@gmail.com");
      email.add("hruthik@gmail.com");
      email.add("sagar@gmail.com");
      email.add("sai@gmail.com");
      email.add("chintu@gmail.com");
      email.add("kishor@gmail.com");
      email.add("sunny@gmail.com");
      email.add("chinnu@gmail.com");
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter mail id ");
      String a= sc.nextLine();
      if (email.contains(a)) 
      {
    	    System.out.println(a+ " mail id correct");
      }
      else 
      {
    	    System.out.println(a+" mail id is not correct");
      }
   }
}
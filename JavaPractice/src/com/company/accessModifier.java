package com.company;

public class accessModifier {

      public int id = 5;
      private String name = "khushbu";

      public void login(int phoneNumber, String password, int otp){
            System.out.println("Login with phone number and password");
      }

      public static void main(String args[]){
            accessModifier ac = new accessModifier();
            System.out.println(ac.id);
            System.out.println(ac.name);
      }
}


package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String emailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
    final String phoneNumberPattern = "[0-9]{2}[\\s][0-9]{10}$";
    final String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
    /**
     * This method is used validating Userinput firstname.
     *
     */

    public void checkPatternFirstName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the First Name: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(namePattern, checkPattern))
                System.out.println("Pattern Valid");
            else
                throw new UserDefineException(" Enter a valid Firstname");
            System.out.println("First name:- " + checkPattern);
        }

        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternFirstName();
        }
    }
    /**
     * This method is used validating Userinput lastname.
     *
     */

    public void checkPatternLastName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Last Name: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(namePattern, checkPattern))
                System.out.println("Pattern Valid.");
            else
                throw new UserDefineException("Please enter a valid LastName");
            System.out.println("Last name:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternLastName();
        }
    }

    /**
     * This method is used validating Userinput email.
     *
     */

    public void checkPatternEmailId() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Email address: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(emailIdPattern, checkPattern))
                System.out.println("Pattern Valid.");
            else
                throw new UserDefineException("Please enter a valid Email");
            System.out.println("Email:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternEmailId();
        }
    }

    /**
     * This method is used validating Userinput phoneNo.
     *
     */

    public void checkPatternPhoneNumber() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the PhoneNo: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(phoneNumberPattern, checkPattern))
                System.out.println("Pattern Valid.");
            else
                throw new UserDefineException("Please  enter a valid PhoneNumber");
            System.out.println("Phone Number:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPhoneNumber();
        }
    }

    /**
     * This method is used validating Userinput password.
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     */


    public void checkPatternPassword() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Password: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(passwordPattern, checkPattern))
                System.out.println("Pattern Valid.");
            else
                throw new UserDefineException("Please  enter a valid Password");
            System.out.println("Password:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPassword();
        }
    }
}

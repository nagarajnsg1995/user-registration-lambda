package com.bridgelabz;

import java.util.regex.Pattern;

interface IValidation {
    String validate(String regex, String userDetails);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to lambda user registration program");

        IValidation isValidFirstName = (pattern, firstName) -> {
            return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Nagaraj"));

        IValidation isValidLastName = (pattern, lastName) -> {
            return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Gaddad"));

        IValidation isValidMobileNumber = (pattern, mobileNumber) -> {
            return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
        };
        System.out.println(isValidMobileNumber.validate(".91?[6-9][0-9]{9}", "+918660768341"));


    }
}
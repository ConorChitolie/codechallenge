package com.codingchallenge.demo.model;

public class PasswordGenerator {
    public String generatePassword(int length, boolean numericalCharacters, boolean specialCharacters, boolean upperCaseCharacters, boolean lowerCaseCharacters) {
        // Setup character set based on input booleans
        StringBuilder characters = new StringBuilder();

        if (numericalCharacters == true) {
            characters.append("0123456789");
        }
        if (specialCharacters == true) {
            characters.append("!@#$%^&*()-_=+[]{}|;:'\",.<>/?");
        }
        if (upperCaseCharacters == true) {
            characters.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (specialCharacters == true) {
            characters.append("abcdefghijklmnopqrstuvwxyz");
        }

        if (characters.length() == 0 || (!numericalCharacters & !specialCharacters & !upperCaseCharacters & !lowerCaseCharacters)) {
            // If no character set is selected, use the default set
            characters.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
        }
        
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
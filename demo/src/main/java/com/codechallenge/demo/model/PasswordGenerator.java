package com.codechallenge.demo.model;

public class PasswordGenerator {
    public String generatePassword(int length) {
        // Implement your password generation logic here
        // This can be a simple algorithm or using a library like Apache Commons Lang
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}

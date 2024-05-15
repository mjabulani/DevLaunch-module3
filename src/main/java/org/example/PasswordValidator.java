package org.example;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private final int minLength = 12;
    Pattern digit = Pattern.compile("[0-9]");
    Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

    public PasswordValidator() {
    }

    public boolean goodPassword(String password) {
        return (hasGoodLength(password)
                && hasNoWhiteSpaces(password)
                && hasNoRepetitions(password)
                && hasNumbers(password)
                && hasSpecialCharacter(password));
    }

    public boolean hasGoodLength(String password) {
        return password.length() >= minLength;
    }

    public boolean hasNoWhiteSpaces(String password) {
        return !password.contains(" ");
    }

    public boolean hasNoRepetitions(String password) {
        HashSet<Character> setOfChars = new HashSet<Character>();
        for (int i = 0; i < password.length(); i++) {
            setOfChars.add(password.charAt(i));
        }
        return setOfChars.size() == password.length();
    }

    public boolean hasNumbers(String password) {
        Matcher hasDigit = digit.matcher(password);
        return hasDigit.find();
    }

    public boolean hasSpecialCharacter(String password) {
        Matcher hasSpecial = special.matcher(password);
        return hasSpecial.find();
    }


}


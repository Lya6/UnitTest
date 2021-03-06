package com.example.unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilits {

    //Матчеры представляют собой логические операции совпадения.

    public static boolean checkEmailForValidity(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                    Pattern.CASE_INSENSITIVE);

}

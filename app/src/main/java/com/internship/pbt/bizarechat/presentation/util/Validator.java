package com.internship.pbt.bizarechat.presentation.util;


import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private final String PASSWORD_REGEX = "((?=.*\\d).{2,})((?=.*[a-z]))((?=.*[A-Z]).{2,})";

    public boolean isValidEmail(String email){
        return Patterns.EMAIL_ADDRESS.matcher(email.trim()).matches();
    }

    public boolean isValidPhoneNumber(String phoneNumber){
        return Patterns.PHONE.matcher(phoneNumber.trim()).matches();
    }

    public boolean isValidPassword(String password){
        Pattern patterns = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = patterns.matcher(password);
        return matcher.matches();
    }
}
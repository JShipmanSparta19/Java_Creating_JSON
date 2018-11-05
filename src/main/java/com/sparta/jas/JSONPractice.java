package com.sparta.jas;

import org.json.simple.JSONObject;

public class JSONPractice {
    public static void main(String[] args){
        UserDetails dave = new UserDetails("Dave", 20, "dave@email.com");

        dave.getUserDetails();
    }
}

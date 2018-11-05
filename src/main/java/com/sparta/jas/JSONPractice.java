package com.sparta.jas;

import org.json.simple.JSONArray;

public class JSONPractice {
    public static void main(String[] args){
        JSONArray hobbies = new JSONArray();
        hobbies.add("Rugby");
        hobbies.add("Karate");

        UserDetails dave = new UserDetails("Dave", 20, "dave@email.com", hobbies);

        dave.printUserDetails();
    }
}

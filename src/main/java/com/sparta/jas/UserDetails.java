package com.sparta.jas;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UserDetails {
    private JSONObject userDetails = new JSONObject();
    private String name;
    private int age;
    private String email;
    private JSONArray hobbies;

    public UserDetails(String userName, int userAge, String userEmail, JSONArray userHobbies) {
        userDetails.put("name", name = userName);
        userDetails.put("age", age = userAge);
        userDetails.put("email", email = userEmail);
        userDetails.put("hobbies", hobbies = userHobbies);
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public JSONArray getHobbies() {
        return hobbies;
    }


    public void printUserDetails() {
        System.out.println(userDetails);
    }


    //    public void setUserName(String name) {
//        userDetails.put("name", name);
//    }
//    public void setUserAge(int age) {
//        userDetails.put("age", age);
//    }
//    public void setUserEmail(String email) {
//        userDetails.put("email", email);
//    }
}

package com.sparta.jas;

import org.json.simple.JSONObject;

public class UserDetails {
    private JSONObject userDetails = new JSONObject();

    public UserDetails(String name, int age, String email) {
        userDetails.put("name", name);
        userDetails.put("age", age);
        userDetails.put("email", email);
    }

    public void getUserDetails() {
        System.out.println(userDetails);
    }

    public void setUserName(String name) {
        userDetails.put("name", name);
    }
    public void setUserAge(int age) {
        userDetails.put("age", age);
    }
    public void setUserEmail(String email) {
        userDetails.put("email", email);
    }
}

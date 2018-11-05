package com.sparta.jas;

import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JSONTest {
    private static UserDetails kevinDetails;
    private static JSONArray kevinHobbies;

    @BeforeClass
    public static void classSetup(){
        kevinHobbies = new JSONArray();
        kevinHobbies.add("Movies");
        kevinHobbies.add("Advertising");
        kevinHobbies.add("Swimming");
        kevinDetails = new UserDetails("Kevin", 27, "kevin@bacon.com", kevinHobbies);
    }

    @Test
    public void nameTest(){
        Assert.assertEquals("Kevin", kevinDetails.getName());
    }

    @Test
    public void ageTest(){
        Assert.assertEquals(27, kevinDetails.getAge());
    }

    @Test
    public void emailTest(){
        Assert.assertEquals("kevin@bacon.com", kevinDetails.getEmail());
    }

    @Test
    public void hobbiesTest(){
        Assert.assertEquals(kevinHobbies, kevinDetails.getHobbies());
    }
}

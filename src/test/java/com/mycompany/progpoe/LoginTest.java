/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author refil
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testUserNameComplexity(){
        Login login = new Login();
        String expected = "kyl_1";
        String actual = login.userNameComplexity();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPasswordComplexity(){
        Login login = new Login();
        String expected = "Ch&&sec@ke99!";
        String actual = login.passWordComplexity();
        assertEquals(expected, actual);
    }
    @Test
    public void testUserNameComplexityTrue() {
        Login login = new Login();
        boolean expected = true;
        boolean actual = login.userNameComplexity("kyl_1");
        assertTrue(actual);
    }
    
    public void testUserNameComplexityFalse(){
        Login login = new Login();
        boolean expected = false;
        boolean actual = login.userNameComplexity("kyle!!!!!!!");
        assertFalse(actual);
    }

    @Test
    public void testPasswordComplexityTrue() {
        Login login = new Login();
        boolean expected = true;
        boolean actual = login.passwordComplexity("Ch&&sec@ke99!");
        assertTrue(actual);
    }
    
    @Test 
    public void testPasswordComplexityFail(){
        Login login = new Login();
        boolean expected = false;
        boolean actual = login.passwordComplexity("password");
        assertFalse(actual);
    }

    
    
}

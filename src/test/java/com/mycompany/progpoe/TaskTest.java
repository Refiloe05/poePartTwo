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
public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testCheckTaskDescriptionSuccess() {
        Tasks tasks = new Tasks();
        String expected = "Task successfully entered";
        boolean actual = tasks.checkTaskDescription();
        assertEquals(expected,actual);
    }
    @Test
    public void testCheckTaskDescriptionFail(){
        Tasks tasks = new Tasks();
        String expected = "Please enter a task description of less than 50 characters";
        boolean actual = tasks.checkTaskDescription();
        assertEquals(expected,actual);
    }
    
    @Test
    public void testCreateTaskID() {
        Tasks tasks = new Tasks();
        String expected = "AD:1:BYN";
        String actual = tasks.createTaskID();
        assertEquals(expected, actual);
    }

    @Test
    public void testReturnTotalHoursLoop() {
        Tasks tasks = new Tasks();
        String expected = "18";
        String actual = tasks.returnTotalHours();
        assertEquals(expected, actual);
        
        
    }
    
}

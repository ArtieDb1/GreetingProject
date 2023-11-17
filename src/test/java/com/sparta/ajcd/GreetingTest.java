package com.sparta.ajcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GreetingTest {

    @Test
    @DisplayName("Check that 6 returns \"Good Morning\"") // gives the test name meaning!

    //GoodMorning
    public void firstTest(){
        /**
         * @ is an annotation
         * this contains metadata
         * metadata is information about information
         * it says to the JVM, "The following method should be run as a test"
         * @override means that this method is going to be overridden
         *
         * assert equals takes in 2 values the expected first and actual second
         * assertions is a class assert is a method
         * Testing reveals faults not in the requirements
         */

        Assertions.assertEquals("Good morning!", Greeting.getGreeting(6));
    }

    @Test
    @DisplayName("Check that 13 returns \"Good afternoon\"") // gives the test name meaning!

    //Good Afternoon
    public void secondTest(){
        Assertions.assertEquals("Good afternoon!", Greeting.getGreeting(13));
    }

    @Test
    @DisplayName("Check that 19 returns \"Good evening\"") // gives the test name meaning!

    //Good Evening
    public void thirdTest(){
        Assertions.assertEquals("Good evening!", Greeting.getGreeting(19));
    }

    @Test
    @DisplayName("Check that anything greater than 24 returns \"Invalid Time\"") // gives the test name meaning!

    //Invalid Time
    public void fourthTest(){
        Assertions.assertEquals("Invalid Time", Greeting.getGreeting(25));
    }

    @Test
    @DisplayName("Check that anything greater than 24 returns \"Invalid Time\"") // gives the test name meaning!
    //Invalid Time
    public void fithTest(){
        Assertions.assertEquals("Invalid Time", Greeting.getGreeting(12));
    }

    /**
     * Java will run tests
     * It is a Junit annotation that tells the JVM :
     * " this is a test
     * there are other types of tests,
     * when you run the following method, run the following method using JUnit libraries"
     *
     * The parameterised tests MUST have a source of values to take in as parameters
     * that's why you must put a value source right after!
     * */
    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Check Against 5, 8 and 12")
    public void sixthTest(int timeOfDay){
        Assertions.assertEquals("Good morning!", Greeting.getGreeting(timeOfDay));
    }





}

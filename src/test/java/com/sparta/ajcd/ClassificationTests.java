package com.sparta.ajcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ClassificationTests {


    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9,10,11})
    @DisplayName("Check that ranges 0-11 returns \"U, PG & 12 films are available\"")
    //checks
    public void firstTest(int age){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("Check that ranges 12-15 returns \"U, PG & 12 & 15 films are available\"")
    public void secondTest(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Check that ranges 15+ returns \"All films are available\"")
    public void thirdTest(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,35,50})
    @DisplayName("Check that ranges 15+ returns \"All films are available\"")
    public void fourthTest(int age){
        Assertions.assertEquals("All films are available.",FilmClassifications.availableClassifications(age));
    }


}

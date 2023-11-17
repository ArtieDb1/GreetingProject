package com.sparta.ajcd;

/** multiline comments help other developers
 * scope
 * public - any file in the program is going to be able to see the code within the parenthesis
 * private - only accessed within this file
 * protected - it can be accessed by this class and any subclasses
 * or don't put anything - means everyone within the same folder can see the file
 * it means the same as package private (default)
 * public is anything can see and import it
 *
*/

public class Greeting {

    //this is the entry point - "where the program starts"
    //only one in the whole program
    public static void main( String[] args )
    {
         /**
     * method that is public
     * the method is called main
     * Java is known as a strongly typed language it is a statically typed language
     * Strongly typed means that if you want to declare a variable, there must be a type
     * statically typed - the program checks the code is safe to run
     * if it is unsafe to run, the JVM will not run the code
     * There are 8 types of primitive values int char etc.
     *
     * auto boxing is when java sees that the int is pout of range then it automatically promotes the
     * int value to the object type of the primitive which is why you can store big numbers as an int
     * **/

         int timeOfDay = 21; //int type variable and
        System.out.println(getGreeting(21));

    }

    public static String getGreeting(int timeOfDay) {
        //the little sections of a big problem don't being solved are private
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting ="Good afternoon!";
        }
        else {
            greeting = "Good evening!";
        }

        return greeting;
    }
}

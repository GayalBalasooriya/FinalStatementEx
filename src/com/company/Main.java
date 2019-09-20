package com.company;

public class Main {

    public static void main(String[] args) {
        /*int pw = 89;
        //Password password = new Password(pw);
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(56);
        password.letMeIn(90);
        password.letMeIn(89);

         */
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}

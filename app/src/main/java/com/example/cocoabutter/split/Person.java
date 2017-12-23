package com.example.cocoabutter.split;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Ananthan on 2017-12-06.
 */

public class Person {
    String firstName;
    String lastName;
    BigDecimal amount;
    boolean oweMe;

    public Person(String firstName, String lastName, BigDecimal amount, boolean oweMe){
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
        this.oweMe = oweMe;
    }

    public Person(String firstName, String lastName, BigDecimal amount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName){
        this.firstName = firstName;
    }
}

package com.pluralsight.Helpers;

import com.pluralsight.model.Person;

public class FormatHelpers {

    public static void formatHelperConnection(Person p){
        System.out.printf("%-15s %-15s %-15s %n",
               p.getFirstName(),
                p.getLastName(),
                p.getAge());
    }
}

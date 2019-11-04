/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class MonthDemo {
    public static void main(String[] args) {
        //create a month using the default constructor
        System.out.println("Creating a month using the default constructor");
        Month defaultMonth = new Month();
        System.out.println("Month Number = " + defaultMonth.getMonthNumber());
        System.out.println("Month Name = " + defaultMonth.getMonthName());
        System.out.println("Month details:");
        System.out.println(defaultMonth.toString());

        System.out.println();
        //create month using the second constructor which accepts month number
        System.out.println("Creating month using the second constructor which accepts month number(7)");
        Month monthWithMonthNumber = new Month(7);
        System.out.println("Month Number = " + monthWithMonthNumber.getMonthNumber());
        System.out.println("Month Name = " + monthWithMonthNumber.getMonthName());
        System.out.println("Month details:");
        System.out.println(monthWithMonthNumber.toString());

        System.out.println();
        //create month using the second constructor which accepts month name
        System.out.println("Creating month using the third constructor which accepts name of the month(April)");
        Month monthWithMonthName = new Month("April");
        System.out.println("Month Number = " + monthWithMonthName.getMonthNumber());
        System.out.println("Month Name = " + monthWithMonthName.getMonthName());
        System.out.println("Month details:");
        System.out.println(monthWithMonthName.toString());


        System.out.println();
        System.out.println("Create month with invalid name");
        System.out.println("Creating month with invalid month name(Octobr) using third constructor");
        Month monthWithInvalidName = new Month("Octobr");
        System.out.println("Month Number = " + monthWithInvalidName.getMonthNumber());
        System.out.println("Month Name = " + monthWithInvalidName.getMonthName());
        System.out.println("Month details:");
        System.out.println(monthWithInvalidName.toString());


        System.out.println();
        System.out.println("Create month with invalid number");
        System.out.println("Creating month with invalid month number(13) using second constructor");
        Month monthWithInvalidNumber = new Month(13);
        System.out.println("Month Number = " + monthWithInvalidNumber.getMonthNumber());
        System.out.println("Month Name = " + monthWithInvalidNumber.getMonthName());
        System.out.println("Month details:");
        System.out.println(monthWithInvalidNumber.toString());


        System.out.println();
        System.out.println("Checking if " + defaultMonth.toString() + " is equal to " + monthWithMonthNumber.toString());
        System.out.println("They should not be equal");
        boolean monthEqual = defaultMonth.equals(monthWithMonthNumber);
        if (monthEqual) {
            System.out.println(defaultMonth.toString() + " is equal to " + monthWithMonthNumber.toString());
        } else {
            System.out.println(defaultMonth.toString() + " is not equal " + monthWithMonthNumber.toString());
        }

        System.out.println();
        System.out.println("Checking if " + monthWithInvalidName.toString() + " is equal to " + monthWithInvalidNumber.toString());
        System.out.println("They should not be equal");
        monthEqual = monthWithInvalidName.equals(monthWithInvalidNumber);
        if (monthEqual) {
            System.out.println(monthWithInvalidName.toString() + " is equal to " + monthWithInvalidNumber.toString());
        } else {
            System.out.println(monthWithInvalidName.toString() + " is not equal " + monthWithInvalidNumber.toString());
        }

        System.out.println();
        System.out.println(monthWithMonthNumber.toString() + " should be greater than " + monthWithMonthName.toString());
        boolean greater = monthWithMonthNumber.greaterThan(monthWithMonthName);
        if (greater) {
            System.out.println(monthWithMonthNumber.toString() + " is greater than " + monthWithMonthName);
        } else {
            System.out.println(monthWithMonthNumber.toString() + " is greater not than " + monthWithMonthName);
        }

        System.out.println();
        System.out.println(defaultMonth.toString() + " should be less than " + monthWithMonthName.toString());
        boolean less = defaultMonth.lessThan(monthWithMonthName);
        if (less) {
            System.out.println(defaultMonth.toString() + " is less than " + monthWithMonthName);
        } else {
            System.out.println(defaultMonth.toString() + " is defaultMonth not than " + monthWithMonthName);
        }
    }
}


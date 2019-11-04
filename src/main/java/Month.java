/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class Month {
    //declare variable
    private int monthNumber;

    /**
     * Class constructor which sets the month number to 1
     */
    public Month() {
        monthNumber = 1;
    }

    /**
     * Class constructor which accepts and sets the month number
     *
     * @param monthNumber the number of the month
     */
    public Month(int monthNumber) {
        //check if the month number passed is valid
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    /**
     * Class constructor which accepts the name of the month and then determines the month number
     *
     * @param monthName the name of the month
     */
    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (monthName.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (monthName.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (monthName.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (monthName.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (monthName.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (monthName.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (monthName.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (monthName.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (monthName.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (monthName.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (monthName.equalsIgnoreCase("December")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    }

    /**
     * This method accepts and sets the month number after validating whether it is a valid one
     *
     * @param monthNumber month number
     */
    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    /**
     * This method returns the month number
     *
     * @return month number
     */
    public int getMonthNumber() {
        return monthNumber;
    }

    /**
     * This method returns the name of the month
     *
     * @return name of the month
     */
    public String getMonthName() {
        String monthName = "January";
        if (monthNumber == 1) {
            monthName = "January";
        } else if (monthNumber == 2) {
            monthName = "February";
        } else if (monthNumber == 3) {
            monthName = "March";
        } else if (monthNumber == 4) {
            monthName = "April";
        } else if (monthNumber == 5) {
            monthName = "May";
        } else if (monthNumber == 6) {
            monthName = "June";
        } else if (monthNumber == 7) {
            monthName = "July";
        } else if (monthNumber == 8) {
            monthName = "August";
        } else if (monthNumber == 9) {
            monthName = "September";
        } else if (monthNumber == 10) {
            monthName = "October";
        } else if (monthNumber == 11) {
            monthName = "November";
        } else if (monthNumber == 12) {
            monthName = "December";
        }
        return monthName;
    }


    public String toString() {
        return getMonthName();
    }

    /**
     * This method accepts month object as arguments then checks whether the object is equal to the current one
     *
     * @param otherMonth the other month object
     * @return if the two are equal or not
     */
    public boolean equals(Month otherMonth) {
        if (otherMonth == null) {
            return false;
        }
        return this.getMonthNumber() == otherMonth.getMonthNumber();
    }

    /**
     * This method accepts object of another Month and checks whether the current month is greater than the other month passed
     *
     * @param otherMonth the other Month object
     * @return true if greater else false
     */
    public boolean greaterThan(Month otherMonth) {
        if (this.getMonthNumber() > otherMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method accepts object of another Month and checks whether the current month is less than the other month passed
     *
     * @param otherMonth the other Month object
     * @return true if less else false
     */
    public boolean lessThan(Month otherMonth) {
        if (this.getMonthNumber() < otherMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
}

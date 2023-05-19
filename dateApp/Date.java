package dateApp;

/**
 * Undertanding the problem: Create a class Date with the basics methods and atributes.
 * Implement methods to return the month in full (written), to verify if it is a leap year, 
 * to verify if it is a valid date and return (as a String) the Souls' Day.
 * After doing this, create a object in AppDate and show the results.
 * 
 * @author: Bernardo Nilson
 * @version: 19.05.2023
 */

public class Date {

    // Atributes
    private int day;
    private int month;
    private int year;

    // Constructor, I choose to use "this" because the variables have the same name as the atributes
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters, to "get" the specific atribute
    public double getDay() {
        return day;
    }

    public double getMonth() {
        return month;
    }

    public double getYear() {
        return year;
    }

    // Setters, to modify the specific atribute with a new value
    public void setDay(int newDay) {
        day = newDay;
    }

    public void setMonth(int newMonth) {
        month = newMonth;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    // toString, to show all atributes at once
    public String toString() {
        return "Date day: " + day + "\nDate month: " + month + "\nDate year: " + year;
    }

    // Return the month in full (written) using array and repetition
    public String showMonthFull (){
        String [] monthFull = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December"};
        for (int i = 0; i < 12; i++){
            if (i == (month - 1)){
                return monthFull [i];
            }
        }
        return "Ops, something wrong happend!"; 
    }

    public boolean verifyLeapYear (){
        return (year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0 && year % 100 == 0)));
    }

    public String showSoulsDay (){
        return "Souls' Day is in November 2, " + year;
    }

    public boolean verifyDateExistence (){

        int [] monthThirtyOne = {0, 2, 4, 6, 7, 9, 11};
        int [] monthThirty = {3, 5, 8, 10};
        int [] monthTwentyEight = {1};

        for (int i = 0; i <= 11 ; i++){

            if (((month-1) == monthThirtyOne [i])&&((day > 0)&&(day <= 31))){
                return true;
            }
            if (((month-1) == monthThirty [i])&&((day > 0)&&(day <= 30))){
                return true;
            }
            if (verifyLeapYear() && ((month-1) == monthTwentyEight [i])&&((day > 0)&&(day <= 29))){
                return true;
            }
            if (!verifyLeapYear() && ((month-1) == monthTwentyEight [i])&&((day > 0)&&(day <= 28))){
                return true; 
            }
        }
        return false;
    }

}
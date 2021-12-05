/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package measurements;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mac Coleman
 */
public class Time {
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;
    
    private int minutes;
    private int hours;
    private int days;
    
    
    /**
     * @return a new time instance
     * @param days days in time
     * @param hours hours in time
     * @param minutes minutes in time
     */
    public Time(int days, int hours, int minutes) {
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.clean();
    }
    
    /**
     * @return minutes in the time value.
     */
    public int getMinutes() {
        return this.minutes;
    }
    /**
     * @return hours in the time value.
     */
    public int getHours() {
        return this.hours;
    }
    
    /**
     * @return days in the time value
     */
    public int getDays() {
        return this.days;
    }
    
    /**
     * Changes the minutes value, and processes the time value to make
     * sure that minutes is an acceptable value.
     * @param minutes new value in minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
        this.clean();
    }
    
    /**
     * Changes the hours value, and process the time value to make sure that
     * hours is an acceptable value.
     * @param hours new value in hours
     */
    public void setHours(int hours) {
        this.hours = hours;
        this.clean();
    }
    
    /**
     * Changes the days value. No further processing is done.
     * @param days the new value in days.
     */
    public void setDays(int days) {
        this.days = days;
        this.clean();
    }
    
    /**
     * Increments the minutes value by 1. If the minutes value exceeds 59, it
     * wraps around to zero and increments the hours field.
     */
    public void incMinutes() {
        this.minutes += 1;
        this.clean();
    }
    
    /**
     * Increments the hours value by 1. If the hours value exceeds 23, it wraps 
     * around to zero and increments the hours field.
     */
    public void incHours() {
        this.hours += 1;
        this.clean();
    }
    
    /**
     * Increments the days value by 1.
     */
    public void incDays() {
        this.days += 1;
        this.clean();
    }
    
    /**
     * Processes time values to make sure that they are well-formed. For
     * example, minutes can not exceed 59, and hours can not exceed 23.
     */
    public void clean() {
        int extraHours = this.minutes / MINUTES_IN_HOUR;
        this.minutes = this.minutes % MINUTES_IN_HOUR;
        
        this.hours += extraHours;
        int extraDays = this.hours / HOURS_IN_DAY;
        this.hours = this.hours % HOURS_IN_DAY;
        
        this.days += extraDays;
    }
    
    /**
     * Representation of a time as a string.
     * @return String representation of time.
     */
    @Override
    public String toString() {
        String d = this.days != 1 ? " days, " : " day, ";
        String h = this.hours != 1 ? " hours, " : " hour, ";
        String m = this.minutes != 1 ? " minutes" : " minute";
        return this.days + d + this.hours + h + this.minutes + m;
    }
    
    /**
     * Adds two time values together
     * @param otherTime the time to add
     * @return the sum of the two times
     */
    public Time add(Time otherTime) {
        int minutes = this.minutes + otherTime.minutes;
        int hours = this.hours + otherTime.hours;
        int days = this.days + otherTime.days;
        
        return new Time(days, hours, minutes);
    }
    
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 1505);
        System.out.println(t1);
        t1.setMinutes(230);
        System.out.println(t1);
        for (int i = 0; i < 120; i++) {
            t1.incMinutes();
            System.out.println(t1);
        }
        
        Time t2 = new Time(0, 7, 0);
        System.out.println(t2);
        System.out.println("Adding " + t1 + " to " + t2 + " and vice versa.");
        System.out.println(t1.add(t2));
        System.out.println(t2.add(t1));
        
    }
}

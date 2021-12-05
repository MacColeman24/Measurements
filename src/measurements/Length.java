/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package measurements;

/**
 *
 * @author mac
 */
public class Length {
    private static final int INCHES_IN_FOOT = 12;
    
    private int feet;
    private int inches;
    
    public Length(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    
    public Length add(Length other) {
        int overflowFeet = (this.inches + other.inches) / INCHES_IN_FOOT;
        int inches = (this.inches + other.inches) % INCHES_IN_FOOT;
        int feet = this.feet + other.feet + overflowFeet;
        
        return new Length(feet, inches);
        
    }
    
    public double toDecimal() {
        return (double) (this.feet * INCHES_IN_FOOT + this.inches) / INCHES_IN_FOOT;
    }
    
    @Override
    public String toString() {
        String f = this.feet != 1 ? " feet, " : " foot, ";
        String i = this.inches != 1 ? " inches" : " inch";
        
        return this.feet + f + this.inches + i;
    }
    
    public static void main(String[] args) {
        Length height = new Length(6, 2);
        Length hat = new Length(1, 3);
        
        System.out.println("The person is " + height);
        System.out.println("The hat is " + hat);
        System.out.println(height.add(hat));
        
        System.out.println(height.toDecimal());
        System.out.println(hat.toDecimal());
    }
}

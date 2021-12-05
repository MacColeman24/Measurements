/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package measurements;

/**
 *
 * @author mac
 */
public class Measurements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Time timeA = new Time(12, 23, 58);
        Time timeB = new Time(0, 1, 30);
        
        System.out.println(timeA + " + " + timeB + " = " + timeA.add(timeB));
        
        Weight weightA = new Weight(6, 3);
        Weight weightB = new Weight(12, 10);
        
        System.out.println(weightA + " + " + weightB + " = " + weightA.add(weightB));
        
        Length lengthA = new Length(6, 3);
        Length lengthB = new Length(3, 10);
        
        System.out.println(lengthA + " + " + lengthB + " = " + lengthA.add(lengthB));
    }
    
}

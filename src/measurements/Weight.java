/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package measurements;

public class Weight {
    private static final int OUNCES_IN_A_POUND = 16;

    private int pounds;
    private int ounces;

    public Weight( int pounds, int ounces ) {
	this.pounds = pounds;
	this.ounces = ounces;
    }

    public int getPounds() {
	return this.pounds;
    }

    public int getOunces() {
	return this.ounces;
    }

    public void setPounds( int pounds ) {
	this.pounds = pounds;
    }

    public void setOunces( int ounces ) {
	this.ounces = ounces;
    }

    public Weight add( Weight otherWeight ) {
	int lbs = this.pounds + otherWeight.pounds;
	int oz = this.ounces + otherWeight.ounces;
	Weight sum = new Weight( lbs + oz/OUNCES_IN_A_POUND, oz % OUNCES_IN_A_POUND );
        return sum;
    }

    @Override
    public String toString() {
	return this.pounds + " lbs., " + this.ounces + " oz.";
    }

    public static void main( String[] args ) {
	Weight cherries = new Weight( 1, 10 );
	Weight grapes = new Weight( 2, 8 );
	Weight fruit = cherries.add( grapes );
	System.out.println( cherries + " + " + grapes + " = " + fruit );
    }

}
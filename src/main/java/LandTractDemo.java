/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
import java.util.Scanner;

/**
 * This class demonstrates the functionality of the LandTract
 */
public class LandTractDemo {
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        //create Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        //Create objects of the two tracts of land
        LandTract firstTract;
        LandTract secondTract;
        double length;
        double width;

        //prompt user to enter dimensions of the first tract of land
        System.out.println("Enter the dimensions of the first tract of land");
        System.out.print("Enter the length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width: ");
        width = keyboard.nextDouble();
        //create object of the first tract of land
        firstTract = new LandTract(length, width);

        //prompt user to enter dimensions of the second tract of land
        System.out.println("Enter the dimensions of the second tract of land");
        System.out.print("Enter the length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width: ");
        width = keyboard.nextDouble();
        //create object of the second tract of land
        secondTract = new LandTract(length, width);
        System.out.println();

        //display the areas of the two tracts of land
        System.out.println("The area of the first tract of land is: " + firstTract.calculateArea());
        System.out.println("The area of the second tract of land is: " + secondTract.calculateArea());

        System.out.println();
        //check whether the two tracts of lands are equal
        boolean tractsAreEqual = firstTract.equals(secondTract);
        if (tractsAreEqual) {
            System.out.println("The two tracts of land are equal");
        } else {
            System.out.println("The two tracts of land are not equal");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class LandTract {
    //declare variables
    private double length;
    private double width;

    /**
     * Class constructor which accepts width and width of the tract as arguments
     *
     * @param length length of the LandTract
     * @param width  width of the LandTract
     */
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * This method returns the length of the LandTract
     *
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * This method sets the length of the LandTract
     *
     * @param length the length
     */
    public void setLength(double length) {
        this.length = length;
    }


    /**
     * This method returns the width of the LandTract
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * This method sets the width of the LandTract
     *
     * @param width the width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * This method calculates and returns the area of the LandTract
     *
     * @return the area of the LandTract
     */
    public double calculateArea() {
        return length * width;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof LandTract) {
            LandTract newLandTract = (LandTract) obj;
            return newLandTract.getLength() == this.getLength() && newLandTract.getWidth() == newLandTract.getWidth();
        }
        return false;
    }


    public String toString() {
        return "Length: " + length + "\n" +
                "Width:" + width + "\n" +
                "Area: " + calculateArea();
    }
}

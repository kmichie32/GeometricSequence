package com.kevinmichie;

public class GeometricSequence {

    private double currentValue;
    private double multiplier;
    private int count;

    public GeometricSequence(double aCurrentValue, double aMultiplier){
        this.currentValue = aCurrentValue;
        this.multiplier = aMultiplier;
        this.count = 0;
    }

    public double next(){
        double result = currentValue;
        currentValue = currentValue * multiplier;
        return result;
    }

    public static void main(String[] args) {
        GeometricSequence first = new GeometricSequence(1, 2);
        // Creates 1, 2, 4, 8, 16 ...

        GeometricSequence second = new GeometricSequence(10.8, 0.5);
        // Creates 10.8, 5.4, 2.7, 1.35 ...

        System.out.println(first.next()); // Prints 1 and advances
        System.out.println(first.next()); //  Prints 2 and advances
        System.out.println(first.next()); //  Prints 4 and advances
        System.out.println(first.next()); //  Prints 8 and advances

        System.out.println(second.next());  //Prints 10.8 and advances
        System.out.println(second.next());  //Prints 5.4 and advances
        System.out.println(second.next());  //Prints 2.7 and advances
    }
}

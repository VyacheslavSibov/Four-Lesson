package ua.ithillel.java;

public class SquareTest {
    public static void main(String[] args) {

        // ctrl + alt + L
        Square sideSquare = new Square();
        Square sideSquare1 = new Square();

        sideSquare.side = 2;
        System.out.println(sideSquare.side);
        sideSquare.printInfo();


        sideSquare1.side = 4;
        System.out.println(sideSquare1.side);
        sideSquare1.printInfo();

    }
}

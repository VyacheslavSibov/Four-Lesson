package ua.ithillel.java;

public class Square {
    // ctrl + alt + L
    int side = 2;
    int perimetr;
    int size;
    boolean a;


    public void printInfo() {
        perimetr = 2 * side;
        size = side * side;
        boolean a = (size == perimetr);

        System.out.println("������� �������� : " + side);
        System.out.println("������� �������� : " + size);
        System.out.println("�������� �������� : " + perimetr);
        System.out.println("�������� ������� :" + a);
    }
}

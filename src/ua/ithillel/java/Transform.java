package ua.ithillel.java;

public class Transform {
    public static void main(String[] args) {
        // ctrl + alt+ L
        byte b = 125;
        short s = b;
        int i = s;
        long l = i;
        System.out.println("long : " + i);

        int a = 2167322;
        double d = a;
        System.out.println("double : " + d);

        short sh = 32760;
        float f = sh;
        double da = f;
        System.out.println("double2: " + f);

        char ch = 65530;
        int in = ch;
        System.out.println("int : " + in);
    }
}

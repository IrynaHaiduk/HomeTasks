package de.telran.lesson6;

public class StringExample {
    public static void main(String[] args) {
        String text1 = "Java is a programming language!";
        String text2 = "Java";
        text2 = text2 + "!";
        int text1Length = text1.length();
        int text2Length = text2.length();

        System.out.println(text2.length());
        System.out.println(text2.charAt(4));
        System.out.println(text2.charAt(text2Length - 3));

        String text2Subst = text2.substring(0, 3); // 3 not included
        String text1Subst = text1.substring(0, 20); // 20 not included

        String text1Upper = text1.toUpperCase();

        String text2Upper = text2.toUpperCase();

        String text1Lower = text1.toLowerCase();

        String text2Lower = text2.toLowerCase();

        System.out.println(text2Subst);
        System.out.println(text1Subst);

        System.out.println(text1.replace("a", "o"));

        System.out.println(text1.contains(text2));



byte v1 = 100;
int v2 = v1;
int v3 = 200;
byte v4 = (byte) v3;

        System.out.println(v4);




    }
}

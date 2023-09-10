package de.telran.homeTasks.homeTask1.stringTask1;

public class StringTask1 {
    public static void main(String[] args) {
        String str1 = new String("I study Basic Java!");

        Student student1 = new Student();

        student1.losung(str1);

        System.out.println(str1.charAt( str1.length()-1));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.substring(str1.length() - 5, str1.length() -1 ));
        System.out.println(str1.replace("a", "o"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}

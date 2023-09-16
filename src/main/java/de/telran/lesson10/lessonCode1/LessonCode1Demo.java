package de.telran.lesson10.lessonCode1;

import de.telran.lesson10.lessonCode1.LessonCode1;

public class LessonCode1Demo {
    public static void main(String[] args) {
        LessonCode1 lessonCode = new LessonCode1();

        int userNum = lessonCode.getNumber();
        lessonCode.isEven(userNum);
    }
}

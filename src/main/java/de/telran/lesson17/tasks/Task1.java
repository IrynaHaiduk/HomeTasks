package de.telran.lesson17.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    //Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
    // Не используйте дополнительный массив для хранения результатов.

    public static void main(String[] args) {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn", "October"};

        for (int i = 0; i < seasons.length / 2; i++) {
            String tempString = seasons[i];
            seasons[i] = seasons[seasons.length - i - 1];
            seasons[seasons.length - i - 1] = tempString;

        }
        System.out.println(Arrays.toString(seasons));


        // Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
        // Введенное пользователем число сохраняется в переменную n.
        //Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        //Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

        Scanner scanner = new Scanner(System.in);



        int n;

        do {
            System.out.println("Enter integer number more than 3: ");
            n = scanner.nextInt();
        } while (n <= 3);

        int[] intArray  = new int[n];

        Random random = new Random();



        for (int i = 0; i < n; i++)
        {
            intArray[i] = random.nextInt(n);
        }

        System.out.println(Arrays.toString(intArray));

        int[] evenNumArray = new int[intArray.length];
        int counterArray = 0;

     for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] % 2 == 0) {
              evenNumArray[counterArray] = intArray[i];
              counterArray++;

         }
        }


        if (evenNumArray.length > 0) {
            System.out.println(Arrays.toString(evenNumArray));
        }

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
        //Определите какой элемент является в этом массиве максимальным и
        //сообщите индекс его последнего вхождения в массив.


    }



}

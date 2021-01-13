package com.metanit;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//firstTask();
	//secondTask();
    //thirdTask();
    //System.out.println( 'z' );
    //fifthTask();
    }

    public static void firstTask() {
        /*1Заполните массив случайным числами и выведете максимальное, минимальное и
        среднее значение.*/
        System.out.println("Insert number of elements in array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Insert max and min in array");
        int min1 = input.nextInt();
        int max1 = input.nextInt();
        //Generate the array of random numbers
        double [] arr  = new double [size];
        for (int i = 0; i < size; i++) {
            arr[i] =  Math.random() * (max1 - min1) + min1;
        }
        System.out.println("Here is random array");
        arrayOutput(arr, size);
        //поиск максимума, минимума и среднего
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = sum/size;
        System.out.println("Here is average numver " + avg);
        System.out.println("Here is min " + min);
        System.out.println("Here is max " + max);
        //System.out.println(Math.random() * (max - min) + min);
    }

    public static void secondTask () {
        /*2 Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].*/
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + i);
            }
        }
    }

    public static void thirdTask () {
        /*3 Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого
        числа из массива (пропусков быть не должно) */
        System.out.println("Insert number of elements in array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Insert elements of array");
        arrayInput(arr, size);
        System.out.println("Output of initial array:");
        arrayOutputInt(arr, size);
        System.out.println("Insert number you want to delete in array");
        int a = input.nextInt();
        int n = 0; //новая размерность массива

        for (int i = 0; i < size; i++) {
            if (arr[i] != a) {
                n ++;
            }
        }
        int [] newArr = new int[n];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != a) {
                newArr[j] = arr[i];
                j ++;
            }
        }
        System.out.println("Output of transformed array:");
        arrayOutputInt(newArr, n);
    }

    public static void fifthTask () {
        /* 5 Постройте частотный словарь букв русского (или английского) алфавита. Опустим
        проблему выбора и анализа корпуса языка, достаточно будет взять текст
        небольшой длины). */
        System.out.println("Insert a string");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.toLowerCase(); //сделали все буквы в строке маленькими

        int [] arr = new int ['z' - 'a']; // создадим массив в котором элемент обозначает частоту отдельных букв в строке
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // c - это i-ый элемент введенной строки
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a'] ++; //если с лежит в диапазоне от a до z то мы инкрементируем частоту этого элемента
            }
        }
        for (int i = 0; i < (int)('z' - 'a'); i ++) {
            System.out.println("frequency of " + (char) ('a' + i) + " = " + arr[i]);
        }
    }

    public static void arrayOutput (double [] arr, int size) {
        for (int i = 0; i < size; i ++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void arrayOutputInt (int [] arr, int size) {
        for (int i = 0; i < size; i ++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void arrayInput (int [] arr, int size) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i ++) {
            arr[i] = input.nextInt();
        }
    }
}

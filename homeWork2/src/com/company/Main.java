package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// массивы
    // /////////////// task1 ///////////////
        /*int array[] = new  int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = (int) ((Math.random()* (99-10))+10);
        }

        for (int i: array) {
            System.out.print(i+ ", ");
        }

        boolean isNotAscending = false;

        for (int i=0; i<3; i++) {
            if (array[i] >= array[i+1]) {
                isNotAscending = true;
                break;
            }
        }

        if (isNotAscending) {
            System.out.println("последовательность не является строго возрастающей");
        } else
            System.out.println("последовательность возрастающая");*/

        // /////////////// task2 ///////////////

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray =scanner.nextInt();

        System.out.println("Введите нижний порог");
        int minRange = scanner.nextInt();

        System.out.println("Введите верхний порог");
        int maxRange = scanner.nextInt();

        while (sizeArray < 0) {
            System.out.println("Введите размер массива еще раз");
            sizeArray =scanner.nextInt();
        }

        while (minRange > maxRange) {
            System.out.println("Введите нижний порог еще раз");
               minRange = scanner.nextInt();

            System.out.println("Введите верхний порог еще раз");
               maxRange = scanner.nextInt();
        }

        int arr [] = new int [sizeArray];
        for (int i = 0; i < arr.length; i++){
          arr[i] =  (int) ((Math.random()* (maxRange-minRange))+minRange);
        }

        for (int i : arr) {
            System.out.print(i+",");
        }*/



        // /////////////// task3 ///////////////
          /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальные число на отрезке");
        int minValue = scanner.nextInt();

        System.out.println("Введите маскимальное число на отрезке");
        int maxValue = scanner.nextInt();

        System.out.println("Введите размер массива");
        int sizerArr  = scanner.nextInt();

        int [] array = new int[sizerArr];

        for (int i=0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*(maxValue-minValue))+minValue);
        }

        int maxElement = array[0];
        int index = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]>maxElement) {
                maxElement = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемант "+maxElement);
        System.out.println("Индекс элемента "+index);*/


        // /////////////// task4 ///////////////
         /* Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальные число на отрезке");
        int minValue = scanner.nextInt();

        System.out.println("Введите маскимальное число на отрезке");
        int maxValue = scanner.nextInt();

        System.out.println("Введите размер массива");
        int sizerArr  = scanner.nextInt();

        int [] array = new int[sizerArr];

        for (int i=0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*(maxValue-minValue))+minValue);
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+ ", ");
        }

        int temp = 0;
        boolean sort = false;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j =0; j<array.length-i-1; j++)

            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }

        System.out.println("");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+ ", ");
        }*/


        //строки
        // /////////////// task1 ///////////////
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.nextLine();

        System.out.println("Введите символ");
        char sign = scanner.nextLine().charAt(0);

        int counter = 0;

        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == sign){
                counter++;
            }
        }

        System.out.println("колво символов: "+ counter);*/

        // /////////////// task2 ///////////////
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.nextLine();

        while(str.isEmpty()) {
            System.out.println("Введите строку");
            str = scanner.nextLine();
        }

        System.out.println("Введите символ a");
        char signA = scanner.nextLine().charAt(0);

        System.out.println("Введите символ b");
        char signB = scanner.nextLine().charAt(0);

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == signA) {
                sb.setCharAt(i, signB);
                str = sb.toString();
            }
        }
        System.out.println(str);

    }
}

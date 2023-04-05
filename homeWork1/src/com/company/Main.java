package com.company;


public class Main {

    public static void main(String[] args) {
	   //Операторы сравнения и логические операторы:

       ///////////////// task1  /////////////////
       /*int n = 8;
       if(n% 2 == 0) {
           System.out.println("Число четное");
       } else {
           System.out.println("Число нечетное");
       }*/


       ////////////////// task2 /////////////////
        /*int dayNum = 1;

        if (dayNum == 1) {

        } else  if (dayNum == 2) {
            System.out.println("Вторник");
        } else  if (dayNum == 3) {
            System.out.println("среда");
        } else  if (dayNum == 4) {
            System.out.println("Четверг");
        } else  if (dayNum == 5) {
            System.out.println("Пятница");
        } else  if (dayNum == 6) {
            System.out.println("Суббота");
        } else  if (dayNum == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели не существует");
        }*/

        // Реализация чеез switch
        /* switch (dayNum) {
             case 1:
                 System.out.println("Понедельник");
                 break;
             case 2:
                 System.out.println("Вторник");
                 break;
             case 3:
                 System.out.println("Среда");
                 break;
             case 4:
                 System.out.println("Четверг");
                 break;
             case 5:
                 System.out.println("Пятница");
                 break;
             case 6:
                 System.out.println("Суббота");
                 break;
             case 7:
                 System.out.println("Воскресенье");
                 break;
             default:
                 System.out.println("Не существует аткого дня недели");
                 break;
         }*/


        ///////////////// task3 ///////////////

      /*  int value1 = 4;
        int value2 = 8;
        int value3 = 5;

        int sumValue=0;
        if ((value1 < value2) && (value1 < value3)) {
            sumValue = value2+value3;
        } else if ((value2 < value1) && (value2 < value3)) {
            sumValue = value1+value3;
        } else if ((value3 < value1) && (value3 < value2)) {
          sumValue = value1+value2;
        }
            System.out.println("сумма наибольших чисел " + sumValue);
        }*/

        ///////////////// task4 ///////////////

       /* int numverYear = 2001;

        if ((numverYear% 4 == 0) && !((numverYear% 100 == 0) && (numverYear% 400 != 0))) {
            System.out.println("Високосный год(366)");
        }
        else {
            System.out.println("Обычный год(365)");
        }*/






        //Циклы:
        ///////////////// task1 ///////////////

       /* int counter = 1;
        while (counter < 8) {
            System.out.println("Task"+counter);
           counter++;
        }*/


        ///////////////// task2 ///////////////
       /* int counter = 1;
        do {
            if (counter % 5 == 0) {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= 100);*/


        ///////////////// task3 ///////////////

        /*int value = 12;
        long resultFactorial = 1;
        for  (int i=1; i <= value; i++) {
            resultFactorial = resultFactorial * i;
        }
        System.out.println(resultFactorial);*/


        ///////////////// task4 ///////////////
        int a = 10;
        int b = 1000;
        int countIteration = 0;

           for (int i = b-1; i > a; i--) {
               System.out.println(i);
               countIteration++;
           }

        System.out.println("Количество: "+countIteration);


    }


    }

package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)  {

        //////////task1////////////
        System.out.println("///////task1/////////");
        int value1  = 3;
        int value2 = 56;
        String resStr = "";

        StringBuilder builder = new StringBuilder();

        resStr = builder.append(value1).append("+").append(value2).append("=59").toString();
        System.out.println(resStr);
        resStr = builder.replace(4,5, "равно").toString();
        System.out.println(resStr);
        System.out.println();

        builder.setLength(0);
        resStr = builder.append(value1).append("-").append(value2).append("=-53").toString();
        System.out.println(resStr);
        resStr = builder.replace(4,5, "равно").toString();
        System.out.println(resStr);
        System.out.println();

        builder.setLength(0);
        resStr = builder.append(value1).append("*").append(value2).append("=168").toString();
        System.out.println(resStr);
        resStr = builder.replace(4,5, "равно").toString();
        System.out.println(resStr);
        System.out.println();


        ///////task2/////////поиск ссылки
        System.out.println("///////task2/////////");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки:");
        String str = scanner.nextLine();

        Pattern p = Pattern.compile("^[a-zA-Z0-9]{1,}.com$");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println("ссылка найдена");
        }
        else System.out.println("ссылка не найдена");


        ///////task3/////////
        System.out.println("///////task3/////////");
        String str2 = "anb acb aeb aeeb adcb axeb"; // ahb acb aeb
        Pattern p1 = Pattern.compile("[a].[b]");
        Matcher m1 = p1.matcher(str2);
        while (m1.find()) {
            System.out.println(m1.group());
        }

        ///////task4/////////
        System.out.println("///////task4/////////");
        String str3 = "ab abab abab abababab abea"; //

        Pattern p2 = Pattern.compile("([a][b]){1,}");
        Matcher m2 = p2.matcher(str3);
        while (m2.find()) {
            System.out.println(m2.group());
        }

        ///////task5/////////
        System.out.println("///////task5/////////");
        System.out.println("Введите дату для проверки:");
        String strDate = scanner.nextLine();

        Pattern p3 = Pattern.compile("^([12][0-9][0-9][0-9]){1}\\/((0[0-9])|(1[012]))\\/([0-3][0-9]){1}\\s([0-2][0-9][:][0-6][0-9]){1}");
        Matcher m3 = p3.matcher(strDate);
        if (m3.find()) {
            System.out.println(strDate+" существует");
        }  else System.out.println(strDate+ " не существует");




        /////////////////////////////////////исключения/////////////////////////
        System.out.println("Введите фамилию и имя:");
        String fio = scanner.nextLine();

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        try {
          checkUser(fio,age);
        } catch (IncorrectInfoException e) {
            e.printStackTrace();
            System.out.println(e.getAge());
            System.out.println(e.getFio());
        }
    }

    public  static void checkUser(String fio, int age) throws  IncorrectInfoException{
        if (age > 100 || age < 0) {
            throw new IncorrectInfoException("возраст некорректный",age,fio);
        } else if ((fio.length() > 200) || (fio.indexOf("!") != -1) || (fio.indexOf("?") != -1) || (fio.indexOf("&") != -1) ) {
            throw new IncorrectInfoException("некорректное ФИО",age,fio);
        }
    }
}

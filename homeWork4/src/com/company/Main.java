package com.company;

public class Main {

    public static void main(String[] args) {
       //item2
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        //item3
        System.out.println(phone1.getModel() +" "+ phone1.getNumber()+" "+phone1.getWeight());
        System.out.println(phone2.getModel() +" "+ phone2.getNumber()+" "+phone2.getWeight());
        System.out.println(phone3.getModel() +" "+ phone3.getNumber()+" "+phone3.getWeight());

        //item4
        phone1.receiveCall("Дима1");
        phone1.getNumber();

        phone2.receiveCall("Дима2");
        phone2.getNumber();

        phone2.receiveCall("Дима3");
        phone2.getNumber();

        //item9
        phone1.receiveCall("Dima","+375331111111");

        //item10
        phone1.sendMessage("+375331234578", "+375299997775","+375442223336");

    }
}

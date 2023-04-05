package com.company;

public class Phone {
    private String number = "332";
    private String model= "testName";
    private double weight= 124.4;


    public Phone (String number, String model, Double weight) {
        this(number,model);  //item8
        this.weight = weight;
    }

    public Phone (String number, String model) { //item6
        this.number = number;
        this.model = model;
    }

    public Phone () { //item7
    }

    public void receiveCall(String name) {
        System.out.println("звонит "+name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("звонит "+name + " номер "+number);
    }

    public void sendMessage(String ... number) {
        System.out.println("на данные номера отправлены сообщения: ");
        for (String valueNumber :number) {
            System.out.println(valueNumber);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

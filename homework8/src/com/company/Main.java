package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        //Reader[] readers = new Reader[10];

        ArrayList<Reader> readers = new ArrayList<Reader>();

        do {
            System.out.println("1-добавить нового читателя");
            System.out.println("2-читатель хочет взять книгу");
            System.out.println("3-читатель хочет вернуть книгу");
            System.out.println("4-Статус читателя");
            System.out.println("5-Статусы всех читателей");
            System.out.println("6-Выход");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:{
                    System.out.println("Введите ФИО читателя");
                    String fio = scanner.nextLine();

                    System.out.println("Введите номер билета читателя");
                    int numberTicket = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Введите факультет читателя");
                    String faculty = scanner.nextLine();

                    System.out.println("Введите дату рождения читателя");
                    String dateOfBirth = scanner.nextLine();

                    System.out.println("Введите телефон читателя");
                    String phoneNumber = scanner.nextLine();

                    Reader rd = new Reader(fio, numberTicket, faculty, dateOfBirth, phoneNumber);

                    readers.add(rd);
                    break;
                }

                case 2: {

                    System.out.println("Введите номер билета");
                    int nunber = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (Reader r : readers) {
                        if ((!readers.isEmpty()) && (r.getNumbTicket() == nunber)) {

                            System.out.println("Введите название книги");
                            String nameBook = scanner.nextLine();

                            System.out.println("Введите автора");
                            String authorBook = scanner.nextLine();

                            Book book = new Book(nameBook, authorBook, "");

                            r.takeBook(book);

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите номер билета");
                    int nunber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Введите название книги");
                    String nameBook = scanner.nextLine();

                    boolean found = false;

                    for (Reader r : readers) {
                        if (!readers.isEmpty()  && r.getNumbTicket() == nunber){
                            r.returBook(nameBook);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер билета");
                    int nunber = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (Reader r : readers) {
                        if (r.getNumbTicket() == nunber) {
                            r.printStatus();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r : readers) {
                        r.printStatus();
                    }
                    break;
                }
            }
          } while (action != 6);
    }
}

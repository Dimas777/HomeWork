package com.company;

import sun.font.TrueTypeFont;

import java.util.Date;

public class Reader {
   private String fio;
   private int numbTicket;
   private String faculty;
   private String dateOfBirth;
   private String phoneNumber;
   private Book[] arrayBook = new Book[10];


   public Reader (String fio, int numbTicket, String faculty, String dateOfBirth, String phoneNumber) {
      this.fio = fio;
      this.numbTicket = numbTicket;
      this.faculty=  faculty;
      this.dateOfBirth = dateOfBirth;
      this.phoneNumber = phoneNumber;
   }

   public void printStatus() {
     String listBook="";
     int counter=0;
     for (int i =0; i<arrayBook.length; i++) {
        if (arrayBook[i] != null) {
           listBook = listBook.concat(", ").concat(arrayBook[i].getName());
           counter++;
        }
     }
      System.out.println(fio + " взял "+ counter + " книг: " +listBook.substring(1));
   }

   public void takeBook(Book book){
     Boolean addedBook = false;

     for (int i = 0; i<arrayBook.length;i++) {
       if (arrayBook[i] == null) {
          arrayBook[i] = book;
          System.out.println(getFio()+" взял книгу"+ book.getName() );
          addedBook= true;
          break;
       }
     }

     if (!addedBook) {
        System.out.println("количество книг максимальное" );
     }
   }

   public void returBook (String bookName) {
      boolean isBook=false;
      for (int i=0; i < arrayBook.length; i++) {
         if ((arrayBook[i].getName().equals(bookName)) && (arrayBook[i]) != null) {
            arrayBook[i] = null;
            System.out.println(getFio()+" вернул книгу "+ bookName);
            isBook = true;
            break;
         }
      }

      if (!isBook) {
         System.out.println(getFio()+" не хранит книгу "+ bookName);
      }

   }

   public String getFio() {
      return fio;
   }

   public void setFio(String fio) {
      this.fio = fio;
   }

   public int getNumbTicket() {
      return numbTicket;
   }

   public void setNumbTicket(int numbTicket) {
      this.numbTicket = numbTicket;
   }

   public String getFaculty() {
      return faculty;
   }

   public void setFaculty(String faculty) {
      this.faculty = faculty;
   }

   public String getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public Book[] getArrayBook() {
      return arrayBook;
   }

   public void setArrayBook(Book[] arrayBook) {
      this.arrayBook = arrayBook;
   }
}

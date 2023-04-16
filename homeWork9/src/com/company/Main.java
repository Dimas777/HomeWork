package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File pathCatalog = new File("E:\\курсы_Java\\ДЗ\\дз9");

        File filesList[] = pathCatalog.listFiles();

        for (File file: filesList) {
            StringBuilder sb = new StringBuilder();

            try (FileInputStream fin = new FileInputStream("E:\\курсы_Java\\ДЗ\\дз9\\"+file.getName())) {

                int i;
                while ((i=fin.read())!=-1) {
                    sb.append((char)i);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            addToFile(sb.append(" ").toString());
        }
    }

    public static void addToFile(String str) {
    try (FileWriter writer = new FileWriter("E:\\курсы_Java\\ДЗ\\result.txt", true)) {

            writer.write(str);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}





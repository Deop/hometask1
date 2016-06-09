package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Enter path to txt file");
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.next();
        System.out.println("Enter number of lines to read (int value) or send empty line for default value");
        Scanner scanner2 = new Scanner(System.in);
        int i = 10;
        String sc2 = scanner2.nextLine();
        if (sc2.equals("")) {
            scanner2.close();
        } else {
            i = Integer.parseInt(sc2);
        }
        System.out.println(s);
        System.out.println(i);
        readTestCasesFromFile(s, i);
    }

    public static void readTestCasesFromFile(String filePath) throws IOException {
        FileInputStream fs = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        for (int i = 0; i < 11; i++) {
            //br.readLine();
            System.out.println(br.readLine());
        }
        br.close();
    }

    public static void readTestCasesFromFile(String filePath, int numberOfLines) throws IOException {
        FileInputStream fs = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        for (int i = 0; i < numberOfLines + 1; i++) {
            //br.readLine();
            System.out.println(br.readLine());
        }
        br.close();
    }
}

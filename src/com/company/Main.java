package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
}

package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    public static List<Employee> readFile(String fileName) {
        try {
            return tryReadFile(fileName);
        } catch (FileNotFoundException e) {
            // System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            return null;
        }
    }
    public static List<Employee> tryReadFile(String fileName) throws FileNotFoundException {
        List<Employee> empList = new ArrayList<>();       
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(":");
            Employee emp = new Employee(lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4], Integer.parseInt(lineArray[5]), Integer.parseInt(lineArray[6]));
            empList.add(emp);
            //System.out.println(lineArray[0]);
        } 
        sc.close();
        return empList;
    }
}
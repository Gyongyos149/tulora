package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Túlóra");
        List<Employee> employees = Storage.readFile("tulorabt.txt");
        System.out.println("Városok:");
        Solution.getUniqueCities(employees);

        System.out.println("Átlagfizetések városokonként:");
        Solution.getAvgSalaryPerCities(employees); 
    }
}
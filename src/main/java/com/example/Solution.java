package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    
    public static void getUniqueCities(List<Employee> employees) {
        Set<String> uniqueCities = new HashSet<>();
        for (Employee employee : employees) {
            uniqueCities.add(employee.getCity());
        }
        System.out.println(uniqueCities);
    }

    public static void getAvgSalaryPerCities(List<Employee> employees) {
        HashMap<String, Integer> citySalarySum = new HashMap<>();
        HashMap<String, Integer> cityEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            String city = employee.getCity();
            Integer salary = employee.getSalary();

            citySalarySum.put(city, citySalarySum.getOrDefault(city, 0) + salary);
            cityEmployeeCount.put(city, cityEmployeeCount.getOrDefault(city, 0) + 1);
        }

        for (String city : citySalarySum.keySet()) {
            int totalSalary = citySalarySum.get(city);
            int employeeCount = cityEmployeeCount.get(city);
            double avgSalary = (double) totalSalary / employeeCount;
            System.out.println(city + ": " + avgSalary);
        }   
    }
}

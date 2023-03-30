package com.hillel.qa.java.arithmetic_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Написати програму, яка виводить на екран рік народження мого друга.
     * </p>
     *<br>
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>Створіть змінну currentYear, яка буде містити поточний рік.</li>
     *     <li>Створіть змінну friendYear, яка буде містити рік народження друга.</li>
     *     <li>Вивести в консоль "Моєму другу (число) років".</li>
     * </ul>
     */
    public static void main(String[] args) {
     short currentYear = 2023 ;
     short friendYear = 2000 ;
     int age = (currentYear - friendYear) ;
     String text = "Моєму другу " + age + " років" ;
     System.out.println(text);

    }
}

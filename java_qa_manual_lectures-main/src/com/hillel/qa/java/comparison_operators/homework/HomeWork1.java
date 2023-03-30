package com.hillel.qa.java.comparison_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Зробіть так щоб виведення в консоль було false.
     * </p>
     * <h1>Вимоги:</h1>
     * <ol style="font-size:12px">
     *     <li>Не змінювати зміні a, b</li>
     *     <li>Не чіпати знак ></li>
     * </ol>
     */
    public static void main(String[] args) {
       //Вариант 1
        int a = 5;
        int b = 3;
        boolean result = !(a > b);
        System.out.println(result);
        //Вариант 2
        int c = 5;
        int d = 3;
        boolean result2 = c > d;
        System.out.println(!result2);

    }
}

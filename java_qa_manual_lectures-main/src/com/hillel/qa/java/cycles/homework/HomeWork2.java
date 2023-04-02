package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {
        int b = 0 ;
        System.out.println("Введіть цілі числа, Для завершення введіть Exit");
        Scanner console = new Scanner(System.in);

        while (true)
        {
            String s = console.nextLine();

            if (s.equals("Exit"))
                break;
            int c = Integer.valueOf(s);
            b = b + c;

        }
        System.out.println("Результат " + b);


    }
}

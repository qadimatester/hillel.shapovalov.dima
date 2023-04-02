package com.hillel.qa.java.cycles.homework;

//import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Намалюйте в консолі прямокутний трикутник із зірочок
     * (або плюсиків, або будь-якого другого символу):
     * на першому рядку - одна зірочка, на другій дві, і так далі.
     * </p>
     * <br>
     * <h2>Вимоги</h2>
     * <ol style="font-size:12px">
     *     <li>Висоту та символ трикутника отримати з клавіатури</li>
     *     <li>Висота трикутника дорівнює висоті яку ми отримали з клавіатури</li>
     *     <li>Трикутник малювати символом який отримали з клавіатури</li>
     *     <li>Використовувати цикл for</li>
     * </ol>
     * <br>
     * <h2>Приклад</h2>
     * <p style="font-size:12px">
     *     Наприклад ввели з клавіатури число 4 та символ "+"
     *     <br>
     *     Вивід:
     *      <br>
     *     +
     *     <br>
     *     ++
     *      <br>
     *     +++
     *     <br>
     *     ++++
     * </p>
     */
    public static void main(String[] args) {
        System.out.println("Введіть символ");
        Scanner symbo = new Scanner(System.in);
        String s = symbo.nextLine();
        System.out.println("Введіть висоту трикутника");
       Scanner height = new Scanner(System.in);
       String a = s;
        for (int h =height.nextInt(); h>0; h--) {
            System.out.println(a);
            a = a + s;
        }
/* вариант 2
        System.out.println("Введіть символ");
        Scanner symbo = new Scanner(System.in);
        String s = symbo.nextLine();
        System.out.println("Введіть висоту трикутника");
        Scanner height = new Scanner(System.in);
        int h =height.nextInt();
        String a = s;
        while (h > 0) {
            System.out.println(a);
            a = a + s;
                h--;
        } */
    }
}

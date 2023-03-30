package com.hillel.qa.java.branching.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, яка буде рахувати можливість існування трикутника,
     * виходячи з довжин його сторін.
     * Вимоги:
     *     <ol style="font-size:12px">
     *         <li>Ввести з клавіатури три числа — довжини сторін передбачуваного трикутника.
     *         Для того щоб це зробити самостійно гляньте як працює Scanner scanner = new Scanner(System.in);</li>
     *         <li>Визначити можливість існування трикутника з даними сторонами.</li>
     *         <li> Результат вивести на екран : "Трикутник можливо побудувати" або "Трикутник не можливо побудувати".</li>
     *     </ol>
     * </p>
     *
     * @see <a href="https://www.w3schools.com/java/java_user_input.asp">Стаття як користуватися Scanner</a>
     */


    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;

        System.out.println("Введите сторону А");
        sideA = a.nextDouble();

        System.out.println("Введите сторону В");
        sideB = b.nextDouble();

        System.out.println("Введите сторону С");
        sideC = c.nextDouble();

        if ((sideA+sideB) > sideC && (sideA+sideC) > sideB && (sideB+sideC) > sideA) {
            System.out.println("Трикутник можливо побудувати");
          }
        else {
            System.out.println("Трикутник не можливо побудувати");
             }
    }

    }








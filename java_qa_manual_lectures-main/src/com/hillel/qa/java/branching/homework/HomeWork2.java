package com.hillel.qa.java.branching.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Згадаймо математику та систему координат.
     * Необхідно написати програму в якій будуть дві зміні x, y.
     * Програма повинна казати в якій чверті знаходиться ціль згідно зміним x, y.
     * В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     * врахуйте обробку якщо x, y будуть 0.
     * </p>
     */
    public static void main(String[] args) {
        double x = 0;
        double y = 1;
        if ((x > 0) && (y > 0)) {
            System.out.println("Ціль знаходиться в 1 чверті");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("Ціль знаходиться в 2 чверті");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("Ціль знаходиться в 3 чверті");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("Ціль знаходиться в 4 чверті");
        } else if ((x == 0) && (y != 0)) {
            System.out.println("Ціль знаходиться на осі y");
        } else if ((x != 0) && (y == 0)) {
            System.out.println("Ціль знаходиться на осі x");
        } else {
            System.out.println("Ціль знаходиться на нулі");
        }

    }
}


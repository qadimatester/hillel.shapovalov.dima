package com.hillel.qa.java.branching.homework;

public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {
        // Варіант1 тут не можу додати дрібні числа. Відсотки вказав вручну
        int purchaseAmount = 102; // Сума яку сплатили
        int price = 100 ;   // Ціна товара


        switch (102) {
            case 100 :
                System.out.println("Сплатили готівкою");
                break;
            case 102 :
                System.out.println("Сплатили карткою");
                break;
            case 105 :
                System.out.println("Сплатили з рахунку");
                break;
            default:
                System.out.println("Немає відповідності будь-якому способу оплати");

        }

// варіант 2 . Можна використати дрібні числа. Відсотки додає автоматично
        double purchaseAmount2 = 106;
        double price2 =100;
        double cash2 = price2;
        double cardPrice = price2 + price2*0.02;
        double accountPrice = price2 + price2*0.05;
        if (cash2 == purchaseAmount2) {System.out.println("Сплатили готівкою");}
        else if (cardPrice == purchaseAmount2) {System.out.println("Сплатили карткою");}
        else if (accountPrice == purchaseAmount2) {System.out.println("Сплатили з рахунку");}
        else {System.out.println("Немає відповідності будь-якому способу оплати");}

    }
}

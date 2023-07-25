package HomeWork.HomeWork2;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
////////////////////////////////// ↓↓↓ Вызов операции вывода в консоль сложения аргументов:
        int a = 90;
        int b = 3;
        printSum(a, b);     // --- на этапе компиляции допустит только тип int в аргументы - ИСКЛЮЧЕНИЯ НЕ НУЖНЫ

////////////////////////////////// ↓↓↓ Вызов операции вывода в консоль деления аргументов:
        printDivider(a, b);

////////////////////////////////// ↓↓↓ Обработка IndexOutOfBoundsException в клиентском коде, т.к. отдельный метод перегрузит:
        try {
            int[] abc = {1, 2};
            int index = 1;
            int setValue = 9;
            abc[index] = setValue;     // --- на этапе компиляции допустит только тип int в аргументы
            System.out.println("ПРИСВОЕНИЕ индексу " + index
                                                     + " значения "
                                                     + setValue + " = "
                                                     + abc[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Catching exception: " + ex);
        }
    }

    public static void printSum(int a, int b) {
        System.out.println("СЛОЖЕНИЕ a + b = " + a + b);
    }

    public static void printDivider(int a, int b) {///проверка только на ArithmeticException
        try {
            System.out.println("ДЕЛЕНИЕ a / b = " + a / b); // для наглядности
        } catch (ArithmeticException ex) {
            System.err.println("Catching exception: " + ex);
        }
    }

}

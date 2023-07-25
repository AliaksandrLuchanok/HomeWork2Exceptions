package HomeWork.HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */

class Task1 {
    public static void main(String[] args) {
        System.out.println(getValueTypeFloat());
    }
    public static float getValueTypeFloat() {
        Scanner scanner = new Scanner(System.in);
        String useString = null;
        try {
            useString = scanner.nextLine();
            float resultData = Float.parseFloat(useString.replace(",","."));
            System.out.println(resultData);
            return resultData;
        } catch (NumberFormatException e) {
            System.err.println("Incorrect data entered, please, repeat: ");
            return getValueTypeFloat();
        }
    }
}
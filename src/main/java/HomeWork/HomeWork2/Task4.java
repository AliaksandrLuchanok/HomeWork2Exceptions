package HomeWork.HomeWork2;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) {
        enterString();
    }
    private static void enterString(){
        System.out.println("Input your data, please: ");
        Scanner scanner = new Scanner(System.in);
        String useString = scanner.nextLine().replaceAll(" ","");
        if (useString.equals("")){
            System.err.println("Empty lines cannot be entered");
            enterString();
        }
        else {
            System.out.println("You have entered: " + useString);
        }
    }
}

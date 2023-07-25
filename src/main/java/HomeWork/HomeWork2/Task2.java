package HomeWork.HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {4,5,6,4,2,8,7, 5,8};                       // Проверки значений на null нет, поскольку в массивах - недопустимо
            int d = 0;
            double catchedRes1 = intArray[10] / d;
//            double catchedRes1 = intArray[5] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // ++++++Добавлено исключение выхода за пределы массива
            System.err.println("Catching exception: " + e);
        }

    }
}






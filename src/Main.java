import java.util.Arrays;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"1.1 First Task"+ANSI_RESET); ///////////////// 1_1 //////////////////
        /*Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».*/
        int payments [] = generateRandomArray();
        int totalPayments = 0;
        for (int payment : payments) {
            totalPayments+=payment;
        }
        System.out.println("Сумма трат за месяц составляет "+totalPayments+" рублей");

        System.out.println(ANSI_RED+"1.2 Second Task"+ANSI_RESET); ///////////////// 1_2 //////////////////
        System.out.println(ANSI_RED+"1.3 Third Task"+ANSI_RESET); ///////////////// 1_3 //////////////////



    }// main
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    } ////// Генератор 30 int-ов
} // Main
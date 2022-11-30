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
        System.out.println("Наш массив: " + Arrays.toString(payments));
        int totalPayments = 0;
        for (int payment : payments) {
            totalPayments+=payment;
        }
        System.out.println("Сумма трат за месяц составляет "+totalPayments+" рублей");

        System.out.println(ANSI_RED+"1.2 Second Task"+ANSI_RESET); ///////////////// 1_2 //////////////////
        /*Следующая задача — найти минимальную и максимальную трату за день.
                Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/

        int maxPayment = Integer.MIN_VALUE, minPayment = Integer.MAX_VALUE;
        for (int payment : payments) {
            maxPayment = (maxPayment<payment)?payment:maxPayment;
            minPayment = (minPayment>payment)? payment:minPayment;
        }
        System.out.println("Минимальная сумма трат за день составляет "+minPayment+" рублей. " +
                "Максимальная сумма трат за день составляет "+maxPayment+" рублей");

        System.out.println(ANSI_RED+"1.3 Third Task"+ANSI_RESET); ///////////////// 1_3 //////////////////
        /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
         Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).*/
        totalPayments=0;
        for (int payment : payments) {
            totalPayments+=payment;
        }
        double averagePayment = (double)totalPayments / payments.length;
        System.out.printf("Средняя сумма трат за месяц составила %1$,.2f рублей\n",averagePayment);

        System.out.println(ANSI_RED+"1.4 Fourth Task"+ANSI_RESET); ///////////////// 1_4 //////////////////

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
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
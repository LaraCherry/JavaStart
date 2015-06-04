package HomeWork;

import java.util.Scanner;

/**
 * Created by lelyi4ka on 02.06.15.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива");
        try {
            int n = in.nextInt();


            int[] arrN = new int[n];

            for (int i = 0; i < n; i++) {
                arrN[i] = i; // заполняем массив числами от 0 до n
            }

            System.out.println("Исходный массив чисел: ");
            for (int element : arrN) {
                System.out.println(element);
            }

            int k = arrN[n-1];
            arrN[n-1] = arrN[0];
            arrN[0] = k;
            System.out.println("Итоговый массив чисел: ");
            for (int element : arrN) {
                System.out.println(element);
            }

        }catch (Exception e){
            System.out.println("неправильный ввод");
        }

    }
}

package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lelyi4ka on 02.06.15.
 */
public class Task51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива ");

        int[] arr;

        try {
            int n = in.nextInt();
            arr = new int[n];

            System.out.println("Заполните массив из " + n + " элементов");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("введите " + i + " элемент массива - ");
                arr[i] = in.nextInt();
            }

        } catch (Exception e){
            System.out.println("неправильный ввод");
            return;
        }

        ///////////////////////////////////////////////////////////////

        System.out.println("Получился массив:");
        for (int element : arr) {
            System.out.println(element);
        }

        System.out.println("Переворачиваем введенный Вами массив:");

        int tmp;
        int middle = arr.length/2;
        for (int i = 0; i < middle; i++) {
            tmp = arr[i];
            int invInd = arr.length - 1 - i;
            arr[i] = arr[invInd];
            arr[invInd] = tmp;
        }

        for (int element : arr) {
            System.out.println(element);
        }

    }
}

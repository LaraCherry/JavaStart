package HomeWork;

import java.util.Scanner;

/**
 * Created by lelyi4ka on 02.06.15.
 */
public class Task52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива ");

        try {
            int n = in.nextInt();
            int[] arr = new int[n];

            System.out.println("Заполните массив из " + n + " элементов");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("введите " + i + " элемент массива - ");
                arr[i] = in.nextInt();
            }

            System.out.println("Получился массив:");
            for (int element : arr) {
                System.out.println(element);
            }

            System.out.println("Введите индекс необходимого Вам элемента массива:");
            int i = in.nextInt();
            System.out.println("Выбранный элемент массива равен: ");
            System.out.println(arr[i]);

        } catch (Exception e){
            System.out.println("неправильный ввод");
        }
    }
}

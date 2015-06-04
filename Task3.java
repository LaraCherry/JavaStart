package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lelyi4ka on 02.06.15.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Заполните массив из 10ти элементов");
            for (int i = 0; i < arr.length; i++) {

                System.out.println("введите " + i + " элемент массива - ");
                arr[i] = in.nextInt();
            }                                            //заполняем массив с клавиатуры

            System.out.println("Вы ввели массив чисел:");
            for (int element : arr) {
                System.out.println(element);
            }                                            //выводим на экран введенный массив

            System.out.println("Разделим этот массив пополам :)");

            int[] arr1 = Arrays.copyOf(arr, 5);          //создаем новый массив для первой половинки исходного
            Arrays.sort(arr1);                           //сортируем первую половину массива
            System.out.println("Первая половина:");
            for (int element : arr1){
                System.out.println(element);
            }

            int[] arr2 = Arrays.copyOfRange(arr, 5, 10);//создаем новый массив для второй половинки исходного
            Arrays.sort(arr2);                          //сортируем вторую половину массива
            System.out.println("Вторая половина:");
            for (int element : arr2) {
                System.out.println(element);
            }


        } catch (Exception e){
            System.out.println("неправильный ввод");     //вывод на экран в случае ввода, например, буквы
        }
    }
}

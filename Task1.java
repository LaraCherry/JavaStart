package HomeWork;

import java.util.*;
//iexcept - это skype Александра
/**
 * Created by lelyi4ka on 02.06.15.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Заполните массив из 10ти элементов");
            for (int i = 0; i < arr.length; i++) {
                //i++;
                System.out.println("введите " + i + " элемент массива - ");
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Итоговый ряд чисел:");
            for (int element : arr) {
                System.out.println(element);
            }

        } catch (Exception e){
            System.out.println("неправильный ввод");
        }
    }
}

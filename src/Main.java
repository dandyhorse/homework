import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int size = input.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Введите числа массива");
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }
        selection(arr1);
        revers2(arr1);

    }


    public static void selection(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void revers(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void revers2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

}


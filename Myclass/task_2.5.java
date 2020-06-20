/*Задать одномерный массив и найти в нём минимальный и максимальный элементы(без помощи интернета).*/

public class Myclass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 43, 24, 15};
        int min = arr[0];
        int max = arr[1];
        for (int i = 0; i <5; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
    }
}



/*Задать целочисленный массив, состоящий из элементов 0 и1. Например: [1,1,0,0,1,0,1,1,0,0].
C помощью цикла и условия заменить 0 на 1,1 на 0.*/

import java.util.Arrays;

public class Myclass {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
        }
            System.out.print(Arrays.toString(arr));

        }
    }

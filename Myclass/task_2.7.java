/*Написать метод, которому на вход подаётся одномерный массив и число n (может
быть положительным или отрицательным), при этом метод должен сместить все элементы
массива на n позиций.Нельзя пользоваться вспомагательными массивами*/

public class Myclass {
    public static void main(String[] args) {
        int nums= checkBalance(new int[]{9,18,60,333,3},-3);
System.out.println(nums);
     }

    private static int checkBalance(int[] array, int n) {
        boolean Chislo;
        if (n < 0) {
            Chislo = true;
        } else {
            Chislo = false;
        }
        n %= array.length;
        int last = array.length - 1;
        for (int i = 0; i < n; i++) {
            array[last] = array[0];
            for (int j = 0; j < last; j++) {
                if (Chislo) array[j] = array[j + 1];
                else array[j - 1] = array[last - j - 1];
            }
            if (Chislo)
                array[last] = n;
            else array[0] =n;
        }
        return last;
    }
}

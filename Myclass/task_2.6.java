/*Написать метод, в который передаётся не пустой одномерный целочисленный массив, метод должен
вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance ([1,1,1 || 2,1]) -> true, checkBalance([2,1,1,2,1])-> false,
checkBalance([10||10]) -> true, граница показана символом ||, эти символы в массив не входят*/

public class Myclass {
    public static void main(String[] args){
        boolean nums = checkBalance(new int[]{1,1,1});
        System.out.println(nums);
    }

    private static boolean checkBalance(int[] array, int[] array1) {
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += array[j];
                if (array[i] > array[j]) array[j] = array[i];
            }
            if (leftSum == rightSum)
                return true;
        }
        return false;
    }
}



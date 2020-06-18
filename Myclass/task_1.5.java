/*Написать метод, которому в качестве параметра передаётся целое число, метод должен
напечатать в консоль положительное число передали или отрицательное.(Замечание:
ноль считаем положительным числом*/

public class Myclass {
    public static void main(String[] args) {
       int val=getChislo(7);
        System.out.println(val);
    }

    private static int getChislo(int a) {
        if (a < 0) System.out.println("Число отрицательное ");
        if (a > 0) System.out.println("Число положительное ");
        return a;
    }

}

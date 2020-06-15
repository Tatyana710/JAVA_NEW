/*Написать метод, принимающий на вход два числа, и проверяющий, что сумма лежит в пределах от 10 до 20 (включительно), если до - вернкть
true, в противном случае  - false;
public class Myclass {
    public static void main(String[] args) {
        boolean Sum=getSum(25,7);
        System.out.println(Sum);
    }

    private static boolean getSum(int a, int b) {
        if ((a + b) > 10 && (a + b) <= 20)
            return true;
        else {
            return false;
        }

    }
}

/*Написать метод, которому в качестве параметра передаётся целое число, метод должен вернуть
true, если число отрицательное */

public class Myclass {
    public static void main(String[] args) {
    boolean bool=Chislo(6);
    System.out.println(bool);
    }

    private static boolean Chislo(int a) {
       if(a<0) return true;
       else
           return false;

    }
}

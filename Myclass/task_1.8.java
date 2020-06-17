/*Написать метод, который определяет, является ли год високосным? И выводит
сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
при этом каждый 400-й год - високосный*/

import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int god=scan.nextInt();
        if (god % 100 == 0 && god % 400 == 0)
            System.out.println("Год не високосный");

        else if (god %100!= 0 && god % 4 == 0)
            System.out.println("Год високосный");

         }
}

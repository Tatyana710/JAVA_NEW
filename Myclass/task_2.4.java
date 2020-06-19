/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов олинаковое)
* и с помощью цикла (-ов) заполнить его диагональные элементы (без помощи интернета).*/

public class Myclass {
    public static void main(String[] args) {
        int nums=1;
        int[][] arr = new int[4][5];
         for (int i=0; i < 4;i++) {
             for(int j=0;j<5;j++) {
                 arr[i][j]=nums;
                 nums++;
         System.out.print(arr[i][j]+" ");
             }
             System.out.println();
        }
    }
}

package Egorov_1602;

import java.util.Arrays;
/*
* Ну и для особо отличившихся. Написать метод который
генерирует двумерный массив длиной N и высотой H
Далее заполняет получившийся массив числами от 1 до W по спирали.
Например массив [ ][ ][ ][ ]
                        [ ][ ][ ][ ]
                        [ ][ ][ ][ ]
имеет N == 4 and H == 3 и вид [ 1 ][ 2 ][ 3 ][ 4 ]
                                             [10][11][12 ][ 5 ]
                                             [ 9 ][ 8 ][ 7 ][ 6 ]

*/

public class Task4 {


    public int[][] spiral(int rows, int cols) {

        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;
        int rmin = 0;
        int cmin = 0;
        int rmax = rows - 1;
        int cmax = cols - 1;
        System.out.println("Спираль следующего размера. ⬇");
        System.out.println("-----" + rows + " x " + cols + "-----");
        while (num <= max) {
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
    }

    public void spiralPrint(int [][] arr)  {
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }

}

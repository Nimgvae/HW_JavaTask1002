package Egorov_1602;

public class Start {
    public static void main(String[] args) {
        //1
        int[] arr = {5, 3, 5, 6, 6, 3, 4};
        Task1 task1 = new Task1(arr);
        //2
        int[] arrNum = {1, 0, 2, 8, 6, 5, 4, 7};
        Task2 task2 = new Task2(arrNum);
        //3
        int[] arrDivide = new int[]{128, 226, 34, 47, 5};
        Task3 task3 = new Task3(arrDivide);
        //4
        Task4 task4 = new Task4();
        task4.spiralPrint(task4.spiral(10,10)); // количество строк и столбцов задаем по
    }



}

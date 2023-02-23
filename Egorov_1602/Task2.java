package Egorov_1602;

public class Task2 {

    /*
     Дан массив чисел, в котором есть все числа от 0 до N . Все эти числа в единственном экземпляре.
     Расположены в разнобой. Одно число в этом массиве пропущено ( Например {1 0 2 8 6 5 4 7} - это 3 ) .
     Найти пропущенное число
    */
    public void getMissingNum(int[] arr) {

        int result = 0;
        for (int a : arr)
            result ^= a;
        for (int i = 0; i < arr.length + 1; i++) {
            result ^= i;
        }
        System.out.println("2.Это число/цифра пропущены в последовательности: "+ result);
    }
    public Task2(int[] arr){
        getMissingNum(arr);
    }
}

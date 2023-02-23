package Egorov_1602;
/*
    1. Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число
*/

public class Task1 {

    public void getNumber(int[] nums) {

        int res = 0;
        for (int a : nums) {
            res = res ^ a;
        }
        System.out.println("1.Данный элемент не имеет пары: " + res);
    }
    public Task1(int[] nums){
        getNumber(nums);
    }
}

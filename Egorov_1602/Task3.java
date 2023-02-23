package Egorov_1602;
/*
   Дан массив чисел. Найти число состоящее из собственных делителей.
   Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0. Вот такие числа надо найти.
*/

public class Task3 {

    public void getnumSelf(int[] arr) {
        int[] arrResult = new int[arr.length];
        int k;
        boolean result = false;
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            String s = String.valueOf(arr[i]);
            char[] charrArr = s.toCharArray();
            for (int j = 0; j < charrArr.length; j++) {
                k = Character.digit(charrArr[j], 10);
                if (arr[i] % k == 0) {
                    result=true;
                    continue;
                }
                else{
                    result = false;
                    break;
                }
            }
            if (result) {
                arrResult[pos]=arr[i];
                pos++;
                result = false;
            }
        }
        System.out.println("3.Задача.⬇");
        for (int a: arrResult) {
            if (a==0){
                continue;
            }
            System.out.println("Данный элемент массива отвечает заданным условиям: " + a);
        }
    }
    public Task3 ( int[] arr){
        getnumSelf(arr);
    }
}

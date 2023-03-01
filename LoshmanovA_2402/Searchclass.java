package LoshmanovA_2402;

import java.util.Arrays;

public class Searchclass {

    public Searchclass(int[] num, int target){
        findIndex(num, target);
    }

    public void findIndex(int[] arr, int target){
        int index1 =0;
        int index2= 0;
        boolean result = false;

        for(int i=0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    index1=i;
                    index2=j;
                    result=true;
                    break;
                }
            }
        }
        if(result){
            System.out.println("Совпадение было найдено: "+"["+index1+","+index2+"]");
        }
        else System.out.println("Совпадение не было найдено.☠");
    }
    public void operationXXX(int num){
        num++;
        int conv = String.valueOf(Math.abs(num)).length();
        int[] resultarr= new int[conv];
        for(int i=conv-1;i>-1;i--){
            resultarr[i]=num%10;
            num = num / 10;
        }
        System.out.println(Arrays.toString(resultarr));
    }

}

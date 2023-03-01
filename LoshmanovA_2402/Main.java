package LoshmanovA_2402;

public class Main {
    public static void main(String[] args) {
        //Task1
        //Вроде как тут бинарный должен быть, но я решил через фор сделать.
        System.out.println("Task1");
        int[] arr = new int[]{1,3,4,5,6,7,8,9,10};
        int focus = 13;
        Searchclass search1 = new Searchclass(arr, focus);
        //Task2
        System.out.println();
        System.out.println("Task2");
        int test = 123;
        search1.operationXXX(test);

    }
}

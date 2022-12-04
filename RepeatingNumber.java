/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Arrays;

public class RepeatingNumber {
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){

        int [] list = {1, 1, 2, 3, 5, 5, 7, 8, 9, 8, 10, 10, 9, 12, 14, 2, 12};

        System.out.println("The array is: " + Arrays.toString(list));

        int duplicate [] = new int[list.length];

        int startIndex=0;

        for(int i=0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (i != j && list[i] == list[j]){
                    if (list[i] % 2 == 0){
                        if (!isFind(duplicate,list[i])){
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("Repeating Even Numbers: ");

        for (int value : duplicate){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
    }
}
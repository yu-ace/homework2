package d24;

import javax.swing.*;

public class a15_2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,8,9,1,2,67,0,8,9,0,0,0,0,0,0,0,1,23,85,45};
        for (int i = 0; i < a.length; i++) {
            if(indexOf(a,a[i])==-1){
                System.out.println(a[i]);
            }
        }
    }

    public static int indexOf(int[] arr,int num){
        int index = -1;
        for(int i = 0;i <arr.length;i++){
            if(arr[i] == num){
                index = i;
            }
        }
        return index;
    }
}

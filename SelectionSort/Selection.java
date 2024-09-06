package org.nagul.Sorting;
import java.util.*;
public class Selection {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int s,int e){
        int max=s;
        for (int i = s; i <=e; i++) {
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
    static void swap(int[] arr,int s,int l){
        int temp=arr[s];
        arr[s]=arr[l];
        arr[l]=temp;
    }
}

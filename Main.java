import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Enter a number : ");
        int target=in.nextInt();
        int index=binarySearch(arr,target);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid;

        while (start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        return -1;
    }

}

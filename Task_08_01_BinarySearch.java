package Second_Assignment;

public class Task_08_01_BinarySearch {
/*
   public static int binarySearch(int [] arr,int value){
        int start = 0;              // int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(value == arr[mid]) {
                return mid;
            }
                else if(value < arr[mid]){
                    end = mid-1;
                }
                else if(value > arr[mid]){
                    start = mid + 1;
            }

        }
        return -1;
    }*/


    public static int search_With_Binary(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                end = mid - 1;
            } else if (value > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {

        int[] arr = {26, 36, 49, 59, 69, 79, 89};
        System.out.println(search_With_Binary(arr, 69));

    }


}








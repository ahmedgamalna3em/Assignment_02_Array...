package Second_Assignment;


public class BubbleSort {
    /*
    static void getIndexforMin(int[]arr){
        int min = arr[0];
        int index_min = 0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index_min = i;
            }
        }
        System.out.println("The min : "+min+" , The index is : "+index_min);
    }*/

    static int getIndexforMin(int[] arr) {
        int min = arr[0];
        int index_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index_min = i;
            }
        }
        return index_min;
    }

    static void bubbleSort(int[] arr) {
        int index_min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[index_min] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }


    }

    public static void main(String[] args) {

        int[] array = {10, 20, 5, 0, 83, 81, 6, 3, 7, 1, 8, 9, 6, 3, 4, 7};

        bubbleSort(array);


    }


}

package Second_Assignment;

public class TestBubbleSort {

    /*
    public static void BubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i]<arr[i+1]){
                    if(arr[i+1]<arr[i+2]){
                        if(arr[i+2]<arr[i+3]){
                            if
                            break;
                        }
                    }
                }
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
*/

    /*
    public static void printArray(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
    }*/

    public static int getIndexFormin(int []arr,int start){
        int min = arr[start];
        int min_index = start;
        for(int i =start;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void getSelectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min_index = getIndexFormin(arr,i);
            int temp = arr[min_index];
            arr[min_index] = arr[i] ;
            arr[i] = temp;

            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //             0,01,02,3,04,05,06,07,08,09,10,1,12,13,14
        //System.out.println(array.length);
        getSelectionSort(array);
        //BubbleSort(array);

    }

}

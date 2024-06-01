package Second_Assignment;

public class Task09_SelectionSort {
    /*we dont take*/
    /*
    static int getIndex_Min(int []arr){
        int min = arr[0];
        int index_min = 0;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index_min = i;
            }

        }
        return index_min;
    }*/

    static int get_another_Index_MinValue(int[]arr,int start){
    int min = arr[start];
    int min_index = start;
    for(int i=start ;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
            min_index = i;
        }
    }
    return min_index;
    }

    static void selectionSort(int[]arr){
      for(int i =0;i<arr.length;i++){
          int min_index = get_another_Index_MinValue(arr,i);
          int temp = arr[i];
          arr[i] = arr[min_index];
          arr[min_index] = temp;

      }
    }


    public static void main(String[]args){
        int []array = {10,5,6,9,7,2,3,1,83};
       // System.out.println(getIndex_Min(array));
        selectionSort(array);

        for(int i=0; i < array.length;i++){
            System.out.print(array[i]+" , ");
        }

    }

}

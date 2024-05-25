package Second_Assignment;

public class Task_04_Min_Number_in_Array {
    static int getMin(int []arr){
        int min =arr[0];
        for(int i =1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;


    }
    public static void main(String []args){
        int [] arr = {10,220,30,5,40,8,10,2,1,3,7,9};
        int min;
        min = getMin(arr);
        System.out.println(min);
    }
}

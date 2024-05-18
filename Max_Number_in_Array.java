package Second_Assignment;

public class Max_Number_in_Array {
    static int getMAx(int []arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[]args){
        int [] arr = {15,2,25,6,20,35,5,1962,201354,25004,2152363} ;
        System.out.println(getMAx(arr));

    }

}

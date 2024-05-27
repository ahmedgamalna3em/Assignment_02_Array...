
package Second_Assignment;

public class Task_02_Num_OF_Elements {
    static int get_No_of_Element(int []arr){
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            sum += arr[i];
            counter ++;
        }
        return counter;

}

    public static void main(String []args){
        int [] arr = {10,50,30,20,17,88,36,15,11};
        System.out.println(get_No_of_Element(arr));
    }
}

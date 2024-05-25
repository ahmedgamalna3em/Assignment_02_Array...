package Second_Assignment;

public class Task_06_CountNumberRepated {
    static int countNumber(int []arr,int num){

        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] arr = {10,2,3,5,2,3,6,4,8,2,9,5,2,3,42,2,7};
        int countRepated = countNumber(arr,42);
        System.out.println(countRepated);
    }
}

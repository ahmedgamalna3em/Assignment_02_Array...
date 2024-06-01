package Second_Assignment;

public class Task_05_CalculateEven_Quantaty {

    static void calculate_Array(int[] arr) {
        int counter = 0;
        int sum_Even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                counter++;
                sum_Even += arr[i];
            }
        }
        System.out.println("The Counter For The Even Element = " + counter);
        System.out.println("The Sumtion For The Even Elemnt = " + sum_Even);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 35, 6, 4, 7, 8, 9, 6, 11, 10, 15, 3, 5, 58};
        calculate_Array(arr);

    }
}

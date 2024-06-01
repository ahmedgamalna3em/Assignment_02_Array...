package Second_Assignment;


public class Task_01_SummationForArrayByFunction {
    static int getSummition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int add = 0;
        int[] arr = {15, 2, 3, 6, 4, 8, 9, 10, 20};
        add = getSummition(arr);
        System.out.print("The Sum Of Array Is = ");
        System.out.println(add);

    }

}


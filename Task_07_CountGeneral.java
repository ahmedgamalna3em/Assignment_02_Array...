package Second_Assignment;

public class Task_07_CountGeneral {

    static int countNumber(int[] arr, int num) {

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                counter++;
            }
        }
        return counter;
    }

    static void countGeneral(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The index " + i + " Have Value : \"" + arr[i] + "\" and it's Repated ===> " + countNumber(arr, arr[i]));
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 2, 3, 6, 4, 8, 2, 9, 5, 2, 3, 42, 2, 7};
        countGeneral(arr);
    }
}

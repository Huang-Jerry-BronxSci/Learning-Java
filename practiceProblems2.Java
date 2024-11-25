public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int[] reversedArr = reverseArray(arr); 
        
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j] = arr[i]; 
            j = j + 1;
        }
        
        return reversed;
    }
}

public class Main {
    static int countOccurences (int[] arr, int n) {
        int count = 0;
        int n = 2;
        for (int num : arr) {
            if (num == n){
            count = count + 1;
        }
    }
    return count;
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int countOccurences(int[] arr, int n)
        System.out.println("Number " + n + " appears " + countOccurrences(arr, n) + " times.");
        }
    }
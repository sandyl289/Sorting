import java.util.Arrays;

/**Sort a list of numbers using .sort()
 * 
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {5,3,10,7,2}; //array to be sorted
        System.out.println("Array to be sorted: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " +Arrays.toString(arr));
    }
}

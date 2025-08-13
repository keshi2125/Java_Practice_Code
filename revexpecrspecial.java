//Write a program to reverse a string except the special characters
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Skip special characters at left
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
            }
            // Skip special characters at right
            else if (!Character.isLetterOrDigit(arr[right])) {
                right--;
            }
            // Swap normal characters
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Convert array back to string
        System.out.println(new String(arr));
    }
}

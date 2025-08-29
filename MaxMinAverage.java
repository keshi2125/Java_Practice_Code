public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
    Scanner scanner = new Scanner(System.in); // Creating a Scanner object for input

    int num = 0;
    int count = 0;
    long sum = 0; // Using long to avoid potential overflow for large sums
    int minVal = Integer.MAX_VALUE; // Initialize minVal to the largest possible integer value
    int maxVal = Integer.MIN_VALUE; // Initialize maxVal to the smallest possible integer value

    while (true) { // Loop indefinitely until -1 is entered
      try {
        num = scanner.nextInt(); // Read the next integer from the console

        if (num == -1) {
          break; // Exit the loop if the input is -1
        } else {
          sum += num; // Add the current number to the sum
          count++;    // Increment the count of valid numbers

          if (num < minVal) {
            minVal = num; // Update minVal if the current number is smaller
          }
          if (num > maxVal) {
            maxVal = num; // Update maxVal if the current number is larger
          }
        }
      } catch (InputMismatchException e) { // Catch exception if input is not an integer
        System.out.println("Invalid input. Please enter an integer or -1 to quit.");
        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
      }
    }

    if (count > 0) { // Calculate average only if numbers were entered
      double average = (double) sum / count; // Cast sum to double for accurate division
      System.out.println("Min = " + minVal);
      System.out.println("Max = " + maxVal);
      System.out.println("Sum = " + sum);
      System.out.printf("Average = %.6f%n", average); // Print average formatted to 6 decimal places
    } else {
      System.out.println("No numbers were entered.");
    }

    scanner.close(); // Close the scanner to release resources
  }
}


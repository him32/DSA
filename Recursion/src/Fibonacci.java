public class Fibonacci {
    public static int findFibonacci(int n)
    {
        // Base Cases
        if (n <= 1)
        {
            return n;
        }
        // Recursive Step
        else
        {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int position = 7;
        System.out.println("The Fibonacci number at position " + position + " is: " + findFibonacci(position)); // Output: 13
    }
}

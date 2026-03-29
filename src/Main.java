public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  // Task 1
  System.out.println(sumOfSquares(4));

  // Task 2
  int[] arr = {1, 2, 3, 4};
  System.out.println(sumArray(arr, arr.length));

  // Task 3
  System.out.println(powerSum(4, 3));

  // Task 4
  System.out.println("\nTask 4: Reverse input");
  int n = sc.nextInt();
  reversePrint(n, sc);

  sc.close();
}

// 1 Time Complexity: O(n)

static int sumOfSquares(int n) {
  if (n == 0) return 0; // base case
  return n * n + sumOfSquares(n - 1);
}

// 2 Time Complexity: O(n)

static int sumArray(int[] arr, int n) {
  if (n == 0) return 0;
  return arr[n - 1] + sumArray(arr, n - 1);
}

// 3 Time Complexity: O(n)

static int powerSum(int b, int n) {
  if (n == 0) return 1; // b^0 = 1
  return (int)Math.pow(b, n) + powerSum(b, n - 1);
}

// 4 Time Complexity: O(n)

static void reversePrint(int n, Scanner sc) {
  if (n == 0) return; // base case

  int x = sc.nextInt(); // read number
  reversePrint(n - 1, sc); // recursive call
  System.out.print(x + " "); // print after recursion
}

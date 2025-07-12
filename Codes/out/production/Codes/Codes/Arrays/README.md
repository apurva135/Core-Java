✅ Java Arrays – Complete Conceptual Theory
📌 1. What is an Array?
An array in Java is:

A container object that holds a fixed number of values of a single data type.

Indexed, meaning each element is accessed via its index (starting at 0).

Stored contiguously in memory.

Example:
java
Copy
Edit
int[] arr = new int[3];  // [0, 0, 0]
📌 2. Why Use Arrays?
To store multiple related variables without creating many separate ones.

Efficient for indexing and iteration.

Useful in sorting, searching, and algorithmic problems.

📌 3. Array Types in Java
✅ A. One-Dimensional Array
java
Copy
Edit
int[] arr = {1, 2, 3, 4};
✅ B. Multidimensional Arrays (Matrix / Grid)
A 2D array is an array of arrays.

java
Copy
Edit
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
Access via matrix[row][column]

Each row has equal number of columns (like a matrix)

✅ C. Jagged Arrays (Irregular 2D arrays)
In Java, 2D arrays don’t need to have equal-sized rows.

java
Copy
Edit
int[][] jagged = new int[3][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3};
jagged[2] = new int[]{4, 5, 6};
📌 4. Array Declaration
java
Copy
Edit
int[] a;      // Preferred
int a[];      // Also valid
📌 5. Array Initialization
Static Initialization:
java
Copy
Edit
int[] arr = {10, 20, 30};
Dynamic Initialization:
java
Copy
Edit
int[] arr = new int[5];  // All elements default to 0
📌 6. Default Values Based on Type
Type	Default Value
byte	0
short	0
int	0
long	0L
float	0.0f
double	0.0
char	'\u0000'
boolean	false
Object	null

📌 7. Accessing Array Elements
java
Copy
Edit
int[] arr = {1, 2, 3};
System.out.println(arr[0]);  // 1
arr[1] = 20;                 // Change element at index 1
📌 8. Array Length
java
Copy
Edit
System.out.println(arr.length); // Not a method, it’s a property
📌 9. Array Iteration
For Loop:
java
Copy
Edit
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
Enhanced For-Each:
java
Copy
Edit
for (int val : arr) {
    System.out.println(val);
}
📌 10. Memory Model of Arrays
Arrays are reference types (even for primitive arrays).

Stored in heap memory.

The reference variable (like arr) holds the memory address of the actual array.

📌 11. Multidimensional Arrays – Theory
A 2D array in Java is actually an array of arrays.

Internally, int[][] matrix = new int[3][4] allocates:

One array of 3 references

Each pointing to a new array of 4 integers

📌 12. Jagged Arrays – Concept
Unlike fixed-dimension 2D arrays in other languages (like C/C++), Java allows each "row" in a 2D array to be of different length.

This is called a jagged array (irregular matrix).

java
Copy
Edit
int[][] jag = new int[2][];
jag[0] = new int[2];  // row 0 has 2 columns
jag[1] = new int[4];  // row 1 has 4 columns    
 
13. Common Array Operations in Java — A to Z
✅ A. Printing an Array
java
Copy
Edit
int[] arr = {1, 2, 3};

System.out.println(Arrays.toString(arr)); // [1, 2, 3]
For 2D arrays:

java
Copy
Edit
int[][] matrix = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(matrix)); // [[1, 2], [3, 4]]
✅ B. Sorting an Array
java
Copy
Edit
int[] arr = {5, 1, 3};
Arrays.sort(arr);  // [1, 3, 5]
For String[] or char[], same method applies:

java
Copy
Edit
String[] names = {"John", "Apu", "Neha"};
Arrays.sort(names); // Alphabetical
✅ C. Reversing an Array (Manually)
java
Copy
Edit
int[] arr = {1, 2, 3};
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
Java has no built-in Arrays.reverse() — you write your own or use Collections.reverse() with List.

✅ D. Copying Arrays
java
Copy
Edit
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, original.length);  // Same size
int[] bigger = Arrays.copyOf(original, 5);  // [1, 2, 3, 0, 0]
Copy a range:

java
Copy
Edit
int[] slice = Arrays.copyOfRange(original, 1, 3);  // [2, 3]
✅ E. Filling an Array
java
Copy
Edit
int[] arr = new int[5];
Arrays.fill(arr, 9);  // [9, 9, 9, 9, 9]
Fill a range:

java
Copy
Edit
Arrays.fill(arr, 1, 3, 7);  // fill index 1 to 2 with 7
✅ F. Searching in an Array (Binary Search)
⚠️ Array must be sorted first

java
Copy
Edit
int[] arr = {1, 3, 5, 7};
int idx = Arrays.binarySearch(arr, 5); // returns 2
If element not found, it returns -(insertion_point + 1)

✅ G. Comparing Arrays
java
Copy
Edit
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

System.out.println(Arrays.equals(a, b));        // true ✅
System.out.println(Arrays.equals(a, new int[]{3, 2, 1})); // false
For 2D arrays:

java
Copy
Edit
Arrays.deepEquals(matrix1, matrix2);
✅ H. Checking for Duplicate Elements
java
Copy
Edit
Set<Integer> set = new HashSet<>();
for (int num : arr) {
    if (!set.add(num)) {
        System.out.println("Duplicate found: " + num);
    }
}
✅ I. Finding Max/Min Elements
java
Copy
Edit
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

for (int num : arr) {
    if (num > max) max = num;
    if (num < min) min = num;
}
✅ J. Converting Between Array and List
Array to List:

java
Copy
Edit
String[] arr = {"a", "b", "c"};
List<String> list = Arrays.asList(arr); // fixed-size list
List to Array:

java
Copy
Edit
List<String> list = new ArrayList<>(List.of("a", "b"));
String[] arr = list.toArray(new String[0]);
✅ K. Shuffling an Array (Random Order)
java
Copy
Edit
List<Integer> list = Arrays.asList(1, 2, 3, 4);
Collections.shuffle(list);
✅ L. Removing an Element (Manual)
No direct way in array — need to shift manually or use ArrayList.

java
Copy
Edit
int[] arr = {1, 2, 3, 4};
int removeIndex = 2; // remove 3

for (int i = removeIndex; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[arr.length - 1] = 0; // optional
✅ M. Merging Two Arrays
java
Copy
Edit
int[] a = {1, 2};
int[] b = {3, 4};
int[] merged = new int[a.length + b.length];

System.arraycopy(a, 0, merged, 0, a.length);
System.arraycopy(b, 0, merged, a.length, b.length);
✅ N. Finding Frequency of Elements
java
Copy
Edit
int[] freq = new int[256];  // For ASCII chars or digits
for (int ch : arr) {
    freq[ch]++;
}
✅ O. Rotating an Array (Left or Right)
java
Copy
Edit
public static void rotateRight(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
}
✅ Summary: Common Array Operations Table
Operation	Method / Code
Print	Arrays.toString() / deepToString()
Sort	Arrays.sort()
Reverse	Manual swap loop
Copy	Arrays.copyOf(), copyOfRange()
Fill	Arrays.fill()
Search	Arrays.binarySearch()
Compare	Arrays.equals() / deepEquals()
Frequency Count	Use int[256] or Map
Rotate	Reverse-based or temp array
Remove	Manual shifting
Merge	System.arraycopy()
Shuffle	Collections.shuffle(Arrays.asList())
📌 14. Cloning Arrays
java
Copy
Edit
int[] original = {1, 2, 3};
int[] clone = original.clone();
📌 15. Limitations of Arrays
Limitation	Description
Fixed Size	Cannot grow or shrink dynamically
No direct insertion/removal methods	Unlike ArrayList
Type-Safe Only	Cannot mix types in the same array

📌 16. When to Use Arrays vs ArrayList
Feature	Array	ArrayList
Size	Fixed	Dynamic
Primitive Types	✅ Yes	❌ No (use wrappers)
Performance	Faster	Slightly slower
Flexibility	Less	More (add/remove/resize)

📌 17. Important Interview Use-Cases
Reversing an array

Rotating an array

Kadane’s Algorithm (max subarray)

Searching in rotated sorted array

Frequency counting (int[256] or int[26])

Sliding window technique

2D matrix operations (transpose, rotate, spiral)

📌 18. Best Practices
Always check bounds: i >= 0 && i < arr.length

Use enhanced for-loop when you don’t need the index

For dynamic size, use ArrayList instead of array

Use Arrays utility class to avoid manual looping

✅ Summary
Arrays in Java are:

Powerful but fixed-size containers

Useful for raw data processing, algorithms, and matrices

Should be mastered before learning collections

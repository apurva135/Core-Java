# ✅ Java String – Complete Deep-Dive

✅ 1. **What is a String in Java?**  
In Java, String is a class in the java.lang package that represents a sequence of characters. It is used to store and manipulate text. Strings in Java are immutable, meaning once created, their values cannot be changed. Internally, Java String objects are backed by a char array (until Java 8) or byte array (in Java 9+ with compact strings). String is a final class, so it cannot be extended. You can create strings using literals or with the new keyword.

```java
String s1 = "hello";                 // String literal
String s2 = new String("hello");    // String object
```

✅ 2. **Why is String immutable in Java?**  
Java made String immutable for security, thread safety, and performance reasons. For example, String is widely used in sensitive operations like file paths, class loading, and URLs — if mutable, malicious code could alter them. Also, it allows String Pooling (reusing objects) to save memory. Because strings are immutable, they can be shared between threads safely without synchronization. Any modification creates a new String object, ensuring data integrity.

✅ 3. **What is the String Constant Pool (SCP)?**  
The String Constant Pool is a special memory area inside the JVM where string literals are stored. If two strings have the same value and are declared as literals, they share the same memory location from the pool. This saves memory and improves performance. You can also explicitly put a string in the pool using the intern() method.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // true — both point to SCP
```

✅ 4. **How does String.intern() work?**  
The intern() method checks if the string already exists in the SCP:

- If yes, it returns the reference from the pool.  
- If not, it adds the string to the pool and returns its reference.  

This is useful for optimizing memory and ensuring that == comparisons return true when values are equal.

```java
String s1 = new String("hello");
String s2 = s1.intern(); // points to SCP
String s3 = "hello";
System.out.println(s2 == s3); // true
```

✅ 5. **What is the difference between new String("abc") and "abc"?**  
"abc" is a string literal, and it’s stored in the String Constant Pool (SCP).  
new String("abc") creates a new object in the heap, even if "abc" already exists in the SCP.  
This is why == will return false between a literal and a new String, even if the values are the same.

```java
String a = "abc";
String b = new String("abc");
System.out.println(a == b); // false
System.out.println(a.equals(b)); // true
```

✅ 6. **How is memory managed for String literals vs String objects?**  
String literals are stored in the String Constant Pool, which is part of the method area in memory.  
String objects created with new are stored in the heap memory.  
The JVM tries to optimize memory usage by interning strings (storing only one copy of each literal in the SCP).  
GC (Garbage Collector) can collect heap objects but not string literals from the pool (until Java 7/8).

✅ 7. **What is the output of this code?**  
```java
String a = "Java";
String b = new String("Java");
System.out.println(a == b); // false
```
Explanation:  
"Java" is a literal → stored in SCP.  
new String("Java") → creates a new object in heap.  
== checks for reference equality, not content.  
Therefore, the result is false even though the contents are the same.

✅ 8. **Why is the String class marked as final?**  
Marking String as final prevents other classes from inheriting it and modifying its behavior, which helps enforce immutability. Since strings are widely used in security-sensitive areas (e.g., database credentials, file paths), making them final prevents subclasses from overriding critical methods like hashCode() or equals(), ensuring consistent and secure behavior.

✅ 9. **How does Java handle null in string comparisons?**  
Using equals() on a null object causes a NullPointerException.  
Best practice: call equals() on a constant or known value, not on a potentially null variable.

```java
String s = null;
// s.equals("test"); ❌ NullPointerException
"test".equals(s);    // ✅ Safe, returns false
```

Use `Objects.equals(a, b)` to safely compare two strings where one might be null.

✅ 10. **How is Unicode supported in Java Strings?**  
Java uses UTF-16 encoding internally to store characters, so it natively supports Unicode. Each char in Java is 16-bit, so it can represent most common Unicode characters. For characters outside the Basic Multilingual Plane (like emojis), Java uses surrogate pairs.

```java
String unicodeStr = "\u0905"; // Hindi letter 'अ'
System.out.println(unicodeStr);
```

Java fully supports Unicode, making it powerful for internationalization (i18n).

✅ 11. **What is the difference between == and .equals() for Strings?**  
== checks if two references point to the same object in memory.  
.equals() checks if two strings have the same content.  
Always use .equals() for string comparison to avoid logic bugs.

```java
String a = new String("Java");
String b = "Java";
System.out.println(a == b);         // false
System.out.println(a.equals(b));    // true
```

✅ 12. **How does equalsIgnoreCase() work?**  
It compares two strings for equality, ignoring their case.  
Internally, it converts both strings to lowercase (or uppercase) and compares them.

```java
String a = "Hello";
String b = "hello";
System.out.println(a.equals(b));             // false
System.out.println(a.equalsIgnoreCase(b));   // true
```

✅ 13. **When should you override equals() and hashCode() in a class that uses Strings?**  
Override equals() and hashCode() when you use custom objects as keys in HashMap/HashSet.  
If your class contains a String field that defines equality (like username), you must override both methods.

```java
@Override
public boolean equals(Object o) {
   return this.name.equals(((User)o).name);
}

@Override
public int hashCode() {
   return name.hashCode();
}
```

✅ 14. **What is the output of this code?**  
```java
String s1 = "abc";
String s2 = "a" + "b" + "c";
System.out.println(s1 == s2); // true
```
All operands are string literals; the expression is resolved at compile-time to "abc".  
Both s1 and s2 refer to the same SCP object, hence == is true.

✅ 15. **What is the difference between String, StringBuilder, and StringBuffer?**

| Feature       | String | StringBuilder | StringBuffer |
|---------------|--------|----------------|----------------|
| Mutable       | ❌ No  | ✅ Yes         | ✅ Yes         |
| Thread-safe   | ✅ Yes (immutable) | ❌ No | ✅ Yes       |
| Performance   | Medium | ✅ Fast        | Slower        |

✅ 16. **Which is thread-safe: StringBuilder or StringBuffer?**  
StringBuffer is thread-safe because its methods are synchronized.  
StringBuilder is not thread-safe but faster in single-threaded scenarios.

✅ 17. **When should you use StringBuilder over String?**  
When you need to modify strings repeatedly, like in loops, concatenations, or appending.  
Using String in such cases creates many intermediate objects, which can degrade performance.  
StringBuilder avoids this by modifying the same object.

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10; i++) {
    sb.append(i);
}
```

✅ 18. **Why is StringBuilder faster than String in loops?**  
String is immutable — every modification creates a new object.  
StringBuilder avoids this by maintaining a mutable buffer, improving performance drastically.

✅ 19. **How does the substring() method work internally?**  
Until Java 7, substring() shared the original char array with the original string, using start & end indices.  
In Java 8+, substring() creates a new char array to avoid memory leaks.

```java
String s = "HelloWorld";
String sub = s.substring(0, 5); // "Hello"
```

✅ 20. **What does String.trim() do?**  
trim() removes leading and trailing whitespace characters (space, tab, newline).  
It does not remove internal spaces.

```java
String raw = "  hello world  ";
System.out.println(raw.trim()); // "hello world"
```

✅ 21. **How does split() work and what are edge cases?**  
The split() method splits a string based on a regex delimiter.  
Returns an array of substrings.  
Edge cases:

```java
String s = "a,b,,c";
System.out.println(Arrays.toString(s.split(","))); // [a, b, , c]
```

✅ 22. **What are the use-cases of replace() vs replaceAll()?**  
replace() replaces characters or substrings — no regex.  
replaceAll() uses a regex pattern for replacement.

```java
String str = "abc123";
System.out.println(str.replace("1", "X"));       // abcX23
System.out.println(str.replaceAll("\\d", "X"));  // abcXXX
```

✅ 23. **What is the difference between contains() and matches()?**  
contains() checks if a substring exists in the string.  
matches() checks if the entire string matches a regex pattern.

```java
String s = "Java Programming";
System.out.println(s.contains("Java"));       // true
System.out.println(s.matches("Java.*"));      // true
```

✅ 24. **How does the charAt() method behave with invalid indices?**  
charAt(int index) returns the character at the specified index.  
If index is negative or ≥ length of string, it throws StringIndexOutOfBoundsException.

✅ 25. **What does String.valueOf(null) return?**  
String.valueOf(null) returns the string "null" (not null object).  
But new String(null) throws a NullPointerException.

✅ 26. **Why should you avoid using + operator in loops with Strings?**  
+ creates a new String object every time (due to immutability).  
In a loop, it leads to O(n²) time and high memory usage.  
Use StringBuilder instead for efficient appending.

✅ 27. **How does String.concat() work under the hood?**  
concat() checks if either string is empty, and returns a new string.  
It’s equivalent to using +, but works only with strings.

✅ 28. **What changed in substring() implementation from Java 7 to 8?**  
Java 7: substring() shared the original char array, causing memory leaks if large string remained referenced.  
Java 8+: substring() creates a new char array, preventing memory leaks but using more memory for small substrings.

✅ 29. **What is the time complexity of string operations like length(), substring(), charAt()?**

| Operation     | Time Complexity         |
|---------------|--------------------------|
| length()      | O(1) – stored as a field |
| charAt(i)     | O(1) – direct access     |
| substring()   | O(n) in Java 8+          |
| equals()      | O(n)                     |

✅ 30. **How is String.hashCode() calculated, and why is it important?**  
hashCode() is calculated using:

```java
s[0]*31ⁿ⁻¹ + s[1]*31ⁿ⁻² + ... + s[n-1]
```

It’s fast and has a good distribution, used in HashMap, HashSet.  
Ensures that equal strings return the same hash code.

```java
String s = "Java";
System.out.println(s.hashCode());
```

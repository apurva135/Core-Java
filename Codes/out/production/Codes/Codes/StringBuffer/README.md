# 🧵 Java StringBuffer – Thread-Safe Mutable Strings

## 📌 What is StringBuffer?

`StringBuffer` is a **mutable sequence of characters** used for creating and modifying strings efficiently in a **thread-safe** manner.

- It is part of the `java.lang` package.
- Similar to `StringBuilder` but with **synchronized methods**.
- Ideal for use in **multi-threaded environments**.

---

## 🧠 Key Concepts

- **Thread Safety**: All public methods in `StringBuffer` are synchronized, making it safe for use in concurrent applications.
- **Performance**: Slightly slower than `StringBuilder` due to synchronization overhead.
- **Mutability**: Unlike `String`, it allows in-place modifications without creating new objects.
- **Legacy Class**: Introduced before `StringBuilder`, still used where thread safety is a must.

---

## 🧪 Example Usage

```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");              // Hello World
        sb.insert(5, ",");                // Hello, World
        sb.replace(0, 5, "Hi");           // Hi, World
        sb.delete(3, 4);                  // Hi World
        sb.reverse();                    // dlroW iH

        System.out.println(sb.toString());
    }
}
```

---

## 📊 String vs StringBuilder vs StringBuffer – Comparison Table

| **Feature**       | **String**                    | **StringBuilder**              | **StringBuffer**                         |
|-------------------|-------------------------------|--------------------------------|------------------------------------------|
| **Mutability**    | Immutable                     | Mutable                        | Mutable                                  |
| **Thread Safety** | Yes                           | No                             | Yes                                      |
| **Performance**   | Slow (due to immutability)    | Fast (no synchronization)      | Slower (due to synchronization)          |
| **Storage**       | String pool (for literals)    | Heap                           | Heap                                     |
| **Use Case**      | Small, fixed texts            | Single-threaded apps           | Multi-threaded apps                      |

---

## ⚠️ When to Use StringBuffer

- When working in a **multi-threaded** context.
- When you need **safe string manipulation** shared across threads.
- If performance is critical but **synchronization cannot be avoided**.

> 🔄 Prefer `StringBuilder` when thread safety is not required – it offers better performance.


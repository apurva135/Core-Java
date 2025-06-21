# 🧱 What is StringBuffer in Java?

`StringBuffer` is a **mutable sequence of characters**, like `StringBuilder`.

- It is **thread-safe**, meaning its methods are synchronized to work safely in a **multi-threaded environment**.
- It is part of the `java.lang` package.

---

## 🆚 String vs StringBuilder vs StringBuffer

| Feature       | String         | StringBuilder            | StringBuffer                 |
|---------------|----------------|---------------------------|-------------------------------|
| Mutable       | ❌ No          | ✅ Yes                    | ✅ Yes                        |
| Thread-safe   | ✅ (immutable) | ❌ No                     | ✅ Yes (synchronized)         |
| Performance   | Slow           | Fastest (single-threaded) | Slower (sync overhead)        |

---

## ⚙️ Common Methods of StringBuffer

| Method                              | Description                          |
|-------------------------------------|--------------------------------------|
| `append(String)`                    | Adds string at the end               |
| `insert(int offset, String)`        | Inserts string at given index        |
| `delete(int start, int end)`        | Deletes characters from start to end-1 |
| `replace(int start, int end, str)`  | Replaces part of the string          |
| `reverse()`                         | Reverses the characters              |
| `toString()`                        | Converts to a String                 |
| `capacity()`                        | Returns current buffer capacity      |
| `ensureCapacity(int minCap)`        | Expands buffer size if needed        |

---

## 📌 Example: Basic Use

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

## 🧠 When to Use StringBuffer

- When you're in a **multi-threaded environment**.
- When performance is needed but you can't compromise **thread safety**.
- **Example**: Building log messages in parallel threads.

---

## ⚠️ Notes

- If you're **not working with multiple threads**, prefer **StringBuilder** over StringBuffer — it's faster.
- `StringBuffer` is considered a **legacy class** and often replaced by `StringBuilder` unless synchronization is explicitly required.

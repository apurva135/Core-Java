# ✅ StringBuilder in Java – Questions & Answers

---

## ✅ 1. What is StringBuilder in Java?

StringBuilder is a **mutable sequence of characters**.

- It allows efficient string modifications like **appending**, **inserting**, and **deleting**.
- Unlike `String`, it does **not create a new object** every time it's modified.

---

## ✅ 2. What is the difference between String, StringBuilder, and StringBuffer?

| Feature       | String | StringBuilder | StringBuffer         |
|---------------|--------|----------------|-----------------------|
| Mutable?      | ❌ No  | ✅ Yes         | ✅ Yes                |
| Thread-safe?  | ✅ N/A | ❌ No          | ✅ Yes                |
| Performance   | Slower| Faster (single-threaded) | Slower (due to sync) |

---

## ✅ 3. When should you use StringBuilder instead of String?

Use `StringBuilder` when:

- You need to perform **many string modifications**, like in loops.
- **Thread safety** is not a concern.
- You want **faster performance** and **less memory usage**.

---

## ✅ 4. How does StringBuilder improve performance?

- Maintains a **mutable buffer**, so operations like `append()` don’t create new objects.
- Reduces **object creation** and **GC overhead**.
- Ideal for **large string concatenation** tasks.

---

## ✅ 5. What is the default capacity of StringBuilder?

- The default capacity is **16 characters**.
- If you create `StringBuilder("hello")`, capacity = 16 + 5 = 21.
- It **automatically expands** if needed.

---

## ✅ 6. How does append() work in StringBuilder?

- Appends the given data (`string`, `int`, `char`, etc.) to the **end** of the existing sequence.
- Returns the **same StringBuilder instance** → supports **method chaining**.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World").append("!");
```

---

## ✅ 7. What is the difference between append() and insert()?

- `append()` adds at the **end** of the string.
- `insert(index, str)` adds at a **specific position**.

```java
sb.insert(5, ","); // "Hello," becomes "Hello, World"
```

---

## ✅ 8. How does delete() work in StringBuilder?

- Deletes characters from **start index (inclusive)** to **end index (exclusive)**.

```java
StringBuilder sb = new StringBuilder("abcdef");
sb.delete(2, 4); // "abef"
```

---

## ✅ 9. How does reverse() work in StringBuilder?

- Reverses the **order of characters** in-place.

```java
StringBuilder sb = new StringBuilder("Java");
System.out.println(sb.reverse()); // "avaJ"
```

---

## ✅ 10. Can you convert StringBuilder to String and vice versa?

Yes.

- **StringBuilder → String**: `.toString()`
- **String → StringBuilder**: `new StringBuilder(str)`

---

## ✅ 11. Is StringBuilder safe to use in a multi-threaded environment?

- ❌ No, it's **not thread-safe**.
- Use `StringBuffer` for **thread-safe operations**.
- Or use **external synchronization** if needed.

---

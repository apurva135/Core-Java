# 🧱 What is StringBuilder in Java?

`StringBuilder` is a **mutable sequence of characters**.

- Part of `java.lang` package  
- Unlike `String`, it can be modified **without creating new objects**  
- More efficient than `String` for appending, deleting, inserting — especially in loops

---

## ✅ Why Use StringBuilder?

- `String` is **immutable** → creates a new object for every change  
- `StringBuilder` avoids that overhead → improves **performance**

### ❌ Inefficient Example Using String
```java
String str = "";
for (int i = 0; i < 1000; i++) {
    str += i; // ❌ creates 1000 new String objects
}
```

### ✅ Efficient Example Using StringBuilder
```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i); // ✅ efficient and fast
}
```

---

## ⚙️ Common Methods of StringBuilder

| Method                    | Description                             |
|---------------------------|-----------------------------------------|
| `append()`                | Add to the end                          |
| `insert(int, str)`        | Insert at a specific index              |
| `delete(start, end)`      | Delete characters from start to end-1   |
| `reverse()`               | Reverse the sequence                    |
| `replace(start, end, str)`| Replace part of the string              |
| `toString()`              | Convert to String                       |
| `capacity()`              | Returns the current buffer capacity     |
| `charAt(index)`           | Returns char at index                   |

---

## 🧪 Example: Basic Usage

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

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

## 🧠 Notes

- `StringBuilder` is **not thread-safe**  
- Use `StringBuffer` if you need **thread safety**  
- Initial capacity is **16 characters**; it **resizes automatically** as needed

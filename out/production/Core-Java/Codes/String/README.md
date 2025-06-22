# 📘 Java Strings – Complete Concept Guide

This document provides a complete overview of **Strings in Java**, covering everything from basics to advanced usage with practical examples.

---

## ✅ 1. What is a String?

- A `String` is a **sequence of characters**.
- In Java, `String` is a **class** in the `java.lang` package.
- **Strings are immutable** – once created, their values cannot be changed.

```java
String s = "hello";                  // String literal
String s2 = new String("hello");     // String object in heap
```

---

## 🔐 2. Immutability

- Any modification creates a **new String object**.
- Benefits: **Security**, **caching**, **string pooling**.

```java
String a = "test";
a.concat("123");  // returns "test123", but 'a' remains "test"
```

---

## 🎯 3. String Pool (Interning)

- Java stores **string literals** in a **special memory area** called the String Pool.
- Duplicate literals point to the **same object** to save memory.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b);  // true (same reference)

String c = new String("Java");
System.out.println(a == c);  // false (different objects)
```

---

## 🔄 4. Common String Methods

| Method | Description |
|--------|-------------|
| `length()` | Returns string length |
| `charAt(int)` | Returns character at given index |
| `substring(start, end)` | Extracts a substring |
| `indexOf(char)` | Finds index of a character |
| `equals()` | Compares content |
| `equalsIgnoreCase()` | Case-insensitive comparison |
| `toLowerCase()`, `toUpperCase()` | Case conversion |
| `trim()` | Removes whitespace from ends |
| `split(delimiter)` | Splits string into array |
| `replace(old, new)` | Replaces characters or substrings |

---

## 🧱 5. StringBuilder vs StringBuffer

| Feature | StringBuilder | StringBuffer |
|---------|---------------|--------------|
| Mutable? | ✅ Yes | ✅ Yes |
| Thread-safe? | ❌ No | ✅ Yes |
| Performance | Faster | Slower |

---

## ⚙️ 6. Useful String Operations

```java
String s = "hello world";

System.out.println(s.toUpperCase());       // HELLO WORLD
System.out.println(s.contains("world"));   // true
System.out.println(s.replace(" ", "_"));   // hello_world
System.out.println(s.startsWith("he"));    // true
System.out.println(s.endsWith("ld"));      // true
```

---

## 🔍 7. Comparison – `==` vs `equals()`

- `==` compares **references**
- `equals()` compares **content**

```java
String a = "Java";
String b = new String("Java");

System.out.println(a == b);         // false
System.out.println(a.equals(b));    // true
```

---

## 📌 8. Conversions

| From | To | Code |
|------|----|------|
| String → char[] | `s.toCharArray()` |
| char[] → String | `new String(charArray)` |
| int → String | `String.valueOf(123)` |
| String → int | `Integer.parseInt("123")` |

---

## 📎 Summary

- Strings in Java are **powerful**, **immutable**, and **widely used**.
- Understanding String handling is essential for **performance**, **security**, and **clean code**.

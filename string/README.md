# Java String and StringBuilder Operations Demo

This repository demonstrates basic and advanced operations on `String`, `StringBuilder`, and `StringBuffer` classes in Java. It is designed for learning and experimenting with common string-handling features like immutability, equality, transformations, and performance differences.

---

## 📁 Project Structure

com.sid.practice
└── string
├── StringDemo.java # Demonstrates StringBuilder and StringBuffer usage
├── StringMethodChackingDemo.java # Demonstrates String operations and methods


---

## 🚀 What This Project Covers

### 🧵 From `StringDemo.java`
- `String` creation using literals and `new` keyword
- `.hashCode()` to observe immutability behavior
- `StringBuilder`:
    - Appending text using `.append()`
    - Checking if the object is updated or recreated
- `StringBuffer`:
    - Similar to `StringBuilder` but thread-safe

### 🧠 From `StringMethodChackingDemo.java`

#### 🔤 String Methods Demonstrated:
- `isBlank()`: Checks if the string is blank (only whitespace or empty)
- `isEmpty()`: Checks if the string is exactly empty
- `repeat(n)`: Repeats the string `n` times
- `trim()`: Removes leading and trailing spaces
- `strip()`, `stripLeading()`, `stripTrailing()`: Remove Unicode whitespace and special characters
- `lines()`: Breaks multi-line string into a stream of lines
- `==` vs `.equals()`: Object comparison vs content comparison
- `length()`: Returns length of string
- `replace(old, new)`: Replaces characters in string
- `substring(start, end)`: Extracts a part of the string
- `toLowerCase()` / `toUpperCase()`: Converts case
- `concat()`: Joins two strings
- `getBytes()`: Converts string to byte array

---

## 🧪 Sample Output Snippets

```java
sentence.isBlank() : false
space.isBlank()    : true
sentence.isEmpty() : false
emptyString.isEmpty(): true

Repete String :Haa  Haa  Haa  Haa  Haa  

city==city1 both are not eqval
city.equals(city1) both are eqval

Length of city string: 3

String before replace: Akash
After replace: akash

Substring: id
Substring: ar

Lowercase: sidharth
Uppercase: SIDHARTH

After Concate: Sidharthwakode

Hashcode before update: 123456
Hashcode after update : 123456 (same object — mutable)


📦 How to Run
Open this project in IntelliJ IDEA or any Java IDE.

Ensure your Java version is 11 or above.

Run the following classes:

StringDemo.java — for StringBuilder and Buffer examples

StringMethodChackingDemo.java — for String method exploration

You will see results printed directly to the console.

👨‍💻 Author
Sid (@sidwakode)
A passionate Java learner exploring string internals, memory behavior, and performance through practical examples.

📌 Notes
Methods like isBlank(), repeat(), and lines() are only available in Java 11+.

StringBuilder is faster but not thread-safe. Use StringBuffer for thread-safe operations.


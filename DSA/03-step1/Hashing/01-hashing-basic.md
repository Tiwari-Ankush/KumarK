
# Hashing and Data Structures

## What is Hashing Actually?

Hashing is a process of converting input data (or a message) into a fixed-length string of characters, commonly known as a hash code or digest. It is often used for fast data retrieval.

## What are `HashSet` and `HashMap` with Examples?

### `HashSet`:
`HashSet` is a collection in Java that does not allow duplicate elements. It uses hashing internally to achieve constant-time performance for basic operations such as add, remove, contains, and size.


Example:
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println(set);  // Output: [orange, banana, apple]
    }
}
```

### `HashMap`:
`HashMap` is a collection that stores key-value pairs. It uses hashing to efficiently store and retrieve elements.

Example:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);
        System.out.println(map);  // Output: {orange=2, banana=5, apple=3}
    }
}
```

## What is `TreeMap`? Give an Example.

`TreeMap` is a Java collection that implements the `NavigableMap` interface and is based on a Red-Black tree. It stores key-value pairs in a sorted order.

Example:
```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 3);
        treeMap.put("banana", 5);
        treeMap.put("orange", 2);
        System.out.println(treeMap);  // Output: {apple=3, banana=5, orange=2}
    }
}
```

## Difference Between `HashMap` and `TreeMap`:

The main difference lies in the ordering of elements. `HashMap` does not guarantee any specific order, while `TreeMap` stores elements in sorted order.

## What is Linear Search and Its Complexity?

Linear search is a simple search algorithm that sequentially checks each element in a collection until a match is found or the entire collection has been searched.

Time Complexity: O(n)

## What is Binary Search and Its Complexity?

Binary search is an efficient search algorithm that works on sorted collections. It repeatedly divides the search space in half until the target is found.

Time Complexity: O(log n)

## What is Hash Function and Hash Table?

- **Hash Function:** A hash function is a mathematical function that transforms input data into a fixed-size value, often a hash code or digest.

- **Hash Table:** A hash table is a data structure that uses hash functions to map keys to indexes, providing efficient data retrieval.

## Complexity of Hashing Technique:

The average time complexity of basic hashing operations (insertion, deletion, and search) is O(1). However, it may degrade to O(n) in the worst case due to collisions.

## What are One-to-One and Many-to-One Functions in Hashing?

- **One-to-One Function:** Each element in the domain maps to a unique element in the codomain.

- **Many-to-One Function:** Multiple elements in the domain may map to the same element in the codomain.

## Collision Resolution Methods:

### Open Hashing (Chaining):
- Elements colliding at the same index are stored in linked lists.

### Closed Hashing (Open Addressing):
1. **Linear Probing:**
   - If a collision occurs, search for the next available slot linearly.

2. **Quadratic Probing:**
   - If a collision occurs at index i, search for the next slot using a quadratic function, e.g., i^2.

## Hash Functions for Linear Probing and Quadratic Probing:

- **Linear Probing:**
  - The next available slot is found by linearly incrementing the index.

- **Quadratic Probing:**
  - The next slot is found using a quadratic function, often incrementing by squares.

---

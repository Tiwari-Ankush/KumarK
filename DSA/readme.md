***FOR loop and FOR-Each loop***

The enhanced for loop and traditional for loop are both used for iterating over arrays and collections, but they have some differences in terms of syntax and use cases.

### Enhanced for loop (for-each loop):

Syntax:
```java
for (type variable : array) {
    // code
}
```


Example:
```java
int[] numbers = {1, 2, 3, 4, 5};

// Enhanced for loop
for (int num : numbers) {
    System.out.println(num);
}
```

Advantages:
1. Simplicity: The syntax is concise and easy to read.
2. No need for an index: You don't need to keep track of an index variable.

### Traditional for loop:

Syntax:
```java
for (initialization; condition; update) {
    // code
}
```

Example:
```java
int[] numbers = {1, 2, 3, 4, 5};

// Traditional for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Advantages:
1. Index control: You have more control over the loop, such as changing the index in a custom way.
2. Can iterate over a range of indices: Useful when you need to iterate over a portion of the array or collection.

### Example with Traditional Loop:

```java
String[] names = {"Alice", "Bob", "Charlie"};

// Traditional for loop
for (int i = 0; i < names.length; i++) {
    System.out.println("Hello, " + names[i] + "!");
}
```

In this example, the traditional loop allows you to access the index `i` directly, which can be useful if you need to perform operations based on the index or iterate over a subset of the array.


In summary, the enhanced for loop is more concise and readable, while the traditional for loop offers more control over the iteration process. The choice between them depends on the specific requirements of your code.



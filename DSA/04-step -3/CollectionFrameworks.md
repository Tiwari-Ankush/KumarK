

```markdown
# Java Collection Framework

The Java Collection Framework is a set of classes and interfaces that provide commonly reusable data structures. It includes dynamic arrays, linked lists, maps, sets, queues, and various other collections.


## ArrayList

`ArrayList` is a dynamic array implementation in Java. It is part of the `java.util` package and allows elements to be added or removed dynamically.


```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");
```


## Iterator

`Iterator` is an interface that provides a way to access elements of a collection one by one. It is used to iterate through collections like ArrayList.


```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

## Stack

`Stack` is a class that represents a last-in, first-out (LIFO) stack of objects.

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.pop(); // removes and returns the top element (2)
```

## Queue

`Queue` is an interface representing a collection designed for holding elements before processing. It follows the first-in, first-out (FIFO) principle.

```java
Queue<String> queue = new LinkedList<>();
queue.offer("A");
queue.offer("B");
queue.poll(); // retrieves and removes the head of the queue (A)
```

## LinkedList

`LinkedList` is a class that implements a doubly linked list. It allows for efficient insertion and removal of elements.

```java
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(1);
linkedList.add(2);
linkedList.remove(1);
```

## PriorityQueue

`PriorityQueue` is an implementation of a priority queue. Elements are ordered based on their natural ordering or by a specified comparator.

```java
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
priorityQueue.offer(3);
priorityQueue.offer(1);
priorityQueue.poll(); // retrieves and removes the least element (1)
```

## ArrayDeque

`ArrayDeque` is a class that implements a resizable array-based deque. It allows for efficient insertion and removal at both ends.

```java
ArrayDeque<String> arrayDeque = new ArrayDeque<>();
arrayDeque.addFirst("First");
arrayDeque.addLast("Last");
```

## HashSet

`HashSet` is a class that implements the Set interface, backed by a hash table. It does not allow duplicate elements.

```java
HashSet<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Orange");
```

## LinkedHashSet

`LinkedHashSet` is a class that extends `HashSet` and maintains insertion order.

```java
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Red");
linkedHashSet.add("Green");
```

## TreeSet

`TreeSet` is a class that implements the Set interface and uses a tree for storage. It maintains elements in ascending order.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(5);
treeSet.add(2);
```

## HashMap

`HashMap` is a class that implements the Map interface, storing key-value pairs. It allows for efficient retrieval and storage of elements.

```java
HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("Java", 1);
hashMap.put("Python", 2);
```

## Sets of Custom Classes

You can create sets of custom classes by implementing the `equals` and `hashCode` methods in your class.

```java
class CustomClass {
    // Implement equals and hashCode
}

HashSet<CustomClass> customSet = new HashSet<>();
customSet.add(new CustomClass());
```

## TreeMap

`TreeMap` is a class that implements the Map interface and uses a tree for storage. It maintains elements in ascending order of keys.

```java
TreeMap<String, Integer> treeMap = new TreeMap<>();
treeMap.put("One", 1);
treeMap.put("Two", 2);
```

## ArrayClass

In Java, arrays are objects and can be created using the array syntax.

```java
int[] array = {1, 2, 3, 4, 5};
```

## Collection Class

`Collection` is an interface that represents a group of objects. Classes that implement this interface include lists, sets, and queues.

```java
Collection<String> collection = new ArrayList<>();
collection.add("Item 1");
collection.add("Item 2");
```

## Sorting Custom Collections

Custom collections can be sorted by implementing the `Comparable` interface in the class.

```java
class CustomSortable implements Comparable<CustomSortable> {
    // Implement compareTo
}

List<CustomSortable> customList = new ArrayList<>();
Collections.sort(customList);
```

## Comparable Interface

The `Comparable` interface is used to define the natural order of objects.

```java
class MyClass implements Comparable<MyClass> {
    @Override
    public int compareTo(MyClass other) {
        // Implement comparison logic
        return 0;
    }
}
```

## Comparator Interface

The `Comparator` interface is used to define custom comparison logic for objects.

```java
class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Implement custom comparison logic
        return s1.compareTo(s2);
    }
}
```
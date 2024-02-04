
## What is Hashing.
*Hashing is basically used to store details and information of a data structure(say array) in an efficient way which helps to solve a problem efficiently.*
- **Hashing**: Process of converting input data into a fixed-size string of characters (hash code).
- **Purpose**: Quickly locate data records or values in databases or hash tables.
- **Hash Function**: Algorithm that generates the hash code, designed to be fast and efficient.
- **Unique Output**: Hash functions aim to produce a unique or nearly unique output for different inputs.
- **Indexing**: Hash code serves as an index or address for efficient data retrieval.
- **Applications**: Widely used in data storage, cryptography, and indexing structures.
- **Efficiency**: Hashing provides a faster alternative to linear search by reducing search time complexity.
- **Collision**: Occurs when two different inputs produce the same hash code, requiring collision resolution strategies.
- **Security**: Hash functions play a crucial role in password hashing and digital signatures in cybersecurity.


## HashMap
*A HashMap is a data structure in Java that implements the Map interface. It stores key-value pairs, allowing efficient retrieval, insertion, and deletion of elements. Each key must be unique, and it maps to a specific value. HashMap uses a hash table to provide constant-time average complexity for basic operations.*

What is it mainly used for ? 
**Answer** :-> used for {key - value} mainly to store the frequency of the elements. 
_General Hashmap_ :- 
B = [ 5 5 8 8 1 1 1 ] 
```
Map->
     Elements                         Frequency
{

       5                    ->                   2
       8                    ->                   2 
       1                    ->                   3

}
```

### Collection: `Set`

#### Definition:
 - The `Set` interface in Java is a part of the Java Collections Framework. 
 - It represents a collection that cannot contain duplicate elements. 

#### Properties of `Set`:
1. **No Duplicate Elements**: Ensures that each element in the `Set` is unique.
2. **Unordered Collection**: Except for some specific implementations like `LinkedHashSet` or `TreeSet`, the `Set` does not guarantee the order of its elements.

#### Implementation Classes:
1. **HashSet**:
   - Maintains a random order
2. **LinkedHashSet**:
   - Maintains insertion order of elements. 
3. **TreeSet**:
   - Maintains sorted order 

#### Why There is No `get()` in `Set`:
The `Set` interface does not have a `get()` method, and this is by design, due to the following reasons:
1. **Uniqueness Over Indexing**: The `Set` is designed to ensure uniqueness rather than maintain an index-based system like `List`. Elements in a `Set` are not accessed by an index.
2. **Undefined Ordering**: In most implementations of `Set`, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.



#### List vs Set

# Implementation class in List -- > ArrayList and LinkedList

# Implementation class in Set --- > HastSet, LinkedHashSet, TreeSet


*ArrayList*
   - used for get/access the values faster.

*LinkedList*
   - used for add/Insert/remove/delete the values faster.


*HashSet*
   - used for random sorting  by using hashing algorithim

*LinkedHastSet*
   - Used for same insertion order

*TreeSet*
   - used for sorting the values based on Ascii order.







#### static keyword

   - Inside the non-static methods it is possible to call both non-static and static methods and variables without creating object.
   - Inside the static method only static methods and variable are able to call directly. non-static are possible to call by using class object.
   
 *Execution hirerachy*
      static block --> non-static block --> main method.

      Note: but without main method it is not possible to execute the program.
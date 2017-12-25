# java-cheatsheet

### Constructor
```java
class Person {

  String firstName;
  String lastName;

  Person() {
  
  }

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
}
```

### Collections API - Lists
The List interface represents an ordered collection.

#### ArrayList
```java
ArrayList<String> myList = new ArrayList<String>();

myList.add("Mon");
myList.add("Tue");
myList.add("Thu");
myList.add(2, "Wed");

// {"Mon","Tue","Wed","Thu"}
```

#### LinkedList
```java
// ...
```

#### Vector
```java
// ...
```

### Collections API - Sets
The Set interface is an unordered collection and does not allow duplicate elements.

#### HashSet
```java
HashSet<String> mySet = new HashSet<String>();
myList.add("Cat");
myList.add("Dog");
myList.add("Moose");
myList.add("Cat");

// {"Cat","Dog","Moose"}
```

#### LinkedHashSet
```java
// ...
```

#### TreeSet
```java
// ...
```

### Collections API - Maps
The Map interface is a key-value pair.

#### HashMap
```java
// HashMap<KEY,VALUE>
HashMap<String,String> smallMap = new HashMap<String,String>();

smallMap.put("firstKey", "Cat");
smallMap.put("secondKey", "Dog");

smallMap.get("secondKey") // -> Dog

// Nesting maps
HashMap<String,HashMap<String,String>> bigMap = new HashMap<String,HashMap<String,String>>();

bigMap.put("Animals",smallMap);
```

#### LinkedHashMap
```java
// ...
```

#### Hashtable
```java
// ...
```

#### HashTree
```java
// ...
```

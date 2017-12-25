# java-cheatsheet

### Access Specifiers
```
Specifier             Class      Package    Subclass   World
------------------------------------------------------------------
public                X          X          X          X
protected             X          X          X
(no modifier)         X          X
private               X
```

### Constructor, Getters and Setters
```java
public class Person {

  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
}
```

### Inheritance and Polymorphism
```java
public class Doe extends Person {

  // This class now has all the functionality of the Person class by extending it.
  
  // We are adding functionality to the setFirstName() method by overriding it.
  @Override
  public void setFirstName(String firstName) {
    // Note the use of super instead of the this keyword because of override.
    super.firstName = firstName;
  }
  
}
```

### Static
```java
public class Person {

  // Can't never reference this.dna, because is a static variable
  // It'll never exist for a single instance, but for all the objects at same time
  
  static String dna = "this variable is shared for all the objects";
  
}
```

### Final
```java
// Cant ever change variable
public final int meaningOfLife = 42;

// Cant ever change or override method
public final void getMeaning() {
  Log.e("The meaning of life is 42.");
}
```

### Enhanced For Loop (For Each Loop)
```java
ArrayList<String> myList = new ArrayList<String>();

// Normal Foor Loop
for(int i = 0; i < myList.size(); i++) {
  String item = myList.get(i);
  System.out.println(item);
}

// Enhanced For Loop
for(String item : myList) {
  System.out.println(item);
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

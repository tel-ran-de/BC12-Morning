# Java sample interview questions
 
## Basics

1. Explain JDK, JRE and JVM
2. Explain public static void main(String args[]) (what every word means)

    Let's split it and understand one by one.
    *  public- Here public is an access specifier which allows thhe main method to be accessble everywhere.
    *  static- static helps main method to get loaded without getting alled by any instance/object.
    *  void- void clarifies that the main method will not return any value.
    *  main- It's the name of the method.
    *  String[] args- Here we are defining a String array to pass arguments at command line. args is the variable name of the String array. It can be changed to anything such as String [] a.
    *  https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html

3. What is Class in general and in Java in particular?

    What is Class?
    A class is an entity that determines how an object will behave and what the object will contain. In other words, it is a blueprint or a set of instruction to build a specific type of object.

4. What is difference between Object and Class?

    Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors – wagging the tail, barking, eating. An object is an instance of a class. Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.
    
5. What is Polymorphism?
6. What is Encapsulation?
7. What is a local and instance variables in Java?
8. What are constructors in Java?
9. Can I inherit a constructor in a subclass?
10. What is ‘this’?
11. What is super()?
12. What is the difference between equals() and == ?
13. What is the difference between abstract classes and interfaces?
14. What is method overloading and method overriding?
15. Explain to me how can I compare/sort objects of the same class in Java
16. What is the mutable/immutable object?
17. What is singleton class and how can we make a class singleton?
18. What are wrapper classes? (for Java primitives)
19. What a programmer should be aware of when using wrapper classes?
20. Please, explain equals()/hashCode() contract to me
21. What will happen if hashCode() always returns a constant?
22. Explain HashMap to me
23. What is the difference between HashMap and TreeMap?
24. Explain LinkedList to me
25. Explain difference between LinkedList and ArrayList
26. What’s the difference between toString() and String.valueOf()
27. You have an array of elements that contain duplicate elements.

How would you remove duplicate elements?

28. What is Exception?
29. Which exceptions in Java do you know?
30. How do we handle exceptions in Java?

Java 8 specific questions

1. Which new features were added in Java 8? (Lambda expressions, method references, Optional, default methods, DateTime API, functional interfaces)
2. What is functional interface?
3. Which functional interfaces in Java standard library do you know?
4. What is the meaning of String::valueOf ?
5. What is the default method?
6. What Java 8 streams are for?
7. What is stream intermediate and terminal operations?
8. What is the lambda expression?
9. What is the parameter to Stream.map() function?
10. What is the difference between map() and flatMap() operations? Web
1. What’s the default HTTP/HTTPs port?
2. How to do a HTTP request via the command line?
3. How to do a HTTP request via telnet/netcat?
4. What is the difference between UDP and TCP?
5. Please describe the whole journey / process when opening a
website in your browser!
6. Please explain structure of HTTP protocol to me.
7. What is the difference between 4xx and 5xx response codes?
8. Why do we need HTTP headers?
9. What is the difference between POST and PUT methods?
Spring
1. What is the Bean?
2. What is the Context?
3. What is Dependency Injection?
4. What Injection options does Spring offer?
5. What bean scopes are available in Spring? (Singleton, Prototype,
Request, Session)
6. How can you register beans in Spring? (XML, Classpath Scanning,
@Configuration classes)
7. Which annotation should I use @Resource or @Autowired? What
is the difference? ( Solution )
8. What is the difference between @Inject and @Autowired? Which
one to use under what condition? ( Solution )
9. What’s the difference between @Component, @Controller,
@Repository & @Service annotations in Spring, can they be used
interchangeable or do they have specific functionality? ( Solution )
Multithreading
1. What is the difference between Process and Thread?
2. How can we create a Thread in Java?
3. What are different states in lifecycle of Thread?
4. Can we call run() method of a Thread class?
5. How can we make sure main() is the last thread to finish in Java
Program?
6. Why thread communication methods wait(), notify() and notifyAll()
are in Object class?
7. How can we achieve thread safety in Java?
8. What is volatile keyword in Java
9. What is Deadlock? How to analyze and avoid deadlock situation?
10. What is atomic operation? What are atomic classes in Java
Concurrency API?
11. What is Lock interface in Java Concurrency API? What are it’s
benefits over synchronization?
12. What is Executors Framework?
13. What are Concurrent Collection Classes?
14. What is Executors Class?

Other:

1. Which design pattern do you know?
2. Describe your favourite one
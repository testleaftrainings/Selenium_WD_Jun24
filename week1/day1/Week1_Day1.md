**Java Introduction:**

What is Java?

   Java is a computer programming language.
   Java is a versatile and widely-used programming language.
   It allows developers to write code that can run on different types of devices, from computers to mobile phones.
   Java is strong and reliable.
   Robustness in Java refers to its ability to handle errors and unexpected situations gracefully.
   It includes features like strong memory management.
   Java uses a way of organizing code based on objects.
   Object-oriented programming is a programming principle that organizes code into objects, which are instances of classes. This approach promotes code reuse, modularity, and easier maintenance.

Why Java?

   Java is known for being flexible.
   Java's adaptability means that it can be used in various scenarios.
   Whether you're building a small application or a large-scale system, Java provides the flexibility to adapt to different requirements and environments.
   Java works on different types of devices.
   Being ''platform-independent'' means that Java code can run on various devices, such as computers, smartphones, and other gadgets. This is possible because Java programs are compiled into an intermediate form (bytecode), which can be executed on any device with a Java Virtual Machine (JVM).
   Java is versatile and excels in a wide range of applications.
   It is commonly used in web development, mobile app development (Android), enterprise systems, scientific applications, and more.
   Its broad applicability makes it a popular choice for developers working on diverse projects.


**Java Architecture:**

JDK (Java Development Kit):

   JDK is like a toolkit for Java developers.
   The JDK includes everything a developer needs to write, compile, and run Java applications.
   It contains the Java compiler, libraries, and other tools to help create software.
   If you want to build Java applications, you need the JDK.

JRE (Java Runtime Environment):

   JRE is like a package to run Java programs.
   The JRE is necessary for running Java applications.
   It includes the Java Virtual Machine (JVM) and essential libraries. If you only want to run Java programs and not develop them, you just need the JRE. It allows your computer to execute Java applications.

JVM (Java Virtual Machine):

   JVM is like a virtual computer for Java.
   The JVM is a virtualized environment that runs Java bytecode.
   When you compile your Java code, it turns into bytecode, a set of instructions for the JVM.
   The JVM, in turn, translates these instructions into machine code that your computer understands.
   It makes Java programs "write once, run anywhere" by enabling them to run on any device with a compatible JVM.

IDE:
   Definition: An IDE, or Integrated Development Environment, is like a digital workspace where programmers write, edit, and manage their code. It provides tools such as a code editor, debugger, and compiler, all in one place, making it easier for developers to create and maintain their software.

Package:
   Definition: In Java, a package is a way to organize and group related classes and interfaces. It helps in avoiding naming conflicts and enhances the overall structure of a program.

Class:
   Definition: In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects created from the class will have.

Variables:
   Definition: Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data.

Datatypes:
   Definition: Datatypes specify the type of data a variable can hold.





**Steps to Create a Maven Project**
-------------------------------
   1. Click on the File from top menu bar.
   2. Choose New from the file
   3. Click on the Project
   4. Expand the Maven folder
   5. Under the Maven folder choose maven project
   6. Enable the checkbox for Create a simple project
   7. Enter the GroupID and ArtifactID
         GroupID - Organization name (Eg : org.testleaf)
         ArtifactID - Project name (Eg : LearnSelenium)
   8. Click on the finish button.


**Steps to Create a Package**
-------------------------
   1. Right on src/main/java
   2. Click on New
   3. Click on package
   4. Enter the package name.(Eg : week1.day1)
         - .(dot) will help to create a subfolder.
   5. Don't enable checkbox for create package info.java (If it is enabled remove it)
   6. Click on the finish.


**Steps to Open Package in Local**
------------------------------
   1. Right click on src/main/java
   2. Choose ShowIn
   3. Click on System Explorer
   4. open java folder.


**Steps to retirve package Explorer in Eclipse**
--------------------------------------------
   1. Click on window from Menu bar
   2. Choose Show View
   3. Click on Package Explorer


**Steps to Create a Class**
-----------------------
   1. Right click on the package
   2. Choose new
   3. Click on class
   4. Enter the class name (class name starts with Uppercase or PascalCase)
   5. Click on the checkbox for Main method
   6. Click on finish button.

**Steps to execute**
----------------
   1. Right click 
   2. RunAs ---> Java Application


**Naming Convention**
-----------------
   PascalCase - each word first letter starts with upper case (Eg : HelloWorl(d)
   camalCase  - first word entirely will be in lower case and form second word the first letter starts with uppercase (Eg: areYouReady)

   Project and Class name --> PascalCase
   packageName , variable name and method name --> camelCase
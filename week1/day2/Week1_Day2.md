**Conditional Statements:**

Conditional statements are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

*1. if Statement:*
Definition: The if statement is used to execute a block of code only if a specified condition is true.

Syntax:

if (condition) {
    // Code to be executed if the condition is true
}


*2. if-else Statement:*
Definition: The if-else statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

Syntax:

if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}


*3. if-else if-else Statement:*
Definition: The if-else if-else statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

Syntax:

if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}



*Switch-case statement:*

The switch-case statement in Java is a conditional statement used to make decisions based on the value of an expression.
The switch statement evaluates the expression and then compares it against various case values. When a match is found, the associated block of code is executed.

Syntax:

switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}

*Key points about the switch-case statement:*

Expression: The expression is evaluated once and its value is then compared with the constant values specified in the case statements.
Case Values: Each case specifies a constant value that the expression is compared against. If there's a match, the code block following that case is executed.
Break Statement: The break statement is used to exit the switch statement after a match is found. Without break, the flow of execution would continue to subsequent case statements.
Default Case: The default case is optional and serves as a fallback if none of the case values match the expression. It is executed when no other matching case is found.
Differences and Usage of If and Switch case Statements:
Expression Type: if: Can handle complex conditions involving relational operators, logical operators, and method calls. switch: Requires a simple expression that results in a value (e.g., numeric types, characters, or enumerated types).
Number of Conditions: if: Suitable for handling a relatively small number of conditions or conditions that don't share a common expression. switch: Especially useful when there are multiple conditions sharing the same expression.
Equality Comparison: if: Allows for complex conditions involving equality, inequality, or other relational operators. switch: Specifically designed for equality-based comparisons. Each case checks if the expression equals a constant value.
Complex Conditions: if: Provides flexibility to handle more complex conditions with logical operators (AND, OR). switch: Limited to simple equality conditions; each case checks if the expression equals a specific value.
Fall-Through Behavior: if: Each if statement is independent, and there is no implicit fall-through behavior. switch: Requires explicit break statements to exit the switch block. Without break, the control flow falls through to the next case. This can be leveraged for multiple case values executing the same block of code.
Default Case: if: No default case; you can handle default behavior with an additional else statement. switch: Has a built-in default case, which is executed when none of the case values match the expression.


**Control and Jump Statements:**

*Definition:* 
   Control statements in Java are used to manage the flow of execution in a program. They include decision-making statements

*Looping Statements:*
    For Loop: Repeats a block of code a specific number of times.

*Jump Statements:*
    Break Statement: Terminates the innermost loop or switch statement. Continue Statement: Skips the current iteration and continues to the loop and proceeds to the next iteration.

**Methods:**

*Definition:* 
   A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined using the def keyword, followed by the method's signature, which includes its name, parameters, and return type.

Explanation: 
   Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.

**Objects:**

*Definition:*
    In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.

Explanation
   Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.



**Steps to execute in Debug mode:**

    1. Set a break Point(double tap/click on the blue line will add/remove break point )
            -shortcut key --> ctrl+shift+b
    2. Right click --> Debug as --> Java Application
    3. Click on the Swtich button for Debug presptive
    4. Click on Resume icon or use f8 key
            - it will go to the next break point
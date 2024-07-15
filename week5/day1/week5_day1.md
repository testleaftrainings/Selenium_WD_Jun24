Steps to create a feature file
-------------------------------

1. create a package as features under src/test/java
2. Right on features package, Create a file 
3. File should be .feature as extension.



Steps to write a feature file
-----------------------------
1.  write a Feature: first to describe which featurte are we going to work on
2. Write a Scenario: to describe the what scenario going done in this feature. Note: Scenario is a testcase

3. Write a test steps for the Scenario by using Given, When,Then, But,And
   - Given keyword used to describe preconditions/ user passing input to the application
   - When keyword used to describe performing any actions in  the application.(Mouse Actions)
   - Then keyword used for Postive Testcase validation/verification purpose
   - But keyword used for Negative Testcase validation/verification purpose
   - And Keyword used for continues usage of Given,When,Then,But.



Steps to execute/run feature file
---------------------------------
   - Create a runner class under the runner package
   - Runner class should inherit AbstractTestNGCucumberTests
   - Add CucumberOptions annotation at the top the class.
   - Add features attribute and assign the feature file location
   - Add glue attribute and assign the package name of the testScript




Steps to pass data from feature file(Static Parameterization)
-------------------------------------------------------------
1. In the Feature pass a input with in a single qoute along with test step
2. In the stepDefinition package to do parameter insted for input use {string} . Note: string to be lowerCase


Steps to do Common Integration for Driver
-----------------------------------------
1. Create a class as a ProjectSpecificMethod
2. Declare a driver globally as static. Eg: public static ChromeDriver driver;
3. Other StepDefinitation classes should extends with ProjectSpecificMethod Class.


Steps to generate Cucumber report
---------------------------------
 1. In CucumberOptions annotation add two attribute publish, monochrome and assign value as true for both
 default value for publish and monochrome is false.
  publish attribute is used to generate a report by cucmber
  monoChrome attriburte is used to remove errors/unwanted warnings in the console.









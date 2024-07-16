Steps to do Dynamic Parameterization
------------------------------------

1. In feature use Scenario Outline insted of Scenario
2. To pass multi data to the test steps add a tag and provide header name for the data (Eg: Given Enter the company name as <cname>)
3. After the test steps add a Examples: keyword and Create a pipe line to pass data
      Examples:
      |phno|fname|lname|cname|
      |99|Gokul|Sekar|Testleaf|
      |98|Babu|M|Qeagle|
      |97|Hari|R|Testleaf|
4.In Step definition package mapping test steps for the test script . Insted of {string} use (.*)$







Before Annotation Will execute Before every scenario
After Annotation will execute After every scenario

Steps to Execute using Cucumber Annotation
------------------------------------------
1. Create a class as Hooks and Declare two methods as preCondition and postCondition. Use @Before and @After annotations from cucumber.io respectively.
2. All the steps Definition classes and hooks should inherit the projectSpecificMethod.
3. In ProjectSpecificMethod It should be only driver as static

Note: If hooks or steps definition classes are inherited , will get runTimeException as invalidMethodException will occurs. Becasue it is not possible to inherit hooks or StepDefinition.


Steps to Excute using TestNG Annotation
----------------------------------------
1. In projectSpecific Create a two methods as preCondition and postCondition use BeforeMethod and AfterMethod annotations respectively
2. ProjectSpecificMethod should inhert AbstractTestNGCucumberTests 
3. Runner class should extends ProjectSpecificMethod insted of AbstractTestNGCucumberTests
4. All the stepDefinition should inherit projectSpecificMethod.

Note: Runner should extends ProjectSpecificMethod and ProjectSpecificMethod should extends AbstractTestNGCucumberTests otherwise TestNG annotations will not work.


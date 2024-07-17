**Steps to Implement Hooks**
1. Create a package as hooks
2. Under the hooks package create a class as HooksImplementation
3. Inherit ProjectSpecificMethod in HooksImplementation class
4. Use preCondition and postCondition with cucumber annotation @Before and @After (@Before --> execute before each scenarino and @After execute after each scenario)
5. In the runner file/class mention the hooks package in glue attribute.


Possiblity of getting invalidMethodException:
      1. If stepDefinition extends StepDefinition (Login extends CreateLead)
      2. If StepDefintion extends class with cucumber annotation(hooks)



**Execution flow**
1. Look for duplicate test steps written in class (which is mentioned in glue attribute)
2. @Before
3. Backaground 
4. Scenarino(Look for test steps in stepDef and hooks, if it is not available throw an Exception as undefinedStepDefinitionExecption.)
5. @After


**Steps to execute TestNG annotations in cucumber**
1. In projectSpecificMethod(Base class) declare preCondition and postCondition with TestNG annotations (@BeforeMethod and @AfterMethod)
2. Inherit AbstractTestNGCucumberTests in ProjectSpecificMethod
3. In Runner file/class remove AbstractTestNGCucumberTests and inherit ProjectSpecificMethod 






***POM Introduction***
POM  -> Design pattern , Page Object Model
pom.xml --> xml file , Project Object Model



**Steps to build framework using POM**
--------------------------------------
1. Create 3 packages which are base, pages, testcases
2. Inside the pages package Create a Class for each webpage
3. Inside the page class create methods for each webElement and also write testScript(logic)
4. In base package create a class as ProjectSpecificMethod(Base class) 
5. In ProjectSpecificMethod create methods preCondition and postCondition with TestNG annotations as BeforeMethod and AfterMethod.
6. Inherit ProjectSpecificMethod in each Pages class.
7. Add return type for each method.
8. Under the testcases package Create a class for Testcase 
9. Testcase class inherit ProjectSpecificMethod
10. Design the execution flow with the help LoginPage constructor or object





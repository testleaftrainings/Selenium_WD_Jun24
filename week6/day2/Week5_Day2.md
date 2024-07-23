# Steps to Implement Properties file for Credentials in POM
------------------------------------------------------------
1. In preCondition before intiazling driver value set file path for properties file , Create object for Properties class and Load the properties
2. Make Properties object as global static
3. Remove parameterization for enterUsername() and enterPassword()
4. Inside the sendKeys get the property value based on key use getProperty()


# Steps to Handle Multilingual application using Properties file
----------------------------------------------------------------
1. Create Properties file for each language
2. Use same key name for all the language
3. Remove the hardcorded value in where we use different values for languages and get value from the properties file based on the key



# Steps to Integrate Extent Report
----------------------------------

@BS --> Start report
   @BT  --> Set excel file , testcase name, author name, category name
      @BC --> Assign testcase name, author name, category name
         @BM --> Precondition
            @T -> Testcase execution
         @AM --> postCondition
      @AC
   @AT
@AS --> close report

1. Create a method in baseClass to startReport() and use @BeforeSuite 
2. In Testcase class assign/declare reportInformation(testcase name, author, category, ) and excel filename in @BeforeTest
3. In baseClass Create a method to assign information for report and use @BeforeClass
4. In pages class write a testStep for pass or fail status
5. In BaseClass create a method to close the report and use @AfterSuite
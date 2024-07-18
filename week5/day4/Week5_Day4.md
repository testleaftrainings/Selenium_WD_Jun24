**Steps to acheive Parameterization in POM**
1. Declare method input argumets in each pages class methods where ever using sendKeys()
2. Remove hardedcorded values and pass the variable in sendKeys()
3. Create a package as utils under src/test/java and Paste your ReadExcel java file, And also do method input arguments for excel file name
4. In the ProjectSpecificMethod(Base class) Create a getData() and use @DataProvider annotation
5. Declare public String fileName global to access/declare filename.
6. In testcase class declare a method as setData() and use @BeforeTest annotation
7. assign value for filename in setData()
8. Use dataProvider attribute to invoke @DataProvider
9. Add input arguments in @Test input arguments



**Steps to implement Parallel execution in POM**
1. Remove static keyword for driver object/variableName
2. Pass driver into the LoginPage() constructor in @Test method.
3. Inside the LoginPage constructor assign local driver variable value to global driver variable
4. Pass the driver variable into the each pages class constructor

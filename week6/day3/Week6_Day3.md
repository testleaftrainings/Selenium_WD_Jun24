# Steps to Implement Cucumber in POM
------------------------------------
1. Create a feature file
2. Create stepDef(pages) and map the the testSteps and testScripts
3. Create runner class and use CucumberOptions annotation and mention the feature file location and stepDef package name
4. Assign information for report in runner class with help of @BeforeTest
5. Runner class extends ProjectSpecificMethod(report, diver)
6. ProjectSpecificMethod extends AbstractTestNGCucumberTests
7. Finally run a runner file.


# Steps to implement ThreadLocal for driver
-------------------------------------------
1. Declare private static final for ThreadLocal<RemoteWebDriver>
2. Create a method setDriver() and inside assign value for driver (rt.set(new ChromeDriver()))
3. Create a method getDriver() and return rt.get()
4. Replace driver = new ChromeDriver()  with setDriver()
5. Replace driver with getDriver() in entire project
6. Remove public ChromeDriver driver (Global varibale)

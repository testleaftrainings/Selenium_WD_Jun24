# Steps to take  snapshot
-------------------------
1. Take a snapShot using getScreenshotAs()
2. Set the file path to save the screenshot
3. Copy the Screenshot file into the file location

    ## Required Dependency

    <dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
    </dependency>



# Extent Report
---------------
1. Set the file path for the report
2. Create object for ExtentReports
3. Attach reporter path to the report
4. Create report for a testcase
5. Provide/assign information to the testcase -> author, category
6. Testcase status pass or fail
7. close the report

    ## Required dependency

    <dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
    </dependency>



# Steps to create Properties file
---------------------------------
1. Create a property file under resources
2. Create object for FileInputStream and pass properties file in the constructor
3. Create object for Properties class from java.util package
4. Load the properties file
5. Get the value from properties file by using key
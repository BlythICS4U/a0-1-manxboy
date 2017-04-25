# a0-1

In this assignment, you will:
* Open an existing Java project in NetBeans
* Examine how command line arguments are read
* Examine how string variables are converted to integers
* Learn what the "static" keyword means
* Learn how to run a project in NetBeans
* Learn how to run JUnit tests in NetBeans
* Add additional functionality to the class
* Add additional tests to cover the new functionality

We begin by cloning the repository and creating our develop branch.  We then use NetBeans to open the AddAndSubtract project.  In the Projects window, under AddAndSubtract, you should see 4 directories:
* Source Packages - contains source code for the project
* Test Packages - contains test code for the project
* Libraries - contains dependencies required by your project source code
* Test Libraries - contains dependencies required by your project test code

## AddAndSubtract.java

Under "Source Packages" you will see an "addandsubtract" package.  Within this package you will find the file AddAndSubtract.java.  We will take some time in class to discuss the following:
* The use of command line arguments in the program's main method
* The conversion of command line arguments from string values to integer values
* The use of the keyword "static" in the addIntegers helper method
* The use of System.out.println to output text to the console

If you try running the project as-is, you will get an ArrayIndexOutOfBounds exception.  This is because we have not specified any command line arguments to pass into our program.  Under the "Run" menu, select "Set Project Configuration" -> "Customize...".  In the "Arguments" field, enter 2 numbers separated by a space (i.e. 2 3) and click OK.  Rerun the project and you should now see output like the following:

`2 + 3 = 5`

## AddAndSubtractTest.java

Under "Test Packages" you will see an "addandsubtract" package.  Within this package you will find the file AddAndSubtractTest.java.  We will take some time in class to discuss the following:
* The use of the @Test annotation
* The use of assertEquals to compare 2 values

To run the JUnit test, you can right click on the AddAndSubtractTest.java file in the Projects window and select "Test File".  In the test output, you should see something like the following:

```
Testsuite: addandsubtract.AddAndSubtractTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 sec
```

## Where's the Subtraction?

Now that we have taken a tour of the project, you'll notice that AddAndSubtract does not actually subtract.  Update the project as follows:
* In AddAndSubtract.java:
  * add another static method called subtractIntegers that takes 2 integers and returns number1 - number2
  * add an additional println to the main method that outputs the difference between the 2 arguments
* In AddAndSubtractTest.java:
  * add another test call testSubtractIntegers that validates the subtractIntegers method works as intended

Once you have verified that all your tests pass and your program prints what you expect, use the Github application to commit your updated files to your develop branch and create a pull request for this assignment.

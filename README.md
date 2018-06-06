[![Build Status](https://travis-ci.org/LoyolaChicagoCode/hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/hello-java)

This build will always fail because it has 2 examples of failing tests:
one based on the source code, and one based on an incorrect test.

# Learning Objectives

* Simple hello world example
* Experience with Git source code management
* Building with Gradle (using the Gradle wrapper)
* Automated unit testing with JUnit
* Continuous integration with Travis

# System requirements

* Java 6 SDK or later

# Running the Application

On Linux or Mac OS X:

    $ ./gradlew run
	
On Windows:
	
    > gradlew run

# Running the Tests

On Linux or Mac OS X:

    $ ./gradlew test
	
On Windows:
	
    > gradlew test

# Running the Application Outside Gradle

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On Linux or Mac OS X:

    $ ./gradlew startScripts
    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ ./gradlew jar
    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3

On Windows:

    > gradlew startScripts
    > .\build\scripts\hello-java arg1 arg2 arg3

or

    > gradlew jar
    > java -jar build\lib\hello-java.jar arg1 arg2 arg3

# Discussion: What would be a really simple solution if n were not an argument, i.e., if it were always 17?

If 17 was in place of variable n then the solution would be really simple in a way that we simple limit the loop to 17, which will always print the same output of fizz buzz. Given below is the example code of the above scenario:

for (int i=1; i<17; i++) {
	if ((i%3 == 0) && (i%5 == 0)) {
	  	System.out.println("fizz buzz");
	} 
	else if (i%3 == 0) {
		System.out.println("fizz");
	} 
	else if (i%5 == 0) {
	  	System.out.println("buzz");
	} 
	else {
	  	System.out.println(i);
	}
}

As in above code, we can see that the i<17 which limits the program to print the values < 17. So, this would be a simple solution.

# Discussion: How could you have automatically tested your initial solution from part 2?

As we have to develop the logic for the whole program at once so the initial solution from part 2 can be automatically tested in a way that we can compare the output of our developed code with the output provided in the example. As in the part 2 the output was simple print stream so it is easy to test and compare it with the output provided in example. So, if we are getting the correct output for 1 value then it will assurre that the program logic is correct and we can further test it by giving it different values.

# Discussion: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

In the part 2 we have developed the logic and simply produce the output on screen using the print stream. In part 3 we have continued with the same logic but we will just place the output in the string array which will be returned by a function when it will be called. Moreover, after part 2 we have also kept the check on the provided argument that whether it is an integer greater than 0 or not. Similarly, in part 4 we have changed the code in a way that the generated output will be returning in an arraylist rather than in an array which was done in part 3. So, after reviewing the whole scenario of all the parts we can say that the basic logic of the program to print fizz, buzz, fizz buzz and number remains the same but the handling of data changes from part to part. Choosing the list implementation matters but not much because for the given scenario we just have to place the simple string output in a list which also works as an array as we just want to place it in a sequential way and then display it. If we were to perform some certain operations on the output like adding or deleting an element from the list then we can use the linked list but it wasn't required as we have just have to store the input and using linked list or other list structures for simple scenarios will cause a bit complex program in terms of understanding it.




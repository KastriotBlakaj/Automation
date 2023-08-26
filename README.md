## Automation for an Online shopping https://www.saucedemo.com/

## How to get the Project 

You can clone it from GitHub on this url :https://github.com/KastriotBlakaj/Automation
Or from terminal using this command : git clone https://github.com/KastriotBlakaj/Automation.git

## Language and tools used

Programming Language Java and BuildTool Maven also the IDE IntelliJ 
Check the Version of the Maven using : mvn - version , in my case "/Library/apache-maven-3.8.5"
and Java Version "Java version: 1.8.0_202,"

## Description of the Project 

This is an online shopping store where the user can Log In/Out and can select items from the store and 
proceed into checkout  also can remove the items from the Checkout and can complete the purchase.

## Features 

Key Features are : 
    Login , Adding Items, Removing Items, Filling Checkout Information, Making the Purchase.


## How to run it 

The way of running it its form the Test Classes 
There are two Running Classes that Include on itself the rest of the Project 
Go to the Class **LoginTest** on this Directory "src/test/java/tests/LoginTest.java" 

And User can choose to run All tests at once by running the whole Class or each Test on its own 
The **LoginTest** Include the  Positive TestsCases and the Functional Testing Also End to End Testing 

And the **NegativeLoginTest** on this Directory "src/test/java/tests/NegativeLoginTest.java"  
The **NegativeLoginTest** Include Negative test for Login

## Note : 
The new version of Chrome 116 it's not yet compatible with Serenity The Latest Version 3.9.8 that means that the "Serenity @Managed driver " 
won't get along with the Chrome version 116. 
Solution : Download the chrome driver version 116 from this url https://googlechromelabs.github.io/chrome-for-testing/  
and the version of the chrome should be on 116 too, 
These properties are set manually under the BaseClass **src/test/java/tests/BaseClass.java** and run the tests as described above !

## There is a Diagram of the Code Structure

![](/Users/kastriotblakaj/Desktop/diagram.png)


## Reports 

You can see a very structured Reports.
Go into the Maven tab and look for command :**mvn verify**  
what this would do it's that will run all the tests and then once all ran it will generate reports 
that can be found under "target/site/serenity/theFrirstfile.html" there you will find all the  reports what failed and what not
This is the way to implement on CI/CD too and trigger them on nightly basis







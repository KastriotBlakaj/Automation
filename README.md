## Automation for an Online shopping https://www.saucedemo.com/

## How to get the Project 

You can clone it from GitHub on this url :https://github.com/KastriotBlakaj/Automation
Or from terminal using this command : git clone https://github.com/KastriotBlakaj/Automation.git


## Technologies

Technologies used:
* Java 1.8.0
* Java Serenity 3.9.7


## Setup

* Language - Java Version 1.8.0
* Maven Project ,
  Maven is a build automation tool used primarily for Java projects, for testing purpose in this case.
* IDE - IntelLiJ

## Description of the Project 

This is an online shopping store where the user can Log In/Out and can select items from the store and 
proceed into checkout  also can remove the items from the Checkout and can complete the purchase.

## Features 

Key Features are : 
    Login , Adding Items, Removing Items, Filling Checkout Information, Making the Purchase.


## How to run it 

There are two ways for 
   1- mvn verify that will run all of the tests within test packages

   2-There are two Running Classes that Include on itself the rest of the Project 
Go to the Class **LoginTest** on this Directory "src/test/java/tests/LoginTest.java" 

And User can choose to run All tests at once by running the whole Class or each Test on its own 
The **LoginTest** Include the  Positive TestsCases and the Functional Testing Also End to End Testing 

And the **NegativeLoginTest** on this Directory "src/test/java/tests/NegativeLoginTest.java"  
The **NegativeLoginTest** Include Negative test for Login



## Reports 

* User can get a detailed reports from Serenity and maven by running the command
* mvn verify
* That will run the tests and once the tests are ran the reports will be generated under the /**target/site/reports**
* This location will be added into serenity.properties 
* And can open it within the Browser. 







# **Desktop-App-Winium-Java-Cucumber**


## Blog

Check out the complete blog on this framework here: [Click Here](https://spurqlabs.com/desktop-automation-made-easy-a-winium-java-and-bdd-guide-2/)



## Authors

- [SpurQLabs](https://github.com/spurqlabs)
- [ydhole-spurqlabs](https://github.com/ydhole-spurqlabs)


## **Description**

This repository contains a test automation framework is built on Java, Winium, Cucumber for BDD, and Maven for managing dependencies and automation tasks. Java provides reliability, Winium facilitates seamless interaction with Windows applications, Cucumber supports BDD test creation for clear specifications, and Maven ensures a streamlined project structure and execution process. Together, these tools create an efficient and maintainable framework for desktop application testing.

## **Features**

#### Written in Java for Strong Typing and Code Quality
- Leverages Java's strong typing to enhance code quality and maintainability.
#### Utilizes Winium for Desktop Application Automation

- Integrates Winium for powerful and seamless interaction with Windows-based desktop applications.
#### Supports Cucumber for BDD Style Tests

- Implements Cucumber for creating natural language behavior-driven development tests, ensuring clear specifications and collaboration.
#### Includes Built-in Reporting using Cucumber

- Incorporates Cucumber's built-in reporting feature for easy visualization of test results, aiding in analysis and debugging.
#### Provides Utility Functions and Configurations for Common Scenarios

- Offers a set of utility functions and pre-configured settings to handle common test scenarios efficiently, reducing development time.
#### Supports Maven for Dependency Management and Parallel Test Execution

- Utilizes Maven for managing dependencies and build processes, ensuring project scalability and ease of maintenance.


## **Table of Contents**
- [Pre-Requitesites](#Pre-Requitesites)
- [Technology](#Technology_used_in_Framework)
- [Installation](#Installation)
- [Github Workflow File](#Github_Workflow_File)
- [Framework Structure](#Framework_Structure)
- [Reports](#Generated_Reports)
- [Execution](#Test_Execution)

## Pre-Requisite
### *Required tools for the project*

- Java
- JDK: 11.0.16
- Winium: 0.1.0-1
- Cucumber: 7.12.0
- testNG: 7.7.1
- cucumber-html-reporter: 6.0.0
- cucumber-core: 7.11.1


## Technology_used_in_Framework
#### AUTOMATION:
- `JDK- ^11.0.16`
- `Winium - ^0.1.0-1`
- `Java`
- `Cucumber: ^7.12.0`


#### REPORTING TOOL :
- `cucumber-html-reporter- ^6.0.0`

#### FRAMEWORK DESIGN PATTERN :
- `Behavior Driven Development (BDD)`
#### OS for Execution on Local:
- `Windows`


**Note:** 
##### Please make sure you have all technologies in your local machine installed or configured.

## Installation
### To Clone this repository to a local directory
Commands to clone and run the test cases<br />
- #### git clone: 
`https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber.git`

This command clone this repository to your local VS code.
- #### Install the dependencies mentioned in prerequisite

    - To do so open the pom.xml file and right click go to maven and then select reload project. 
    - This step will install all the dependencies mentioned above. 
    - Make sure you have JDK installed on your system having version greater than 8

## Framework_Structure

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/6b20ca51-e836-43ac-9d5a-0a4af7aef4db)

### *Features*

- The feature file contains the test scenarios described in Gherkin Language. 
- The Scenarios are described in steps format using the keywords like Give, when, And, Then.

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/ac70b6da-ca55-4198-b689-0b28e94a9319)

### *Step Definitions*
- Step definition files contain code that maps the steps in the feature file to automation code. 
- The step definitions are responsible for interacting with the elements of the application and performing actions on them such as clicking, entering text, etc.

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/0f64e671-0d0b-4fae-a241-a4b6e9c1fd5c)


### *Pages*

- The pages folder has the page object model of every feature file. 
- The each file from the page folder is consists of the locators used to locate the webelements and the required actions performed to validate the functionality of the respective web elements. 

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/27f2525d-4eb6-44b5-95a7-d871717e90a9)


### *Utils*

- The folder is generally used to describe the methods that can be use more oftenly. 
- The folder has logger file which is use to log the step results in the page file.

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/6d38378b-52e3-49e2-abf0-d40d446cac56)


### *Hooks*

- In Cucumber, hooks are methods annotated with @Before and @After that run before and after each scenario. 
- To ensure consistency between test environments, these hooks are used for setting up and taking down tests. 
- The application can be initialized before and cleaned up after each scenario using hooks.

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/c08fe046-9acb-4280-b411-252d1acc13dd)


### *Test Runner File*

- The TestRunner class executes Cucumber tests with specified configuration settings, including the location of feature files, step definitions package, inclusion tags, and report generation plugins.
- The seamless integration of Cucumber tests into TestNG makes testing and reporting easy.

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/e0cb3769-2c59-48f6-9433-9d7f73c6d1d6)


## Test_Execution
- To execute the tests in the main branch of the repository you need to run the following command from the terminal:

- This command runs all the tests from the project.
    `mvn test`

- This command first cleans the project (removes the target directory) and then runs the tests.
    `mvn clean test`

- This command runs tests with specific Cucumber tags.
    `mvn test “-Dcucumber.filter.tags=@tagName`

## Generated_Reports

### Report1:

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/54941a89-b25d-4d00-88df-4a4eb82fce34)

### Report2: 

![image](https://github.com/spurqlabs/Desktop-App-Winium-Java-Cucumber/assets/110516709/8990ff57-34b7-458e-9d14-d73a1a51d122)

# Student Marks Analyzer

## Project Overview

The Student Marks Analyzer is a Java-based application that analyzes student marks and generates a summary report. It calculates the average marks, highest mark, total number of students, and pass percentage.

The project demonstrates Java programming, Maven dependency management, automated testing with JUnit, and application packaging.

## Features

* Accepts marks for multiple students.
* Calculates the average marks.
* Identifies the highest mark.
* Calculates the pass percentage.
* Validates marks between 0 and 100.
* Uses Apache Commons Math for statistical calculations.
* Includes automated unit tests using JUnit 5.
* Packages the application into a runnable JAR using Maven.

## Technologies Used

* Java 17
* Apache Maven
* Apache Commons Math 3.6.1
* JUnit 5
* Maven Surefire Plugin
* Maven Shade Plugin
* Visual Studio Code

## Project Structure

```text
Studentmarkanalyzer/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/department/marks/
    │           ├── Main.java
    │           └── MarksAnalyzer.java
    └── test/
        └── java/
            └── com/department/marks/
                └── MarksAnalyzerTest.java
```

## Sample Input

```text
Number of students: 5
Student 1 marks: 80
Student 2 marks: 65
Student 3 marks: 35
Student 4 marks: 90
Student 5 marks: 50
```

## Sample Output

```text
========== ANALYSIS REPORT ==========
Total Students : 5
Average Marks  : 64.00
Highest Marks  : 90.00
Pass Percentage: 80.00%
=====================================
```

## How to Run

### Prerequisites

* JDK 17 or later
* Apache Maven

### Compile the Project

```bash
mvn compile
```

### Run Unit Tests

```bash
mvn test
```

### Package the Application

```bash
mvn clean package
```

### Run the JAR

```bash
java -jar target/student-marks-analyzer-1.0.0.jar
```

## Testing

The project contains 10 JUnit test cases covering student count, average marks, highest mark, pass percentage, and invalid inputs.

Latest verified test result:

* Tests run: 10
* Failures: 0
* Errors: 0
* Skipped: 0

## Learning Outcomes

* Understanding Maven project structure and build lifecycle.
* Managing external dependencies through `pom.xml`.
* Writing and executing automated unit tests with JUnit.
* Generating test reports with Maven Surefire.
* Packaging a Java application as a runnable JAR.

## Author

Student project developed for learning Java, Maven dependency management, automated testing, and build tools.


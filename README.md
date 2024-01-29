**Java List**

Welcome to the Java List repository! This project is part of the F5 Fullstack Bootcamp 🚀.

## Introduction

This repository contains a Java program that manages the days of the week. The `WeeklySchedule` class provides various methods to handle operations related to the days of the week.

## Technologies Used

- Java
- Maven
- JUnit
- Hamcrest

## Installation

To run this project locally, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven

## Getting Started

1. Clone this repository to your local machine:

```bash
git clone https://github.com/luispardosuarez/java-list.git
```

2. Navigate to the project directory:

```bash
cd java-list
```

3. Build the project using Maven:

```bash
mvn clean install
```

4. Run the tests:

```bash
mvn test
```

## Features

The `WeeklySchekule` class provides the following methods:

- `createWeekList()`: Creates a list of the days of the week.
- `getWeekDays()`: Returns the list of days of the week.
- `getWeekDaysCount()`: Returns the length of the list.
- `removeWeekDay(String day)`: Removes a day of the week from the list.
- `getWeekDay(int index)`: Returns the day of the week at the specified index.
- `containsWeekDay(String day)`: Returns true if the specified day exists in the list.
- `sortWeekDaysAlphabetically()`: Sorts the list of days alphabetically.
- `clearWeekDays()`: Clears the list of days of the week.

## Testing

Each method of the `WeeklySchedule` class has corresponding unit tests implemented using JUnit and Hamcrest.

## Contributors

- luispardosuarez

Feel free to contribute by forking this repository, making changes, and submitting pull requests.

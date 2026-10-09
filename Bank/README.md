# Java Banking System 🏦

A collection of Java programs demonstrating basic Object-Oriented Programming (OOP) concepts through a simple banking simulation. This repository includes interactive command-line interfaces, array manipulation, and foundational class structures.

## 📋 Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Libraries & Utilities](#libraries--utilities)
- [Getting Started](#getting-started)
- [How to Run](#how-to-run)

## 📖 Overview
This project contains two main executable programs:
1. **BankDemo**: An interactive Command Line Interface (CLI) application that allows users to deposit, withdraw, check balances, and track the number of valid transactions.
2. **BankAccountArrayBeraksi**: A demonstration of using dynamic arrays (ArrayList) to manage multiple bank accounts, including adding, removing, and retrieving accounts by index.

## 📂 Project Structure
The repository consists of the following Java files:

*   **`Account.java`**: A basic account model handling balance, deposits, and withdrawals using boolean returns for success checks.
*   **`Bank.java`**: A bank class used in the interactive demo that tracks the balance and counts the total number of successful transactions using a `static` counter.
*   **`BankAccount.java`**: An account model utilizing account numbers and balances.
*   **`Customer.java`**: Models a bank customer who can hold up to 5 `Account` objects using a standard Java array.
*   **`BankDemo.java`**: Contains the `main` method for the interactive terminal banking application.
*   **`BankAccountArrayBeraksi.java`**: Contains the `main` method demonstrating `ArrayList` operations with `BankAccount` objects.

## 🛠️ Libraries & Utilities
This project relies entirely on core Java features and does not require external dependencies like Maven or Gradle. However, it makes use of the following standard Java utility libraries:

*   **`java.util.Scanner`**: Used in `BankDemo.java` to capture and process user input from the console.
*   **`java.util.ArrayList`**: Used in `BankAccountArrayBeraksi.java` to dynamically store and manipulate a list of `BankAccount` objects (resizing automatically as items are added or removed).

## 🚀 Getting Started

### Prerequisites
To compile and run this project, you need to have the **Java Development Kit (JDK)** installed on your machine. 

You can verify your installation by running:
```bash
java -version
javac -version
```

## 💻 How to Run

First, clone the repository and navigate into the project directory:
```bash
# Clone the repository (replace with your actual repo URL)
git clone https://github.com/yourusername/your-repo-name.git

# Navigate to the project folder
cd your-repo-name
```

### 1. Compiling the Code
Before running the applications, compile all the Java files in the directory. Run the following bash command:
```bash
javac *.java
```

### 2. Running the Interactive Bank Demo
To start the interactive CLI application (`BankDemo.java`), run:
```bash
java BankDemo
```
*Follow the on-screen menu to check balances, deposit, withdraw, and track transactions.*

### 3. Running the ArrayList Demonstration
To see the output of the array list manipulation (`BankAccountArrayBeraksi.java`), run:
```bash
java BankAccountArrayBeraksi
```
*This will output the expected array sizes and account numbers as defined in the source code.*
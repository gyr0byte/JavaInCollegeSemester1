# Week 8 - Java Programming Assignments

This folder contains a collection of Java programs from Week 8 of the Programming 1 course. Each file demonstrates different fundamental Java concepts including object-oriented programming, control flow, and algorithmic problem-solving.

## Programs Overview

### 1. **GymMemberNepal.java**

A gym membership management system that handles member information and fee calculations.

**Features:**

- Member profile creation with name, membership type, join date, and monthly fee
- Annual fee calculation
- Discount application for senior citizens (10%) and students (15%)
- Loyalty discount eligibility check (members with 1+ year tenure)
- Member information display

**Key Methods:**

- `calculateAnnualFee()` - Computes yearly fee from monthly fee
- `getDiscountedFee()` - Applies discounts based on member category
- `isEligibleForDiscount()` - Checks loyalty discount eligibility
- `displayMemberInfo()` - Displays complete member details

---

### 2. **LeapYearCalculator.java**

Determines whether a given year is a leap year.

**Logic:**

- A year is a leap year if:
  - It is divisible by 4 AND not divisible by 100, OR
  - It is divisible by 400

**Usage:**

- Run the program and enter a year
- Program outputs whether it's a leap year or not

---

### 3. **Math.java**

A simple calculator class performing basic arithmetic operations.

**Operations:**

- Addition (`add()`)
- Subtraction (`sub()`)
- Multiplication (`mul()`)
- Division (`div()`)

**Usage:**

- Enter two numbers when prompted
- Program displays results for all four operations

---

### 4. **PrimeNumber.java**

Checks whether a given number is prime.

**Logic:**

- Numbers ≤ 1 are not prime
- Checks divisibility from 2 to n-1
- Returns appropriate message

**Usage:**

- Enter a number when prompted
- Program determines if it's prime or not

---

### 5. **ReversedString.java**

Reverses a string and checks if it's a palindrome.

**Functionality:**

- Reverses the input string character by character
- Compares original and reversed strings
- Identifies palindromes

**Output:**

- Displays reversed string
- Indicates whether the string is a palindrome

---

### 6. **StudentTester.java**

Demonstrates object-oriented programming with a Student class.

**Student Class Features:**

- Properties: name, age, grade
- Overloaded constructors (with/without grade)
- `displayInfo()` - Shows student details
- `isAdult()` - Checks if student is 18+ years old
- `updateGrade()` - Increments grade by 1
- Custom `toString()` method for string representation

**Usage:**

- Create Student objects with different constructors
- Test various methods to manage student data

---

### 7. **ThirdLargest.java**

Finds the first, second, and third largest numbers in an array.

**Algorithm:**

- Iterates through array once
- Tracks largest, second largest, and third largest values
- Handles duplicates appropriately

**Test Array:** `{12, 45, 14, 21, 66, 34, 32}`

- Largest: 66
- Second Largest: 45
- Third Largest: 34

---

## How to Run

### Compile all Java files:

```bash
javac *.java
```

### Run individual programs:

```bash
java GymMemberNepal
java LeapYearCalculator
java Math
java PrimeNumber
java ReversedString
java StudentTester
java ThirdLargest
```

## Concepts Covered

- ✓ Classes and Objects
- ✓ Constructors and Overloading
- ✓ Methods and Return Types
- ✓ Control Flow (if-else, loops)
- ✓ Arrays and Array Processing
- ✓ String Manipulation
- ✓ Scanner for User Input
- ✓ Object-Oriented Design

---

## Notes

- These programs are educational and may have simplified implementations
- Some programs require user input via Scanner
- The `temp.txt` file is not part of the main assignments

---

**Course:** Programming 1 - Semester 1  
**Folder:** week_8  
**Date:** 2025

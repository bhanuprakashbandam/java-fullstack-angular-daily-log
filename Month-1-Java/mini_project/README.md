 DAY 06 + DAY 07 – MINI PROJECT (ATM) COMBINED
 Day 06–07: ATM Mini Project (Core Java)
🔹 Project Title

Console-Based ATM Application

Problem Statement

Design and implement a console-based ATM system that allows a user to:

Authenticate using a PIN

Check account balance

Deposit money

Withdraw money

Exit the application safely

OOAD (Object Oriented Analysis & Design)
Ientified Objects / Classes

Account

Manages balance

Handles deposit and withdrawal logic

ATM

Handles user interaction

Displays menu

Controls program flow

Main

Entry point of the application

OOAD Flow
User → ATM → Account

 Project Structure
Mini-Project-ATM/
├── README.md
└── src/
├── Account.java
├── ATM.java
└── Main.java

⚙️ Features Implemented

PIN authentication before accessing ATM menu

Check current balance

Deposit money with validation

Withdraw money with balance check

Menu-driven program using loop

Graceful exit option

 Concepts Used

Core Java

Object-Oriented Programming (Classes & Objects)

if / else conditions

switch-case

Loops (do-while)

Scanner for user input

Method calls & control flow

How the Program Works

User runs Main.java

System asks for PIN (default: 1234)

If PIN is valid → ATM menu is shown

User selects options until Exit is chosen

Balance updates dynamically

Sample Flow
Enter PIN: 1234

--- ATM MENU ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
   Choose option:

 Future Enhancements

Transaction history

Multiple accounts

PIN retry limit

Database integration

🎤 Interview-Ready Summary (VERY IMPORTANT)

I developed a console-based ATM application using Core Java and OOAD principles.
The project uses multiple classes to separate responsibilities, implements PIN-based authentication, and uses loops and conditional logic to manage user interaction.

🧠 Key Learnings (Day 6 + Day 7)

How to design a project using OOAD

How to split logic into multiple classes

How to build a menu-driven application

How to improve a project step by step

How to make a project interview-ready


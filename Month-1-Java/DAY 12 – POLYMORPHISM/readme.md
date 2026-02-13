# Day 12 – Polymorphism (Core Java)

## 📌 Definition
Polymorphism means "one method, many forms".
Same method name behaves differently based on the object.

---

## 🔹 Types of Polymorphism

### 1️⃣ Compile-Time Polymorphism (Method Overloading)
Same method name with different parameters.
Resolved at compile time.

Example:
add(int a, int b)
add(int a, int b, int c)

---

### 2️⃣ Runtime Polymorphism (Method Overriding)
Child class overrides parent method.
Resolved at runtime using parent reference.

---

## 💻 Example – Food Order System

Parent Class:
Food → prepare()

Child Classes:
Pizza → prepare()
Burger → prepare()
Biryani → prepare()

Example Code Concept:
Food f = new Pizza();
f.prepare();

Food f = new Burger();
f.prepare();

---

## 🧠 Key Points
- Inheritance required
- Method overriding required
- Parent reference + Child object
- Runtime decides which method runs

---

## 🎯 Real-Life Example
Payment system (UPI, Card, NetBanking)
Notification system (Email, SMS)
Food ordering system

---

## 📌 Interview Questions
1. What is polymorphism?
2. Types of polymorphism?
3. How is runtime polymorphism achieved?
4. Difference between overloading and overriding?

---

## 🚀 GitHub Commit Message
Day 12: Implemented compile-time and runtime polymorphism examples

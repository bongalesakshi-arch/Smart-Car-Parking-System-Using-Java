# 🚗 Smart Parking Management System

## 📌 Project Overview

Smart Parking Management System is a Core Java application that helps manage vehicle parking operations efficiently. The system allows users to park vehicles, search for parked vehicles, calculate parking fees based on parking duration, and remove vehicles from the parking area.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP), Collections Framework, Exception Handling, and Java Time API.

---

## ✨ Features

* Park a vehicle
* Remove (Back Out) a vehicle
* Search vehicle by RTO number
* Display all parked vehicles
* Calculate parking fees based on parking duration
* Duplicate slot checking
* Custom exception handling for unavailable vehicles

---

## 🛠 Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Collections Framework (ArrayList)
* Exception Handling
* LocalTime & Duration API

---

## 📂 Project Structure

```text
Smart-Parking-Management-System
│
├── Main.java
├── Vehicle.java
├── ParkingManager.java
└── VehicleNotFoundException.java
```

---

## 🧩 Classes Used

### Vehicle

Stores vehicle details such as:

* Vehicle Type
* Vehicle Name
* RTO Number
* Entry Time
* Exit Time
* Parking Slot

### ParkingManager

Handles parking operations:

* Add Vehicle
* Remove Vehicle
* Search Vehicle
* Display Vehicles
* Calculate Parking Fee

### VehicleNotFoundException

Custom exception used when a vehicle is not found in the parking system.

### Main

Menu-driven user interface for interacting with the system.

---

## 💰 Parking Fee Structure

| Vehicle Type | Fee Per Hour |
| ------------ | ------------ |
| Two-Wheeler  | ₹20          |
| Four-Wheeler | ₹40          |

---

## 📋 Menu Optio

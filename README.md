# Hospital-OOP-Project
A console-based **Hospital Management System** implemented using **Object-Oriented Programming (OOP)** in **Java**. Built and tested using **Apache NetBeans**.

---

## Introduction
During the development of this project, we experienced the strength of **OOP concepts** and how they improve code **structure**, **modularity**, and **maintainability**.  
We transitioned from procedural programming to a fully OOP-based structure using **Java**, a class-based language that promotes flexible and organized code through features like:

---

## Core OOP Concepts Used
- **Inheritance**: To share common attributes and behaviors (e.g., `Person → Doctor`, `Patient`)
- **Composition & Aggregation**: For managing dependent and independent class relationships
- **Polymorphism & Dynamic Binding**: Allowing subclass methods to override superclass behavior dynamically
- **Encapsulation**: Protecting data using private fields with setters and getters

---

## Key Features
- Console-based interactive system
- CRUD operations for all main entities
- Dynamic data handling with `ArrayList`
- Flexible search and filter options
- Reusable, modular, and maintainable code structure

---

## Entities and Class Structure
| Entity         | Description |
|----------------|-------------|
| **Person**     | Base class for Doctor and Patient. Includes ID, name, gender, birth year, etc. |
| **Doctor**     | Inherits from `Person`. Adds email, salary, specialization, department, and more |
| **Patient**    | Inherits from `Person`. Adds emergency condition, room, admission date, etc. |
| **Appointment**| Connects patient and doctor with time, date, room, and status |
| **Department** | Contains department-specific data and associated sections |
| **Section**    | Linked to a department. Holds operations, rooms, patients, and diseases |
| **MedicalRecord** | Tracks patient health data: diagnosis, treatment, operation, medicine |
| **Disease**    | Disease ID, name, and contagious status |
| **Operation**  | Operation ID, section, room, date, and list of involved doctors |
| **Medicine**   | ID, name, dosage, and side effects |

---

## How to Run the Project (Apache NetBeans)
1. Open **Apache NetBeans**.
2. Go to `File > Open Project`.
3. Select the root folder of this repository.
4. Press `Shift + F11` to **Clean and Build** the project.
5. Right-click `Hospital.java` and choose **Run File** (or press `F6`).
6. Use the console menu to perform operations such as:
   - Add, view, search, and delete entities
   - Exit by choosing option `0`

---

## Technologies Used
- **Java 17+**
- **Apache NetBeans**
- **OOP Principles**
- **Console-based UI**

---

## Functionalities:each entity supports:
- **Add** – Register new data (e.g., doctor, patient, department, etc.)
- **Search** – Find entries using ID or other criteria
- **Retrieve** – View all or specific entries
- **Delete** – Remove any record by ID
- **Update** – Modify data (Doctor and Patient info)

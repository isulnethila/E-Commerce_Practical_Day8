# Day-08-Practicals - ICAE 01 

## Exam Question (From PDF)

**University of Vavuniya - Faculty of Applied Science**  
**Course**: IT 3232 (Practical for E-Commerce)  
**Date**: 02nd May 2025 | **Duration**: 1 Hour  

**Scenario**:  
The university wants to build a Smart Canteen Management System using Spring Boot. The system must:  
1. Manage multiple canteens across campus.  
2. Track food items (name, price, weight) sold only at canteens.  
3. Allow canteens to offer daily menus containing food items (a food item can appear in multiple menus across canteens/days).  
4. Manage students and employees:  
    - **Students**: ID, name, age, gender, academic degree. Can place food orders.  
    - **Employees**: ID, name, age, gender, job position. Can be associated with multiple canteens.  
5. Record food orders with:  
    - Order lines linking to food items from a daily menu.  
    - Support for multiple orders per student, with order dates.  

**Tasks**:  
1. Create entity classes with proper JPA relationships and ORM techniques.  
2. Migrate the models to a database and take a backup.  

**Submission Instructions**:  
- Copy the `model` folder and generated database backup to the Z drive.  
- Do not copy files while they are open in the editor.  

---

## Project Description

This Spring Boot application models a university canteen management system with:  
- **User inheritance** (Student/Employee).  
- **Canteen-DailyMenu-FoodItem** relationships.  
- **Order management** for students.  
- JPA/Hibernate for database migration.  

---

## Prerequisites

- **Java 17+**  
- **Maven**  
- **MySQL** or **H2 Database** (for testing)  
- **IDE**: IntelliJ, Eclipse, or VS Code  

---

## Model Structure

### Entities & Relationships
| Entity         | Attributes                          | Relationships                                                                 |
|----------------|-------------------------------------|-------------------------------------------------------------------------------|
| `User`         | `id`, `name`, `age`, `gender`       | Inherited by `Student` and `Employee` (`@Inheritance(strategy = JOINED)`)     |
| `Student`      | `academicDegree`                    | `@OneToMany` → `FoodOrder`                                                    |
| `Employee`     | `jobPosition`                       | `@ManyToMany` ↔ `Canteen`                                                     |
| `Canteen`      | `id`, `location`                    | `@OneToMany` → `DailyMenu`; `@ManyToMany` ↔ `Employee`                        |
| `DailyMenu`    | `id`, `date`                        | `@ManyToOne` ← `Canteen`; `@ManyToMany` ↔ `FoodItem`                          |
| `FoodItem`     | `id`, `name`, `price`, `weight`     | `@ManyToMany` ↔ `DailyMenu`                                                   |
| `FoodOrder`    | `id`, `datePlaced`                  | `@ManyToOne` ← `Student`, `DailyMenu`; `@OneToMany` → `OrderLine`             |
| `OrderLine`    | `id`, `quantity`                    | `@ManyToOne` ← `FoodOrder`, `FoodItem`                                        |


### Diagram Overview

```plaintext
User <|-- Student
User <|-- Employee
Canteen --< DailyMenu
DailyMenu >-- FoodItem
Student --< FoodOrder
FoodOrder --< OrderLine
OrderLine --> FoodItem
Employee >-- Canteen
```

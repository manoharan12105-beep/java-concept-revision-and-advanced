# Day 24 — Hibernate Basics

Today I started learning **Hibernate ORM** as part of my Java Backend learning roadmap.

This was a very basic introduction to understand what Hibernate is and how it connects Java applications with a database.

## What I Learned

* What **Hibernate** is
* What **ORM (Object Relational Mapping)** means
* Basic Hibernate configuration
* Creating a simple entity class
* Using Hibernate to insert an object into a database

## Tech Stack

* Java
* Hibernate
* MySQL
* Maven

## Simple Example

A basic `Student` object is created in Java and stored in the database using Hibernate.

```java
Student st1 = new Student();
st1.setRollNo(1);
st1.setName("Doni");
st1.setAge(21);

session.persist(st1);
```

Hibernate automatically generates the SQL query to insert the data into the database.

## Project Structure

```
Day24-Hibernate-Basics
 └── demo
     ├── pom.xml
     └── src
         ├── main
         │   ├── java
         │   │   ├── Hibernate.java
         │   │   └── com/example/demo/Student.java
         │   └── resources
         │       └── hibernate.cfg.xml
```

## Next Steps

After completing my 30-day Java backend roadmap, I plan to spend a full week diving deeper into Hibernate concepts used in enterprise applications.

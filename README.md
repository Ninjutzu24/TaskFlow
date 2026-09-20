# TaskFlow

TaskFlow is a Java application for managing projects, tasks, and developer learning roadmaps.

The project is being built as a hands-on way to practice Java backend development, software engineering concepts, automated testing, and professional Git/GitHub workflows.

## Current Status

🚧 **In development**

The Core Java phase is complete at the current project level.

Implemented so far:

* Core domain model
* Project and task management
* Task status updates
* Task filtering by status and priority
* Task sorting by deadline
* Safe collection exposure
* Domain validation and custom exception handling
* Automated unit testing with JUnit

**Next milestone:** SQL and PostgreSQL fundamentals, followed by database persistence for TaskFlow.

## Features

* Users can manage multiple projects
* Projects can contain multiple tasks
* Tasks have a title, description, priority, status, and deadline
* Add and remove tasks
* Find tasks by title
* Change task status
* Filter tasks by status
* Filter tasks by priority
* Sort tasks by deadline
* Validate invalid task data
* Expose internal collections safely using read-only copies
* Automated testing with JUnit

## Technologies

* Java 21
* Maven
* JUnit
* Git
* GitHub

## Java Concepts Practiced

* Object-Oriented Programming
* Encapsulation
* Collections and Generics
* Enums
* Optional
* Streams and Lambdas
* Comparators
* Exception handling
* Custom exceptions
* Input validation
* Unit testing with JUnit

## Development Workflow

TaskFlow uses a feature-based Git workflow:

Issue → Feature Branch → Implementation → Tests → Commit → Push → Pull Request → Merge

Each major feature is developed separately before being merged into `main`.

## Roadmap

* ✅ Core domain model
* ✅ Task management
* ✅ Filtering and sorting
* ✅ Domain validation and error handling
* ✅ Initial unit testing
* 🚧 SQL and PostgreSQL
* Database persistence
* Spring Boot
* REST API
* JPA / Hibernate
* Spring Security
* Deadline email reminders
* Docker
* GitHub Actions / CI/CD
* Simple frontend
* Kubernetes and Cloud deployment

## Planned Advanced Feature

TaskFlow will include deadline reminders that notify users before an unfinished task is due.

The planned flow is:

Database → scheduled deadline check → reminder service → email notification

This feature will be implemented after database persistence and Spring Boot are introduced.

## Purpose

TaskFlow is both a functional project-management application and a learning project designed to progressively evolve from a Core Java application into a complete Java backend system.

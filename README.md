# TaskFlow

TaskFlow is a Java application for managing projects, tasks, and developer learning roadmaps.

The project is being built as a hands-on way to practice Java backend development, software engineering concepts, automated testing, and professional Git/GitHub workflows.

## Current Status

🚧 **In development**

The core domain model, task management operations, filtering, sorting, and initial JUnit tests are implemented.

**Current milestone:** domain validation and error handling.

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
* Unit testing with JUnit

## Development Workflow

TaskFlow uses a feature-based Git workflow:

Issue → Feature Branch → Implementation → Tests → Commit → Push → Pull Request → Merge

Each major feature is developed separately before being merged into `main`.

## Roadmap

Current and upcoming milestones:

* Domain validation and error handling
* Additional unit tests and code cleanup
* SQL and PostgreSQL
* Database persistence
* Spring Boot
* REST API
* JPA / Hibernate
* Spring Security
* Docker
* GitHub Actions / CI/CD
* Kubernetes and Cloud deployment

## Purpose

TaskFlow is both a functional project-management application and a learning project designed to progressively evolve from a Core Java application into a complete Java backend system.

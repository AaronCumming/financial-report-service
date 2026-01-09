# Financial Report API

## Overview

The Financial Report API is a Java Spring Boot web application that calculates financial reports based on client transaction data. The application models clients and their financial transactions (assets and liabilities), stores them in a database, and exposes RESTful endpoints to retrieve data and compute net worth.

## Features

- RESTful API built with Spring Boot
- Client and financial transaction data modeling
- Net worth calculation based on assets and liabilities
- H2 in-memory database for quick setup and testing
- JPA/Hibernate for database interaction


## Tech Stack

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven


## How to Use

### 1. Clone the Repository

```bash
git clone <your-repository-url>
cd demo
```

### 2. Build the Project

```bash 
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

4. Access the Application

Application root (test endpoint):
http://localhost:8080/

API endpoints (example):
http://localhost:8080/clients

http://localhost:8080/report/{clientId}

H2 Database Console:
http://localhost:8080/h2-console

# Spring Boot Dto Projection With ModelMapper

This repository contains a Spring Boot application that demonstrates CRUD operations using ModelMapper and DTO (Data Transfer Object) for projection.

## Features

- CRUD operations on `Employee` entity
- DTO-based projection to fetch specific fields
- ModelMapper integration for mapping between entities and DTOs
- Save employee data to the database
- Retrieve all employee records
- Retrieve partial employee record by ID
- Retrieve partial employee record by first name


## Getting Started

## Requirements

- Java 11 or later
- Maven 3.6.3 or later
- postgreSQL Database (for testing purposes)



### Installation
1. Clone the repository:
   ```sh
   git clone [https://github.com/yourusername/your-repo-name.git](https://github.com/KoushalKumar22/Springboot-Dto-Projection-with-ModelMapper.git)
   cd Springboot-Dto-Projection-with-ModelMapper
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: '/test'

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save Employee
- URL: '/save'
- Method: POST
- Description: Save a new employee record to the database
- Request Body: json in postman
  ```sh
    {
    "id": 1,
    "fname": "koushal",
    "lname": "kumar",
    "sal": 5000,
    "city": "city"
    }

3. Get All Employee Records
- URL: '/all'
- Method: GET
- Description: Retrieve all employee records from the database
- Response: A list of Employee objects

  
4. Get Employee by ID
- URL: '/id/{id}'
- Method: GET
- Description: Retrieve an Employee record by its ID
- Response: An SearchDto object

5. Get Employee by fname
- URL: '/name/{name}'
- Method: GET
- Description: Retrieve an employee record by name
- Response: An SearchDto object


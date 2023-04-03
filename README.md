# AI Art Gallery - Backend

This is the backend repository for the AI Art Gallery project. It provides the RESTful API for the frontend to communicate with the database and models.

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

## Technologies Used

- Java 17
- Spring Boot 3.0.5
- Spring Data
- H2
- Swagger 3
- Maven 3.9.1

## Pre-requsite
- Have Java 17 and Maven 3.9 setup

## Installation

1. Clone the repository: `git clone https://github.com/kunalsaxena/aiart-backend.git`
2. Run `mvn clean install` and download all required dependencies
3. Run the project using command: `mvn spring-boot:run`

## Usage

1. Application will start on port 8080. Check: `http://localhost:8080`
2. Access H2 data console at `http://localhost:8080/h2-ui`
2. Access Swagger UI at `http://localhost:8080/swagger-ui.html`
2. Access Open API docs at `http://localhost:8080/api-docs`

<!-- ## API Endpoints

### Authentication

- `POST /auth/signup`: Create a new user account. Request body:

```json
{
  "username": "example_user",
  "password": "example_password"
}
```
## Support


## Roadmap


## Contribution Guideline 
 -->

## Authors and acknowledgment
* https://github.com/kunalsaxena

## Useful Reference Links
* react hooks - https://www.freecodecamp.org/news/introduction-to-react-hooks

## License
This project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).

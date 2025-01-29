# Spring Auth API

This project is a Spring Boot application that provides authentication and authorization functionalities.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JPA/Hibernate
- SQL
- Gradle

## Project Structure

- `src/main/java/com/henriquerohden/springauthapi/`
  - `User.java`: Entity representing a user in the system.
  - `Authority.java`: Entity representing an authority (role) in the system.
  - `ApplicationUserDetailsService.java`: Service for loading user-specific data.

## Getting Started

### Prerequisites

- Java 11 or higher
- Gradle
- A SQL database (e.g., MySQL, PostgreSQL)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/hrohden/spring-auth-api.git
    cd spring-auth-api
    ```

2. Configure the database connection in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Build the project:
    ```sh
    ./gradlew build
    ```

4. Run the application:
    ```sh
    ./gradlew bootRun
    ```

## Usage

The application provides endpoints for user authentication and authorization. You can use tools like Postman or curl to interact with the API.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License.
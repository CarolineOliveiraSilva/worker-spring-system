# Worker Contract System (Spring Boot API)

REST API developed in Java with Spring Boot for managing workers, departments, and hourly contracts, persisting data in an in-memory database (H2). 

This repository represents the evolution of a pure Java application into a modern corporate architecture utilizing Spring Data JPA, object-relational mapping, and dependency injection.

---

## Technologies Used
- Java 17 / 25
- Spring Boot
- Spring Data JPA / Hibernate
- H2 Database (In-Memory)
- Maven

---

## How to Run the Project

1. Clone the repository:
git clone https://github.com/CarolineOliveiraSilva/worker-spring-system.git

2. Open the project in your IDE (Eclipse / IntelliJ) as an existing Maven project.

3. Execute the main class WorkerApplication.java.

4. Access the H2 database console in your browser:
- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: (leave blank)

---

## Technical Challenges and Troubleshooting

During the development of this Spring Boot version, specific technical behaviors and errors were identified and resolved:

### 1. H2 Console Access Error (DNS_PROB_FINISHED_NXDOMAIN)
- Problem: Attempting to access the console via localhost8080 caused the browser to fail DNS resolution.
- Solution: Corrected the URL syntax to include the required colon and slash: http://localhost:8080/h2-console.

### 2. Attributes Saved as null in tb_hour_contract
- Problem: Entity fields (date, value_per_hour, hours) evaluated to null in database queries despite successful record insertion.
- Solution: Added the mandatory default constructor required by Hibernate, along with a parameterized constructor that properly assigns values via this.date = date instead of leaving an empty implementation.

### 3. Incompatibility Between LocalDate and Legacy Calendar
- Problem: Compilation errors arising from legacy date conversion methods when integrating the modern LocalDate standard.
- Solution: Removed the Calendar object dependency entirely within the income calculation logic, leveraging native LocalDate extraction methods (getYear() and getMonthValue()).



---

## Author
Developed by Caroline Oliveira.

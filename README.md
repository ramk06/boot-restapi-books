# Boot REST API - Books

This is a simple REST API project for managing a collection of books. It is built using **Spring Boot** and demonstrates CRUD (Create, Read, Update, Delete) operations on a list of books. The application is designed as a RESTful service and can be used as a backend for book management systems.

---

## Features
- **Retrieve all books**: Fetch a list of all available books.
- **Retrieve a single book by ID**: Get details of a specific book using its unique ID.
- **Add a new book**: Add a new book to the collection.
- **Update an existing book**: Update the title and author of an existing book.
- **Delete a book**: Remove a book from the collection by its ID.

---

## Prerequisites
Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK)** (version 8 or later)
- **Maven** (for building the project)
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VS Code)

---

## Technologies Used
- **Spring Boot**
- **Java**
- **REST APIs**

---

## Project Structure
```plaintext
src/main/java/com/api/book
├── controller
│   └── BookController.java
├── entities
│   └── Book.java
├── services
│   └── BookService.java
```
- **Controller**: Handles HTTP requests (GET, POST, PUT, DELETE) and maps them to appropriate service methods.
- **Service**: Contains the business logic for managing the book collection.
- **Entities**: Defines the `Book` entity with attributes such as ID, title, and author.

---

## Endpoints
### Base URL: `http://localhost:8080`

### 1. Get All Books
- **Endpoint**: `/books`
- **Method**: `GET`
- **Response**: List of all books

### 2. Get Book by ID
- **Endpoint**: `/books/{id}`
- **Method**: `GET`
- **Path Variable**: `id` (integer)
- **Response**: Book details

### 3. Add a New Book
- **Endpoint**: `/books`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
      "id": 1,
      "title": "Book Title",
      "author": "Author Name"
  }
  ```
- **Response**: Newly added book

### 4. Update a Book
- **Endpoint**: `/books/{id}`
- **Method**: `PUT`
- **Path Variable**: `id` (integer)
- **Request Body**:
  ```json
  {
      "title": "Updated Title",
      "author": "Updated Author"
  }
  ```
- **Response**: Updated book details

### 5. Delete a Book
- **Endpoint**: `/books/{id}`
- **Method**: `DELETE`
- **Path Variable**: `id` (integer)
- **Response**: None

---

## How to Run the Project
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd boot-restapi-books
   ```

2. **Build the Project**:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Test the Endpoints**:
   Used tools like **Postman** to test the API endpoints.

---

## Sample Data
The application comes with preloaded sample data:

| ID  | Title                          | Author |
|------|--------------------------------|--------|
| 2    | Java Complete Reference       | xyz    |
| 3    | Javascript Complete Reference | xyz    |
| 4    | Python Complete Reference     | xyz    |
| 5    | Go Complete Reference         | xyz    |
| 6    | C++ Complete Reference        | xyz    |

---


# Market-API
Java-SpringBoot Market API

Source code repository for an online marketplace API REST built with 
|  SpringBoot | Spring JPA | Hibernate | PostgreSQL |

# The API provides the following features:

- Get all products: Retrieves a list of all products available in the database.
- Add a new product: Adds a new product to the database.
- Update an existing product: Updates an existing product in the database.
- Delete an existing product: Deletes an existing product from the database.
- Get a product by ID: Retrieves a product by its unique identifier.
- Search for products: Searches for products by name, reference, or category.

# Technologies Used

The API is built using the following technologies:

- Java 17: The Java version.
- Spring Boot 3.0.10: A powerful framework for building Java-based web applications.
- Spring Data JPA: Simplifies database access and management.
- Swagger: Provides interactive API documentation.
- Hibernate Validator: For validating data sent in requests.
- Lombok: Reduces repetitive code.
- Cross-Origin Resource Sharing (CORS): Allows cross-domain requests from web applications.
- 
# Endpoints

The API endpoints are as follows:

- PUT /api/v1/product/put/{id}: Updates an existing product.
- POST /api/v1/product/post: Adds a new product.
- GET /api/v1/product/search/{search}: Searches for products by name, reference, or category.
- GET /api/v1/product/id/{id}: Retrieves a product by ID.
- GET /api/v1/product/all: Retrieves all products.
- DELETE /api/v1/product/delete/{id}: Deletes an existing product.







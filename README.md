# 🚀 JDBC CRUD Operations with MySQL

## 📖 Project Overview
This project demonstrates **CRUD (Create, Read, Update, Delete) operations** using **Java JDBC** with a MySQL database.  
It covers establishing a connection, executing SQL queries, handling exceptions, and retrieving results efficiently.

## 🛠️ Technologies Used
- **Java** (JDK 17)
- **MySQL Database**
- **JDBC API**
- **Eclipse/IntelliJ IDEA**
- **Git & GitHub**

## 📂 Database Details
- **Database Name:** `db1`
- **Table Name:** `register`

### 🛢️ Table Schema (`register`)
```sql
CREATE TABLE register (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) NOT NULL
);

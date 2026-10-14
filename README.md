# Teacher Management System

A console-based **Teacher Management System** developed using Java, Hibernate ORM, and MySQL. This project allows users to manage teacher records through CRUD operations.

## 🚀 Features

- **Add Teacher** – Add new teacher details to the database.
- **View All Teachers** – Display all registered teacher records.
- **Search Teacher by ID** – Retrieve a teacher's details using their ID.
- **Update Teacher** – Modify existing teacher information.
- **Delete Teacher** – Remove a teacher record from the database.
- **Database Integration** – Store and manage records using MySQL.
- **Hibernate ORM** – Perform database operations using Hibernate.
- **Menu-Driven Interface** – Interact with the application through a console menu.

## 🛠️ Technologies Used

- Java
- Hibernate ORM 5.6.4.Final
- MySQL
- JDBC
- JPA Annotations
- Eclipse IDE
- Git and GitHub

## 📂 Project Structure

```text
Teacher-Management-System/
├── src/
│   ├── DAO/
│   │   └── Dao.java
│   ├── DAOImpl/
│   │   └── Daoimpl.java
│   ├── DTO/
│   │   └── Teacher.java
│   └── Main/
│       └── TeacherMain.java
├── lib/
│   └── Hibernate and MySQL dependency JARs
├── .gitignore
└── README.md
```

## 🗄️ Database Configuration

1. Install MySQL and start the MySQL server.
2. Create the database:

```sql
CREATE DATABASE college_management_system;
```

3. Configure the database connection in `hibernate.cfg.xml` with your MySQL username, password, URL, and Hibernate dialect.
4. Ensure Hibernate is configured with `hibernate.hbm2ddl.auto` set to `update` if you want Hibernate to create or update the mapped table schema.

**Security:** Do not commit database passwords or other credentials to a public repository. Keep local credentials out of version control.

## ▶️ How to Run

1. Clone or download this repository.
2. Open the project in Eclipse IDE.
3. Add the required Hibernate and MySQL Connector JAR files to the project build path.
4. Configure the MySQL connection.
5. Run `TeacherMain.java`.
6. Select an option from the menu to add, view, search, update, or delete teacher records.

## 📋 Teacher Details

The system manages the following information:

- Teacher ID
- Name
- Email
- Contact Number
- Gender
- Subject
- Salary

## 🎯 Learning Outcomes

- Understanding Hibernate ORM and JPA annotations.
- Implementing CRUD operations in Java.
- Applying the DAO and DTO design patterns.
- Connecting a Java application to MySQL.
- Managing database records through a menu-driven application.

## 👨‍💻 Author

**Ephraim Christopher**

GitHub: [Chris-dot-tech](https://github.com/Chris-dot-tech)

## 📄 License

This project is intended for educational and learning purposes.

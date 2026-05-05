<div align="center">

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
<img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" alt="MIT License"/>
<img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge" alt="Active"/>
<img src="https://img.shields.io/badge/Version-1.0.0-informational?style=for-the-badge" alt="Version"/>

<br/><br/>

<h1>🎓 Student Management System</h1>

<p><strong>A robust, console-based academic management system built in Java.</strong><br/>
Designed to streamline student records, course advising, and administrative operations for academic institutions.</p>

<a href="#-overview">Overview</a> •
<a href="#-features">Features</a> •
<a href="#-project-structure">Structure</a> •
<a href="#-getting-started">Getting Started</a> •
<a href="#-usage">Usage</a> •
<a href="#-contributing">Contributing</a>

<br/>

---

</div>

## 📌 Overview

The **Student Management System** is a Java console application that allows administrators to manage student records and course registrations through a clean, menu-driven interface. Data is persisted locally using flat-file storage, making the system lightweight and dependency-free.

> **Built for:** Academic administrators who need a simple, fast, and reliable tool to manage student and course data without the overhead of a database or web interface.

---

## ✨ Features

| Feature | Description |
|---|---|
| 🔐 **Admin Authentication** | Secure credential-based login before accessing any functionality |
| 👥 **View All Students** | List every registered student with their full profile |
| ➕ **Add Student** | Register new students with ID, name, program, batch, and CGPA |
| 🔍 **Student Lookup** | Instantly retrieve a student's profile by their unique ID |
| 📚 **Course Advising** | Assign courses to students with title and credit information |
| 📋 **Course View** | See the full list of courses assigned to any student |

---

## 🗂️ Project Structure

```
StudentManagementSystem/
│
├── 📄 Main.java                        # Application entry point & menu loop
│
├── 📁 controller/
│   ├── authentication.java             # Admin login & credential validation
│   ├── StudentController.java          # CRUD operations for student records
│   └── CourseController.java           # Course assignment & retrieval logic
│
├── 📁 model/
│   ├── student.java                    # Student entity (id, name, program, cgpa...)
│   └── Advising.java                   # Course advising entity (studentId, courseId...)
│
└── 📁 files/                           # Flat-file data storage
    ├── admin.txt                       # Admin credentials
    ├── students.txt                    # Student records
    └── courses.txt                     # Course advising records
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- **Java JDK 8+** — [Download here](https://www.oracle.com/java/technologies/downloads/)
- A Java IDE such as **IntelliJ IDEA**, **Eclipse**, or **VS Code** *(optional but recommended)*

### Installation & Setup

**1. Clone the repository**
```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

**2. Compile the source files**
```bash
javac -d out src/Main.java src/controller/*.java src/model/*.java
```

**3. Run the application**
```bash
java -cp out Main
```

> 💡 **Using an IDE?** Simply import the project, mark `src/` as the sources root, and run `Main.java` directly.

---

## 🔐 Default Admin Credentials

| Field    | Value   |
|----------|---------|
| Username | `admin` |
| Password | `123`   |

> ⚠️ **Security Notice:** The default credentials are stored in plain text in `src/files/admin.txt`. Change them immediately before sharing or deploying this project. For production use, consider implementing hashed password storage.

---

## 📖 Usage

After a successful login, you will be presented with the **Admin Dashboard**:

```
--------------------------------------------------------------------
Welcome to the admin dashboard and select an option for next steps
1. See all students
2. Add Student
3. See Student By Id
4. Assign Course to a student
5. See courses by Student Id
6. Exit
--------------------------------------------------------------------
```

### 1️⃣ View All Students
Select option `1` to print a complete list of all registered students.

---

### 2️⃣ Add a New Student
Select option `2` and enter student data as a **comma-separated string**:

```
<id>,<name>,<program>,<batch>,<password>,<cgpa>
```

**Example:**
```
104,John Doe,BSc,CSE,pass123,3.75
```

---

### 3️⃣ Search Student by ID
Select option `3` and enter the student's ID to retrieve their full profile.

---

### 4️⃣ Assign a Course to a Student
Select option `4` and enter the advising data as a **comma-separated string**:

```
<studentId>,<courseId>,<courseTitle>,<courseCredit>
```

**Example:**
```
104,CSE201,Data Structures,3
```

---

### 5️⃣ View Courses by Student ID
Select option `5` and enter a student's ID to see all courses currently assigned to them.

---

## 💾 Data Storage

All application data is stored as plain text in the `src/files/` directory. Each file follows a simple CSV-like format:

### `admin.txt` — Admin credentials
```
username,password
```

### `students.txt` — Student records
```
id,name,program,batch,password,cgpa
```
**Example:**
```
100,rafin,BSc,CSE,12344,3.5
101,rased,BA,BBA,1234,3.8
```

### `courses.txt` — Course advising records
```
studentId,courseId,courseTitle,courseCredit
```
**Example:**
```
100,CSE101,Fundamental CSE,3
101,CSE102,Programming Language,3
```

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Java SE** | Core application language |
| **Java I/O** (`BufferedReader` / `BufferedWriter`) | File-based data persistence |
| **Scanner** | Console-based user input handling |
| **MVC-style Architecture** | Separation of concerns (`model/`, `controller/`) |

---

## 🔮 Potential Improvements

- [ ] 🔒 Hash admin passwords using `BCrypt` or `SHA-256`
- [ ] 🗄️ Replace flat-file storage with a relational database (e.g., SQLite, MySQL)
- [ ] 🖥️ Build a GUI using Java Swing or JavaFX
- [ ] 👤 Add student-facing login with personalized dashboards
- [ ] ✏️ Add update and delete operations for students and courses
- [ ] 📊 Generate GPA and enrollment reports

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. **Fork** the repository
2. **Create** your feature branch
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit** your changes
   ```bash
   git commit -m "feat: add amazing feature"
   ```
4. **Push** to the branch
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open** a Pull Request

Please make sure your code follows clean Java conventions and is well-commented.

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<div align="center">

Made with ❤️ in Java

⭐ **If you found this project helpful, please give it a star!** ⭐

</div>

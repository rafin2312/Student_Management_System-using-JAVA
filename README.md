<div align="center">

<!-- Animated Header Banner -->
<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:1a1a2e,50:16213e,100:0f3460&height=200&section=header&text=Student%20Management%20System&fontSize=42&fontColor=e94560&fontAlignY=38&desc=Java%20Console%20Application%20%7C%20Academic%20Records%20%26%20Course%20Management&descSize=16&descAlignY=58&descColor=a8dadc&animation=fadeIn"/>

<br/>

<!-- Badges Row 1 -->
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Version-1.0.0-e94560?style=for-the-badge&logo=git&logoColor=white"/>
<img src="https://img.shields.io/badge/License-MIT-0f3460?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Status-Active-2ecc71?style=for-the-badge&logo=statuspage&logoColor=white"/>
<img src="https://img.shields.io/badge/Platform-Console-a8dadc?style=for-the-badge&logo=windows-terminal&logoColor=black"/>

<br/><br/>

<!-- Badges Row 2 -->
<img src="https://img.shields.io/badge/Architecture-MVC-blueviolet?style=flat-square"/>
<img src="https://img.shields.io/badge/Storage-File--Based-orange?style=flat-square"/>
<img src="https://img.shields.io/badge/University-Southeast%20University-red?style=flat-square"/>
<img src="https://img.shields.io/badge/Department-CSE-blue?style=flat-square"/>

<br/><br/>

<!-- Navigation -->
[![Features](https://img.shields.io/badge/─%20Features%20─-1a1a2e?style=for-the-badge)](#-features)
[![Structure](https://img.shields.io/badge/─%20Structure%20─-16213e?style=for-the-badge)](#️-project-structure)
[![Setup](https://img.shields.io/badge/─%20Setup%20─-0f3460?style=for-the-badge)](#-getting-started)
[![Usage](https://img.shields.io/badge/─%20Usage%20─-e94560?style=for-the-badge)](#-usage)

</div>

---

## 📌 Overview

> **The Student Management System** is a lightweight, console-based Java application designed to help academic administrators efficiently manage student records and course registrations — no database, no dependencies, just pure Java.

Built with a clean **MVC-style architecture**, it separates data, business logic, and presentation into distinct layers, making the codebase easy to maintain, test, and extend.

```
👨‍💼 Admin logs in  →  📋 Dashboard  →  👥 Manage Students  →  📚 Assign Courses  →  📊 View Reports
```

---

## ✨ Features

<div align="center">

| 🔐 | **Secure Admin Login** | Credential-based authentication before any operation |
|---|---|---|
| 👥 | **View All Students** | Paginated list of every student with full profile details |
| ➕ | **Register Student** | Add new students with ID, name, program, batch & CGPA |
| 🔍 | **Student Lookup** | Instantly find any student by their unique ID |
| 📚 | **Course Advising** | Assign courses with code, title, and credit hours |
| 📋 | **Course History** | View every course assigned to a specific student |

</div>

---

## 🗂️ Project Structure

```
📦 StudentManagementSystem/
│
├── 🟠 Main.java                          ← Entry point & interactive menu loop
│
├── 📁 controller/
│   ├── 🔵 authentication.java            ← Admin credential validation
│   ├── 🔵 StudentController.java         ← Student CRUD (add, read, search)
│   └── 🔵 CourseController.java          ← Course assignment & retrieval
│
├── 📁 model/
│   ├── 🟢 student.java                   ← Student entity & getters/setters
│   └── 🟢 Advising.java                  ← Course advising entity
│
└── 📁 files/                             ← 💾 Persistent flat-file storage
    ├── 📄 admin.txt                      ← Admin credentials
    ├── 📄 students.txt                   ← Student records database
    └── 📄 courses.txt                    ← Course advising records
```

---

## 🚀 Getting Started

### ⚙️ Prerequisites

| Requirement | Version | Link |
|---|---|---|
| ☕ Java JDK | 8 or higher | [Download](https://www.oracle.com/java/technologies/downloads/) |
| 💻 IDE *(optional)* | Any | IntelliJ IDEA / Eclipse / VS Code |

### 📥 Installation

**Step 1 — Clone the repository**
```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

**Step 2 — Compile all source files**
```bash
javac -d out src/Main.java src/controller/*.java src/model/*.java
```

**Step 3 — Launch the application**
```bash
java -cp out Main
```

> 💡 **IDE Users:** Import the project → mark `src/` as Sources Root → Run `Main.java`

---

## 🔐 Default Admin Credentials

<div align="center">

| 🧾 Field | 🔑 Value |
|:---:|:---:|
| Username | `admin` |
| Password | `123` |

</div>

> ⚠️ **Security Warning:** Credentials are stored as plain text in `src/files/admin.txt`. Update them immediately before sharing or deploying. For production, implement `SHA-256` or `BCrypt` password hashing.

---

## 📖 Usage

Once authenticated, the **Admin Dashboard** greets you:

```
╔══════════════════════════════════════════════════════════════╗
║        Welcome to the Admin Dashboard — Java Academy         ║
╠══════════════════════════════════════════════════════════════╣
║  1. 👥  See all students                                     ║
║  2. ➕  Add Student                                          ║
║  3. 🔍  See Student By ID                                    ║
║  4. 📚  Assign Course to a Student                           ║
║  5. 📋  See Courses by Student ID                            ║
║  6. 🚪  Exit                                                 ║
╚══════════════════════════════════════════════════════════════╝
```

<details>
<summary><b>➕ Option 2 — Add a New Student</b></summary>

Enter data as a comma-separated string in this exact format:

```
<id>,<name>,<program>,<batch>,<password>,<cgpa>
```

✅ **Example:**
```
104,John Doe,BSc,CSE,pass123,3.75
```
</details>

<details>
<summary><b>📚 Option 4 — Assign a Course</b></summary>

Enter advising data as a comma-separated string in this exact format:

```
<studentId>,<courseId>,<courseTitle>,<courseCredit>
```

✅ **Example:**
```
104,CSE201,Data Structures,3
```
</details>

<details>
<summary><b>🔍 Option 3 & 5 — Lookup by ID</b></summary>

Simply enter the student's numeric ID when prompted:

```
Enter student id: 104
→ Id: 104  Name: John Doe  Program: BSc  Batch: CSE  CGPA: 3.75
```
</details>

---

## 💾 Data Storage Schema

All data lives in `src/files/` as human-readable CSV files:

### 📄 `admin.txt`
```csv
username,password
admin,123
```

### 📄 `students.txt`
```csv
id,name,program,batch,password,cgpa
100,rafin,BSc,CSE,12344,3.5
101,rased,BA,BBA,1234,3.8
103,rasel,BSc,CSE,12344,3.2
```

### 📄 `courses.txt`
```csv
studentId,courseId,courseTitle,courseCredit
100,CSE101,Fundamental CSE,3
100,ENG101,Basic English,3
101,CSE102,Programming Language,3
```

---

## 🛠️ Tech Stack

<div align="center">

| Layer | Technology | Role |
|---|---|---|
| 🟠 Language | Java SE | Core application logic |
| 🔵 I/O | `BufferedReader` / `BufferedWriter` | File-based persistence |
| 🟢 Input | `Scanner` | Console interaction |
| 🟣 Pattern | MVC Architecture | Separation of concerns |

</div>

---

## 🔮 Roadmap & Future Improvements

```
Phase 1 — Security
```
- [ ] 🔒 Hash passwords with `SHA-256` or `BCrypt`
- [ ] 🛡️ Input sanitization & validation layer

```
Phase 2 — Data Layer
```
- [ ] 🗄️ Migrate to SQLite or MySQL database
- [ ] 💾 Implement proper CRUD with update & delete

```
Phase 3 — Interface
```
- [ ] 🖥️ Build a GUI using Java Swing or JavaFX
- [ ] 👤 Add student-facing portal with personalized login

```
Phase 4 — Reporting
```
- [ ] 📊 Generate GPA and enrollment reports
- [ ] 📤 Export data to PDF or Excel

---

## 🤝 Contributing

All contributions are welcome! Here's how:

```bash
# 1. Fork the repo and clone it
git clone https://github.com/your-username/student-management-system.git

# 2. Create a feature branch
git checkout -b feature/your-feature-name

# 3. Commit with conventional commit style
git commit -m "feat: add your amazing feature"

# 4. Push and open a Pull Request
git push origin feature/your-feature-name
```

> Please follow clean Java coding conventions, add comments where needed, and ensure your changes don't break existing functionality.

---

## 👨‍💻 Author

<div align="center">

<br/>

<img src="https://img.shields.io/badge/Developer-MD.%20Kamran%20Hasan%20Rafin-e94560?style=for-the-badge&logo=java&logoColor=white"/>

<br/><br/>

| 🏷️ Field | 📋 Details |
|:---|:---|
| 👤 **Name** | MD. Kamran Hasan Rafin |
| 🎓 **Student ID** | 2022000000066 |
| 🏛️ **University** | Southeast University |
| 📚 **Department** | Computer Science & Engineering (CSE) |

<br/>

[![GitHub](https://img.shields.io/badge/GitHub-your--username-181717?style=for-the-badge&logo=github)](https://github.com/your-username)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/your-profile)

</div>

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for full details.

---

<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:e94560,50:0f3460,100:1a1a2e&height=120&section=footer&text=Thank%20You%20for%20Visiting!&fontSize=24&fontColor=a8dadc&fontAlignY=65&animation=fadeIn"/>

<br/>

⭐ **If this project helped you, please give it a star — it means a lot!** ⭐

<br/>

*© 2024 MD. Kamran Hasan Rafin — Southeast University, Department of CSE*

</div>


# 📚 Bookstore API Test Automation Framework

This repository contains an automated testing framework for a FastAPI-based bookstore application. The automation is implemented in **Java** using **RestAssured**, **Cucumber (BDD)**, and **Allure Reports**, with CI/CD integration via **GitHub Actions**.

---

## 🧱 Tech Stack

| Layer            | Technology             |
|------------------|------------------------|
| API Backend      | FastAPI                |
| API Automation   | Java + RestAssured     |
| Test Framework   | Cucumber (BDD)         |
| Reports          | Allure Reports         |
| Build Tool       | Maven                  |
| CI/CD            | GitHub Actions         |

---

## 📁 Project Structure
```
bookstore-api-test
├── .github/                    # GitHub Actions workflow
├── bookstore-main/            # FastAPI backend server
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── api/           # API request classes
│   │       │   ├── BooksApi.java
│   │       │   └── UserApi.java
│   │       ├── constants/     # API endpoints
│   │       │   └── EndPoints.java
│   │       ├── data/          # Data classes
│   │       │   └── BookStoreData.java
│   │       ├── models/        # POJOs for responses
│   │       │   └── UserResponseModel.java
│   │       └── utils/         # Configuration utilities
│   │           └── ConfigLoader.java
│   └── test/
│       ├── java/
│       │   ├── Hooks/         # Test hooks (before/after)
│       │   │   └── CucumberHooks.java
│       │   ├── Runner/        # Cucumber runner class
│       │   │   └── CucumberRunner.java
│       │   └── Steps/         # Step definitions
│       │       └── UserStepDefs.java
│       └── resources/         # Feature files, configs
├── target/                    # Compiled test results
│   ├── allure-report/
│   ├── allure-results/
│   └── ...
├── pom.xml                    # Maven configuration
└── README.md                  # Project instructions
```




## ✅ Features

- Validate FastAPI bookstore endpoints (Books, Users, etc.)
- Supports both **positive and negative** API test cases
- Uses **Cucumber** for BDD-style tests
- Integrates **Allure Reports** for rich HTML reporting
- Supports **request chaining**, **response validations**, **header checks**, and **error handling**
- **CI/CD pipeline** using GitHub Actions

---

## 🚀 Setup & Execution

### 1. Clone the Repo


git clone https://github.com/stiwari92/bookstore-api-automation
cd bookstore-api-test

### 2. Backend Server (Automated)

No need to start the FastAPI server manually. It's launched automatically before the tests begin using Java ProcessBuilder.

Example code:
```java
ProcessBuilder pb = new ProcessBuilder("uvicorn", "main:app", "--reload");
pb.directory(new File("bookstore-main"));
pb.redirectErrorStream(true);
```

### 3. Start the FastAPI Server:

    cd bookstore-main

    pip install -r requirements.txt

    uvicorn main:app --reload
### 4. Run API Tests

    Go to root directory
    mvn clean test
## 📊 Generate Allure Reports
After test execution

    allure serve target/allure-results

👉 Ensure Allure is installed: Allure Installation Guide

## 🔄 GitHub Actions
CI/CD pipeline is configured in .github/workflows/ for:

Running tests on pull requests and pushes to main

Publishing Allure Reports as build artifacts

## 🔧 Configuration
API base URL and other configs: ConfigLoader.java

Endpoint paths/constants: EndPoints.java

## 📌 Future Improvements
Add database validation layer

Add contract testing with Swagger schema

Export Postman collection for external use

## 👨‍💻 Contributors

Suraj Tiwari – Automation Framework Developer, Quality Engineer
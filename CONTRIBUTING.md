# Contributing to Starting Out with Java

Thank you for your interest in contributing to **Starting Out with Java**! This repository is a learning hub for Java beginners and intermediate learners, featuring practice codes, a textbook, and Spring Boot resources. We welcome contributions to enhance the learning experience, whether you’re adding new Java examples, improving Spring Boot notes, or sharing code implementations.

## How to Contribute

Follow these steps to contribute to the project:

### 1. Fork the Repository

- Fork the repository to your GitHub account by clicking the "Fork" button at the top of the repository page.
- Clone your fork to your local machine:

  ```bash
  git clone https://github.com/4f74b/Starting-out-with-java.git
  ```

### 2. Set Up Your Environment

- Ensure you have the necessary tools:
  - Java Development Kit (JDK) 17 or later.
  - An IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
  - Maven or Gradle for Spring Boot projects.
  - A PDF reader for the textbook (`book/Starting-Out-With-Java.pdf`).
  - Microsoft Word or a compatible viewer for Spring Boot notes (`Spring Boot/learning material/Notes.docx`).
- Test existing sample codes in `sample-codes/` or Spring Boot projects in `Spring Boot/Implements/` to understand the project structure.

### 3. Create a Branch

- Create a new branch for your changes:

  ```bash
  git checkout -b feature/<your-feature-name>
  ```
- Use descriptive branch names, e.g., `feature/add-array-example` or `feature/update-spring-boot-notes`.

### 4. Make Your Changes

We welcome contributions in the following areas:

- **Sample Codes (**`sample-codes/`**)**:
  - Add new Java practice codes (`.java` files) for beginners, covering topics like loops, arrays, OOP, or exception handling.
  - Include comments explaining the code’s purpose and functionality.
  - Example structure:

    ```java
    // File: ArrayExample.java
    // Demonstrates basic array operations
    public class ArrayExample {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }
    ```
- **Spring Boot (**`Spring Boot/Implements/`**)**:
  - Add new Spring Boot projects or code snippets (e.g., REST APIs, CRUD operations).
  - Ensure projects include a `pom.xml` (Maven) or `build.gradle` (Gradle) file and clear instructions in a `README.md` within the folder.
- **Learning Material (**`Spring Boot/learning material/`**)**:
  - Update or expand `Notes.docx` with new Spring Boot concepts, tips, or tutorials.
  - Optionally, convert sections to Markdown (`.md`) for better accessibility.
- **Documentation**:
  - Improve the main `README.md` or add `README.md` files in subdirectories for clarity.
  - Fix typos or enhance explanations in existing files.

### 5. Commit Your Changes

- Write clear, concise commit messages:

  ```bash
  git add .
  git commit -m "Add array manipulation example in sample-codes"
  ```
- Ensure your code is well-documented and follows Java best practices (e.g., meaningful variable names, proper indentation).

### 6. Push and Create a Pull Request

- Push your branch to your fork:

  ```bash
  git push origin feature/<your-feature-name>
  ```
- Open a Pull Request (PR) on the main repository:
  - Go to the repository and click "Compare & pull request."
  - Provide a clear PR title and description, e.g.:
    - **Title**: Add Array Manipulation Example
    - **Description**: Added `ArrayExample.java` to `sample-codes/` with comments explaining array iteration and basic operations.
  - Reference any related issues (e.g., `Fixes #12`).

### 7. Code Review

- Maintainers will review your PR and may request changes.
- Respond to feedback promptly and make updates as needed.
- Once approved, your changes will be merged into the main branch.

## Contribution Guidelines

- **Follow the Code of Conduct**: Adhere to our Code of Conduct to ensure a respectful and inclusive environment.
- **Keep It Simple**: Contributions should be clear and beginner-friendly, as this project targets learners.
- **Test Your Code**: Ensure Java code compiles and runs without errors. For Spring Boot projects, verify functionality locally.
- **File Organization**:
  - Place Java practice codes in `sample-codes/`.
  - Place Spring Boot projects in `Spring Boot/Implements/`.
  - Place documentation updates in the relevant folder or root.
- **License Compliance**: All contributions must comply with the Apache License 2.0. Include the Apache License boilerplate in new source files:

  ```java
  /*
   * Copyright 2025 Aftab Alam
   * Licensed under the Apache License, Version 2.0 (the "License");
   * you may not use this file except in compliance with the License.
   * You may obtain a copy of the License at
   *     http://www.apache.org/licenses/LICENSE-2.0
   * Unless required by applicable law or agreed to in writing, software
   * distributed under the License is distributed on an "AS IS" BASIS,
   * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   * See the License for the specific language governing permissions and
   * limitations under the License.
   */
  ```

## Reporting Issues

- If you find bugs, typos, or have suggestions, open an issue on the Issues page.
- Use a clear title and describe the problem or idea in detail.

## Questions?

If you have questions or need help, open an issue or email the maintainers at alamaftab413@gmail.com

## Thank You!

Your contributions help make **Starting Out with Java** a better resource for learners worldwide. Let’s build an awesome Java learning community together! 🚀
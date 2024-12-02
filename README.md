# Automating a "Contact Us" Form Using Selenium  

This project demonstrates how to automate the process of interacting with and submitting a "Contact Us" form on a website using **Selenium**, **Java**, and **TestNG**. It covers handling input fields, dropdown selections, checkboxes, and form submission.  

---

## 🛠 Prerequisites  

1. **Java** installed on your system.  
2. **Selenium** and **TestNG** libraries added to your project.  
3. A Maven-based project setup with the required dependencies (e.g., Selenium WebDriver, TestNG) added in the `pom.xml` file.  

---

## 🚀 Steps to Automate the Task  

### 1️⃣ Environment Setup  
- Install Java, Selenium, and TestNG.  
- Create a Maven project in your IDE and include the required dependencies.  

### 2️⃣ Writing the Script  
1. Create a new package under `src/test/java` named `Assessment`.  
2. Inside the package, create a Java class to write your Selenium test script.  

### 3️⃣ Automation Tasks  

#### **Input Fields**:  
- Fill in the following fields using appropriate locators (`id`, `name`, `class`, `XPath`):  
  - **First Name**  
  - **Last Name**  
  - **Email Address**  
  - **Company Name**  

#### **Dropdown Selection**:  
- Select **"India"** from the country dropdown.  

#### **Checkbox Selection**:  
- Select all the checkboxes available on the form.  

#### **Add a Message**:  
- Type a custom message into the text area provided for comments.  

#### **Form Submission**:  
- Click the **Submit** button to complete the form submission.  

#### **Close the Browser**:  
- After submitting the form, close the browser window to complete the task.  

---

## 🧩 Additional Notes  
- This project is an excellent way to learn how to interact with web elements programmatically.  
- For a real-world use case, ensure proper exception handling and validations in your script.  

---

## 📢 Share Your Experience  
Have you automated similar scenarios? Feel free to fork this project, make your modifications, and share your version!  

---

Happy Testing! 🚀


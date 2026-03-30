

# Week 3 – API Chaining, Dynamic Data Handling & End‑to‑End Flow

`https://img.shields.io/badge/Java-17-blue`
`https://img.shields.io/badge/Maven-3.9.6-orange`
`https://img.shields.io/badge/TestNG-7.10.2-green`
`https://img.shields.io/badge/RestAssured-5.4.0-lightgrey`

## 🎯 Objective  
Week 3 focuses on building complete end‑to‑end API workflows using chaining. The goal is to take the output of one API and use it directly in the next request. This week strengthens skills in extracting dynamic values from responses, passing tokens and IDs across requests, validating multi‑step flows, and simulating real user journeys instead of isolated API calls.

---

## 📂 Project Structure (Screenshot)  
*(Screenshot will be added later)*

---

## ⚙️ Tech Stack  
- Java 17  
- Maven 3.9.6  
- RestAssured 5.4.0  
- TestNG 7.10.2  

---

## 🔗 What This Week Covers  
This week demonstrates how to chain multiple API calls together to form a complete CRUD flow. The process begins with authentication, where a login request returns a token. This token is extracted and reused in all subsequent requests. After authentication, a new employee is created and the employee ID returned from that request becomes the input for the next step. The same employee is then retrieved, updated, and finally deleted, completing the full lifecycle using dynamic data captured at runtime. TestNG dependencies ensure that each step runs only after the previous one succeeds, making the entire flow behave like a real application journey.

---

## ▶️ How to Run  
Clone the repo and execute:

```bash
mvn clean test
```

---

"# week3-testng-concepts" 

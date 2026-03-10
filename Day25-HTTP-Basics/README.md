# 🌐 Day 25 — HTTP Basics

Part of my **30-Day Java Backend Preparation Roadmap**

## 📚 Topics Covered

- HTTP Protocol
- Request–Response Cycle
- HTTP Methods
- HTTP Status Codes
- HTTP Headers

---

## 🌍 What is HTTP?

HTTP (HyperText Transfer Protocol) is the communication protocol used between a **client** and a **server** on the web.

Example:

Client → HTTP Request → Server  
Server → HTTP Response → Client

HTTP is **stateless**, meaning each request is independent.

---

## 🔄 Request–Response Cycle

1. Client sends an HTTP request  
2. Server processes the request  
3. Server sends an HTTP response  

Example:

GET /users

Response:

200 OK  
User data returned

---

## ⚙️ HTTP Methods

| Method | Purpose |
|------|------|
| GET | Retrieve data |
| POST | Create new resource |
| PUT | Update resource |
| PATCH | Partial update |
| DELETE | Remove resource |

---

## 📊 HTTP Status Codes

| Code | Meaning |
|------|------|
| 200 | OK |
| 201 | Created |
| 400 | Bad Request |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |
| 500 | Internal Server Error |

---

## 🧾 HTTP Headers

Headers provide additional information about requests and responses.

Examples:

- Content-Type
- Authorization
- User-Agent
- Cache-Control

---

## 🎯 Key Takeaways

- HTTP is the foundation of web communication
- Uses a request–response model
- HTTP methods define actions on resources
- Status codes indicate request results
- Headers provide metadata

---

## 🚀 Next Step

Day 26 — Servlet Basics

# CSA09-192524131-Assignment3
**Course:** Programming in Java (CSA09) | SIMATS Engineering  
**Course Outcome:** CO3: Exception Handling & Multithreading  
**Assignment:** Assignment 3 – Robustness & Concurrency Engineering  
**Student Name:** ABISHEK J  
**Registration Number:** 192524131  
**Java Version:** OpenJDK 21 LTS (Hotspot 21.0.13)  
**Submission Repository Link:** https://github.com/ABISHEK192524131/CSA09-192524131-Assignment3  

---

## Repository Structure & Task Folders

Each task is maintained in an independent folder containing the Java source code, input configuration files, terminal execution logs, and output screenshots:

```
CSA09-192524131-Assignment3/
│
├── README.md                           <- Repository documentation & build guide
├── Q1/
│   ├── BankATM.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q2/
│   ├── StorageDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q3/
│   ├── ResourceSafetyDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q4/
│   ├── ThreadLifeCycleDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q5/
│   ├── SeatBooking.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q6/
│   ├── TokenCounter.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── Q7/
│   ├── ResilientExamProcessor.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
```

---

## Progressive Commit History

In accordance with university examination guidelines, all tasks were executed and committed progressively:

| Commit # | Task Folder | Commit Message | Verified Status |
|:---:|:---|:---|:---:|
| 1 | `Q1` | `feat(Q1): Implement Bank ATM Exception Model` | PASSED |
| 2 | `Q2` | `feat(Q2): Implement Exam Portal Exception Chaining` | PASSED |
| 3 | `Q3` | `feat(Q3): Implement Resource Safety & Try-with-Resources` | PASSED |
| 4 | `Q4` | `feat(Q4): Implement Thread Life Cycle State Machine` | PASSED |
| 5 | `Q5` | `feat(Q5): Implement Seat Booking Race Condition Fix` | PASSED |
| 6 | `Q6` | `feat(Q6): Implement Deadlock Prevention TokenCounter` | PASSED |
| 7 | `Q7` | `feat(Q7): Implement Concurrent Resilient Processor` | PASSED |

---

## Compilation and Execution Guide

### Prerequisites
- JDK 17+ or OpenJDK 21 LTS installed and added to `PATH`.

### Steps to Compile and Run
Navigate into any task directory and compile using `javac`:
```bash
cd <TaskFolder>
javac <SourceFile>.java
java <MainClass>
```

---
*Verified and submitted by ABISHEK J (Reg No: 192524131).*

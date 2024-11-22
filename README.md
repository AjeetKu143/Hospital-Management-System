# Hospital Management System

## Overview

This **Hospital Management System** allows the management of hospital data including doctors, patients, medicines, staff, and facilities. It provides functionalities to add and display information for each category, making it easier to manage records.

## Features

- **Doctor Section**: Add and display doctors' information.
- **Patient Section**: Add and display patient details.
- **Medicine Section**: Add and display medicines available in the hospital.
- **Facility Section**: Add and display hospital facilities.
- **Staff Section**: Add and display hospital staff details.

---

## Classes and Their Functions

### 1. **Staff Class**

#### Fields:
- `id`: Staff ID.
- `name`: Staff name.
- `designation`: Job title of the staff.
- `gender`: Gender of the staff.
- `salary`: Staff salary.

#### Methods:
- `addStaff()`: Prompts user to input staff details and stores them.
- `displayStaffInfo()`: Displays staff details in a formatted table.

---

### 2. **Doctor Class**

#### Fields:
- `id`: Doctor ID.
- `name`: Doctor's name.
- `specialization`: Area of expertise.
- `timing`: Doctor's available hours.
- `qualification`: Doctor's qualifications.
- `room`: Room number where the doctor is stationed.

#### Methods:
- `addDoctor()`: Prompts user to input doctor details and stores them.
- `displayDoctorInfo()`: Displays doctor details in a formatted table.

---

### 3. **Patient Class**

#### Fields:
- `id`: Patient ID.
- `name`: Patient's name.
- `disease`: Medical condition.
- `gender`: Gender of the patient.
- `admitStatus`: Whether the patient is admitted (Yes/No).
- `age`: Patient's age.

#### Methods:
- `addPatient()`: Prompts user to input patient details and stores them.
- `displayPatientInfo()`: Displays patient details in a formatted table.

---

### 4. **Medicine Class**

#### Fields:
- `name`: Medicine name.
- `company`: Manufacturer's name.
- `expiryDate`: Expiry date of the medicine.
- `cost`: Cost per unit.
- `count`: Quantity of the medicine available.

#### Methods:
- `addMedicine()`: Prompts user to input medicine details and stores them.
- `displayMedicineInfo()`: Displays medicine details in a formatted table.

---

### 5. **Facility Class**

#### Fields:
- `name`: Facility name (e.g., X-ray, Laboratory).

#### Methods:
- `addFacility()`: Prompts user to input facility name and stores it.
- `displayFacility()`: Displays the facility details.

---

## Main Menu

The system displays a main menu with the following options:

1. **Doctor Section**
   - Add New Doctor
   - Display Doctors
2. **Patient Section**
   - Add New Patient
   - Display Patients
3. **Medicine Section**
   - Add New Medicine
   - Display Medicines
4. **Facility Section**
   - Add New Facility
   - Display Facilities
5. **Staff Section**
   - Add New Staff
   - Display Staff
6. **Exit**: Exit the system.

---

## Instructions to Run

1. Clone this repository to your local machine.
2. Compile the Java files:
    ```bash
    javac HospitalManagementSystem.java
    ```
3. Run the program:
    ```bash
    java HospitalManagementSystem
    ```

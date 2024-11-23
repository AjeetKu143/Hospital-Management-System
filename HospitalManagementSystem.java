import java.util.*;

class Staff {
    String id, name, designation, gender;
    int salary;

    void addStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Staff ID: ");
        id = input.nextLine();
        System.out.print("Enter Staff Name: ");
        name = input.nextLine();
        System.out.print("Enter Designation: ");
        designation = input.nextLine();
        System.out.print("Enter Gender: ");
        gender = input.nextLine();
        System.out.print("Enter Salary: ");
        salary = input.nextInt();
    }

    void displayStaffInfo() {
        System.out.printf("%-10s %-20s %-15s %-10s %-10d\n", id, name, designation, gender, salary);
    }
}

class Doctor {
    String id, name, specialization, timing, qualification;
    int room;

    void addDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Doctor ID: ");
        id = input.nextLine();
        System.out.print("Enter Doctor Name: ");
        name = input.nextLine();
        System.out.print("Enter Specialization: ");
        specialization = input.nextLine();
        System.out.print("Enter Timing: ");
        timing = input.nextLine();
        System.out.print("Enter Qualification: ");
        qualification = input.nextLine();
        System.out.print("Enter Room Number: ");
        room = input.nextInt();
    }

    void displayDoctorInfo() {
        System.out.printf("%-10s %-20s %-20s %-20s %-15s %-10d\n", id, name, specialization, timing, qualification, room);
    }
}

class Patient {
    String id, name, disease, gender, admitStatus;
    int age;

    void addPatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        id = input.nextLine();
        System.out.print("Enter Patient Name: ");
        name = input.nextLine();
        System.out.print("Enter Disease: ");
        disease = input.nextLine();
        System.out.print("Enter Gender: ");
        gender = input.nextLine();
        System.out.print("Enter Admit Status (Yes/No): ");
        admitStatus = input.nextLine();
        System.out.print("Enter Age: ");
        age = input.nextInt();
    }

    void displayPatientInfo() {
        System.out.printf("%-10s %-20s %-15s %-10s %-15s %-10d\n", id, name, disease, gender, admitStatus, age);
    }
}

class Medicine {
    String name, company, expiryDate;
    int cost, count;

    void addMedicine() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Medicine Name: ");
        name = input.nextLine();
        System.out.print("Enter Company Name: ");
        company = input.nextLine();
        System.out.print("Enter Expiry Date: ");
        expiryDate = input.nextLine();
        System.out.print("Enter Cost: ");
        cost = input.nextInt();
        System.out.print("Enter Quantity: ");
        count = input.nextInt();
    }

    void displayMedicineInfo() {
        System.out.printf("%-20s %-20s %-15s %-10d %-10d\n", name, company, expiryDate, cost, count);
    }
}

class Facility {
    String name;

    void addFacility() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Facility Name: ");
        name = input.nextLine();
    }

    void displayFacility() {
        System.out.println(name);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, subChoice;

        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();
        ArrayList<Medicine> medicines = new ArrayList<>();
        ArrayList<Facility> facilities = new ArrayList<>();

        while (true) {
            System.out.println("\n" + " ".repeat(50) + "--- Hospital Management System ---\n");
            System.out.println("1. Doctor Section | 2. Patient Section | 3. Medicine Section | 4. Facility Section | 5. Staff Section | 6. Exit\n");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Add New Doctor | 2. Display Doctors");
                    subChoice = input.nextInt();
                    if (subChoice == 1) {
                        Doctor doctor = new Doctor();
                        doctor.addDoctor();
                        doctors.add(doctor);
                    } else if (subChoice == 2) {
                        System.out.printf("%-10s %-20s %-20s %-20s %-15s %-10s\n", "ID", "Name", "Specialization", "Timing", "Qualification", "Room");
                        for (Doctor doctor : doctors) {
                            doctor.displayDoctorInfo();
                        }
                    }
                    break;

                case 2:
                    System.out.println("1. Add New Patient | 2. Display Patients");
                    subChoice = input.nextInt();
                    if (subChoice == 1) {
                        Patient patient = new Patient();
                        patient.addPatient();
                        patients.add(patient);
                    } else if (subChoice == 2) {
                        System.out.printf("%-10s %-20s %-15s %-10s %-15s %-10s\n", "ID", "Name", "Disease", "Gender", "Admit Status", "Age");
                        for (Patient patient : patients) {
                            patient.displayPatientInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("1. Add New Medicine | 2. Display Medicines");
                    subChoice = input.nextInt();
                    if (subChoice == 1) {
                        Medicine medicine = new Medicine();
                        medicine.addMedicine();
                        medicines.add(medicine);
                    } else if (subChoice == 2) {
                        System.out.printf("%-20s %-20s %-15s %-10s %-10s\n", "Name", "Company", "Expiry Date", "Cost", "Quantity");
                        for (Medicine medicine : medicines) {
                            medicine.displayMedicineInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("1. Add New Facility | 2. Display Facilities");
                    subChoice = input.nextInt();
                    if (subChoice == 1) {
                        Facility facility = new Facility();
                        facility.addFacility();
                        facilities.add(facility);
                    } else if (subChoice == 2) {
                        System.out.println("Facilities:");
                        for (Facility facility : facilities) {
                            facility.displayFacility();
                        }
                    }
                    break;

                case 5:
                    System.out.println("1. Add New Staff | 2. Display Staff");
                    subChoice = input.nextInt();
                    if (subChoice == 1) {
                        Staff staff = new Staff();
                        staff.addStaff();
                        staffs.add(staff);
                    } else if (subChoice == 2) {
                        System.out.printf("%-10s %-20s %-15s %-10s %-10s\n", "ID", "Name", "Designation", "Gender", "Salary");
                        for (Staff staff : staffs) {
                            staff.displayStaffInfo();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system. Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

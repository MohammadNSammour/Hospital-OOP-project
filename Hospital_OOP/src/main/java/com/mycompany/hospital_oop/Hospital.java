package com.mycompany.hospital_oop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

enum Gender {
    MALE, FEMALE, UNKNOWN
}

enum BloodType {
    A, B, AB, O, UNKNOWN
}

enum SocialStatus {
    SINGLE, MARRIED, OTHER
}

class Person {

    private int personId;
    private int nationalId;
    private String personName;
    private int personBirthyear;
    private String personLocation;
    private Gender personGender;
    private SocialStatus personSocialStatus;
    private long personPhonenumber;
    private BloodType personBloodType;
    private static int numberOfPersons;

    public Person(int id, String name, int birthYear, String location, Gender gender, SocialStatus socialStatus, long phoneNumber, BloodType bloodType) {
        setNationalID(id);
        setName(name);
        setBirthYear(birthYear);
        setLocation(location);
        setGender(gender);
        setSocialStatus(socialStatus);
        setPhoneNumber(phoneNumber);
        setBloodType(bloodType);
        numberOfPersons++;
        this.personId = 10000 + numberOfPersons;
    }

    public Person() {
        this(19999, "UNKNOWN", 1875, "UNKNOWN", Gender.UNKNOWN, SocialStatus.OTHER, 0, BloodType.UNKNOWN);
    }

    public void setNationalID(int id) {
        if (id > 0) {
            this.nationalId = id;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.personName = name;
        }
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1870) {
            this.personBirthyear = birthYear;
        }
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty()) {
            this.personLocation = location;
        }
    }

    public void setGender(Gender gender) {
        if (gender != null) {
            this.personGender = gender;
        }
    }

    public void setSocialStatus(SocialStatus socialStatus) {
        if (socialStatus != null) {
            this.personSocialStatus = socialStatus;
        }
    }

    public void setPhoneNumber(long phoneNumber) {
        if (phoneNumber > 0) {
            this.personPhonenumber = phoneNumber;
        }
    }

    public void setBloodType(BloodType bloodType) {
        if (bloodType != null) {
            this.personBloodType = bloodType;
        }
    }

    public int getNationalID() {
        return nationalId;
    }

    public int getPersonID() {
        return personId;
    }

    public String getName() {
        return personName;
    }

    public int getBirthYear() {
        return personBirthyear;
    }

    public String getLocation() {
        return personLocation;
    }

    public Gender getGender() {
        return personGender;
    }

    public SocialStatus getSocialStatus() {
        return personSocialStatus;
    }

    public long getPhoneNumber() {
        return personPhonenumber;
    }

    public BloodType getBloodType() {
        return personBloodType;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }

    @Override
    public String toString() {
        return "ID: " + this.getPersonID()
                + "\nNational ID: " + this.getNationalID()
                + "\nName: " + this.getName()
                + "\nBirth year: " + this.getBirthYear()
                + "\nLocation: " + this.getLocation()
                + "\nGender: " + this.getGender()
                + "\nSocial state: " + this.getSocialStatus()
                + "\nPhone Number: " + this.getPhoneNumber()
                + "\nBlood Type: " + this.getBloodType()
                + "\nNumber of Person Objects: " + Person.getNumberOfPersons() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person person)) {
            return false;
        }
        return personId == person.personId && nationalId == person.nationalId && personBirthyear == person.personBirthyear && personPhonenumber == person.personPhonenumber
                && Objects.equals(personName, person.personName) && Objects.equals(personLocation, person.personLocation) && personGender == person.personGender
                && personSocialStatus == person.personSocialStatus && personBloodType == person.personBloodType;
    }
}

class Doctor extends Person {

    private double doctorSalary;
    private String doctorEmail;
    private long doctorWorkPhoneNumber;
    private int doctorDepartmentID;
    private String doctorWorkingHours;
    private String doctorStartDate;
    private String doctorSpecification;
    private double doctorYearsOfExperience;
    private ArrayList<Integer> doctorOperationsID = new ArrayList<>();//
    private static int numberOfDoctors = 0;

    public Doctor(int id, String name, int birthYear, String location, Gender gender, SocialStatus socialStatus,
            long phoneNumber, BloodType bloodType, int departmentId, double salary, String workingHours,
            String startDate, String email, long workPhoneNumber, String specification, double yearsOfExperience) {
        super(id, name, birthYear, location, gender, socialStatus, phoneNumber, bloodType);
        setDepartmentId(departmentId);
        setSalary(salary);
        setWorkingHours(workingHours);
        setStartDate(startDate);
        setEmail(email);
        setWorkingPhoneNumber(workPhoneNumber);
        setSpecification(specification);
        setYearOfExperience(yearsOfExperience);
        this.doctorOperationsID = new ArrayList<>();
        numberOfDoctors++;
    }

    public Doctor() {
        this(19999, "UNKNOWN", 1875, "UNKNOWN", Gender.UNKNOWN, SocialStatus.OTHER, 0, BloodType.UNKNOWN,
                0, 0.0, "UNKNOWN", "UNKNOWN", "UNKNOWN", 0, "UNKNOWN", 0.0);
    }

    public void setDepartmentId(int id) {
        if (id > 0) {
            doctorDepartmentID = id;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            doctorSalary = salary;
        }
    }

    public void setWorkingHours(String hours) {
        if (hours != null && !hours.isEmpty()) {
            doctorWorkingHours = hours;
        }
    }

    public void setStartDate(String date) {
        if (date != null && !date.isEmpty()) {
            doctorStartDate = date;
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.isEmpty()) {
            doctorEmail = email;
        }
    }

    public void setWorkingPhoneNumber(long number) {
        if (number > 0) {
            doctorWorkPhoneNumber = number;
        }
    }

    public void setSpecification(String spec) {
        if (spec != null && !spec.isEmpty()) {
            doctorSpecification = spec;
        }
    }

    public void setYearOfExperience(double years) {
        if (years >= 0) {
            doctorYearsOfExperience = years;
        }
    }

    public void setOperationID(int id) {
        doctorOperationsID.add(id);
    }

    public int getDepartmentId() {
        return doctorDepartmentID;
    }

    public double getSalary() {
        return doctorSalary;
    }

    public String getWorkingHours() {
        return doctorWorkingHours;
    }

    public String getStartDate() {
        return doctorStartDate;
    }

    public String getEmail() {
        return doctorEmail;
    }

    public long getWorkingPhoneNumber() {
        return doctorWorkPhoneNumber;
    }

    public String getSpecification() {
        return doctorSpecification;
    }

    public double getYearOfExperience() {
        return doctorYearsOfExperience;
    }

    public ArrayList<Integer> getDoctorOperationsID() {
        return doctorOperationsID;
    }

    public static int getNumberOfDoctors() {
        return numberOfDoctors;
    }

    @Override
    public String toString() {
        String result = super.toString()
                + "Department ID: " + this.getDepartmentId()
                + "\nSalary: " + getSalary()
                + "\nWorking Hours: " + this.getWorkingHours()
                + "\nStart Date: " + this.getStartDate()
                + "\nWork Phone: " + this.getWorkingPhoneNumber()
                + "\nEmail: " + this.getEmail()
                + "\nSpecification: " + this.getSpecification()
                + "\nExperience: " + getYearOfExperience() + " years"
                + "\nOperations ID's:\n";

        for (int op : doctorOperationsID) {
            result += op + "\n";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (!(o instanceof Doctor doctor)) {
            return false;
        }
        return doctorSalary == doctor.doctorSalary
                && doctorWorkPhoneNumber == doctor.doctorWorkPhoneNumber
                && doctorDepartmentID == doctor.doctorDepartmentID
                && Double.compare(doctorYearsOfExperience, doctor.doctorYearsOfExperience) == 0
                && Objects.equals(doctorEmail, doctor.doctorEmail)
                && Objects.equals(doctorWorkingHours, doctor.doctorWorkingHours)
                && Objects.equals(doctorStartDate, doctor.doctorStartDate)
                && Objects.equals(doctorSpecification, doctor.doctorSpecification)
                && Objects.equals(doctorOperationsID, doctor.doctorOperationsID);
    }
}

class Patient extends Person {

    private boolean emergencyCondition;
    private int sectionID;
    private String admissionDate;
    private String room;
    private ArrayList<MedicalRecord> patientRecords = new ArrayList<>();//

    public Patient(int id, String name, int birthYear, String location, Gender gender, SocialStatus socialStatus,
            long phoneNumber, BloodType bloodType, boolean emergencyCondition, String admissionDate,
            int sectionID, String room, MedicalRecord record) {
        super(id, name, birthYear, location, gender, socialStatus, phoneNumber, bloodType);
        setEmergencyCondition(emergencyCondition);
        setAdmissionDate(admissionDate);
        setSectionID(sectionID);
        setRoom(room);
        if (record != null) {
            patientRecords.add(record);
        }
    }

    public Patient() {
        this(9998, "UNKNOWN", 1875, "UNKNOWN", Gender.UNKNOWN, SocialStatus.OTHER, 0, BloodType.UNKNOWN,
                false, "UNKNOWN", 10000, "00aa", null);
    }

    public void setEmergencyCondition(boolean condition) {
        emergencyCondition = condition;
    }

    public void setAdmissionDate(String date) {
        if (date != null && !date.isEmpty()) {
            admissionDate = date;
        }
    }

    public void setSectionID(int id) {
        if (id >= 10000) {
            sectionID = id;
        }
    }

    public void setRoom(String room) {
        if (room != null && !room.isEmpty()) {
            this.room = room;
        }
    }

    public void setPatientRecord(int patientID, int recordId, double cash, int operation, int disease, int medicine) {
        MedicalRecord r = new MedicalRecord();
        r.setPatientID(patientID);
        r.setRecordId(recordId);
        r.setCash(cash);
        r.setOperationID(operation);
        r.setDiseaseID(disease);
        r.setMedicine(medicine);
        patientRecords.add(r);
    }

    public boolean isEmergencyCondition() {
        return emergencyCondition;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public int getSectionID() {
        return sectionID;
    }

    public String getRoom() {
        return room;
    }

    public ArrayList<MedicalRecord> getPatientRecords() {
        return patientRecords;
    }

    @Override
    public String toString() {
        String result = super.toString()
                + "Section ID: " + this.getSectionID()
                + "\nRoom: " + this.getRoom()
                + "\nEmergency Condition: " + this.isEmergencyCondition()
                + "\nAdmission Date: " + this.getAdmissionDate()
                + "\nMedical Records:\n";

        for (MedicalRecord r : patientRecords) {
            result += r + "\n";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (!(o instanceof Patient patient)) {
            return false;
        }
        return emergencyCondition == patient.emergencyCondition
                && sectionID == patient.sectionID
                && Objects.equals(admissionDate, patient.admissionDate)
                && Objects.equals(room, patient.room)
                && Objects.equals(patientRecords, patient.patientRecords);
    }
}

class Department {

    private int departmentId;
    private String departmentName;
    private String[] departmentLocations;
    private int numberOfEmployees;
    private int numberOfSections;
    private int numberOfMedicines;
    private int departmentManagerId;
    private String managerStartDate;
    private ArrayList<Integer> departmentSectionsID;
    private static int numberOfDepartments;

    public Department(String departmentName, String[] departmentLocations, int numberOfEmployees,
            int numberOfSections, int numberOfMedicines, int departmentManagerId) {
        setDepartmentName(departmentName);
        setDepartmentLocations(departmentLocations);
        setNumberOfEmployees(numberOfEmployees);
        setNumberOfSections(numberOfSections);
        setNumberOfMedicines(numberOfMedicines);
        setDepartmentManagerId(departmentManagerId);
        this.departmentSectionsID = new ArrayList<>();
        numberOfDepartments++;
        this.departmentId = 100000 + numberOfDepartments;
    }

    public Department() {
        this("General", new String[]{"Main Building"}, 0, 0, 0, 19999);
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName != null && !departmentName.trim().isEmpty()) {
            this.departmentName = departmentName;
        }
    }

    public void setDepartmentLocations(String[] departmentLocations) {
        if (departmentLocations != null && departmentLocations.length > 0) {
            this.departmentLocations = departmentLocations.clone();
        } else {
            this.departmentLocations = new String[]{"Unknown"};
        }
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        if (numberOfEmployees >= 0) {
            this.numberOfEmployees = numberOfEmployees;
        }
    }

    public void setNumberOfSections(int numberOfSections) {
        if (numberOfSections >= 0) {
            this.numberOfSections = numberOfSections;
        }
    }

    public void setNumberOfMedicines(int numberOfMedicines) {
        if (numberOfMedicines >= 0) {
            this.numberOfMedicines = numberOfMedicines;
        }
    }

    public void setDepartmentManagerId(int departmentManagerId) {
        if (departmentManagerId > 0) {
            this.departmentManagerId = departmentManagerId;
        }
    }

    public void setManagerStartDate(String managerStartDate) {
        this.managerStartDate = managerStartDate;
    }

    public void addSectionID(int sectionId) {
        this.departmentSectionsID.add(sectionId);
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String[] getDepartmentLocations() {
        return departmentLocations.clone();
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getNumberOfSections() {
        return numberOfSections;
    }

    public int getNumberOfMedicines() {
        return numberOfMedicines;
    }

    public int getDepartmentManagerId() {
        return departmentManagerId;
    }

    public String getManagerStartDate() {
        return managerStartDate;
    }

    public ArrayList<Integer> getDepartmentSections() {
        return departmentSectionsID;
    }

    public static int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    @Override
    public String toString() {
        String result = "=== Department Information ===\n"
                + "ID: " + this.getDepartmentId()
                + "\nName: " + this.getDepartmentName()
                + "\nLocations: " + Arrays.toString(this.getDepartmentLocations())
                + "\nEmployees: " + this.getNumberOfEmployees()
                + "\nSections: " + this.getNumberOfSections()
                + "\nMedicines: " + this.getNumberOfMedicines()
                + "\nManager ID: " + this.getDepartmentManagerId()
                + "\nManager Start Date: " + this.getManagerStartDate()
                + "\n";

        if (!this.getDepartmentSections().isEmpty()) {
            result += "Department Sections ID's:\n";
            for (Integer s : this.getDepartmentSections()) {
                result += s.toString() + "\n";
            }
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Department)) {
            return false;
        }
        Department that = (Department) o;
        return departmentId == that.departmentId
                && departmentManagerId == that.departmentManagerId
                && numberOfEmployees == that.numberOfEmployees
                && numberOfSections == that.numberOfSections
                && numberOfMedicines == that.numberOfMedicines
                && Objects.equals(departmentName, that.departmentName)
                && Arrays.equals(departmentLocations, that.departmentLocations)
                && Objects.equals(managerStartDate, that.managerStartDate);
    }

}

class Section {

    private int departmentId;
    private int sectionId;
    private String sectionType;
    private int sectionCapacity;
    private ArrayList<String> rooms;
    private int numberOfOperations;
    private int numberOfDiseases;
    private int numberOfPatients;
    private static int numberOfSections;

    public Section(int departmentId, int sectionId, String sectionType, int sectionCapacity,
            int numberOfOperations, int numberOfDiseases, int numberOfPatients) {
        this.departmentId = departmentId;
        this.sectionId = sectionId;
        this.sectionType = sectionType;
        this.sectionCapacity = sectionCapacity;
        this.numberOfOperations = numberOfOperations;
        this.numberOfDiseases = numberOfDiseases;
        this.numberOfPatients = numberOfPatients;
        this.rooms = new ArrayList<>();
        numberOfSections++;
    }

    public Section() {
        this(0, 0, "Unknown", 0, 0, 0, 0);
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public void addRoom(String room) {
        if (room != null && !room.trim().isEmpty()) {
            this.rooms.add(room);
        }
    }

    public void setNumberOfPatients(int numberOfPatients) {
        if (numberOfPatients >= 0) {
            this.numberOfPatients = numberOfPatients;
        }
    }

    public void setDepartmentId(int departmentId) {
        if (departmentId >= 10000) {
            this.departmentId = departmentId;
        }
    }

    public void setSectionType(String sectionType) {
        if (sectionType != null && !sectionType.trim().isEmpty()) {
            this.sectionType = sectionType;
        }
    }

    public void setSectionCapacity(int sectionCapacity) {
        if (sectionCapacity >= 5) {
            this.sectionCapacity = sectionCapacity;
        }
    }

    public void setNumberOfOperations(int numberOfOperations) {
        if (numberOfOperations >= 0) {
            this.numberOfOperations = numberOfOperations;
        }
    }

    public void setNumberOfDiseases(int numberOfDiseases) {
        if (numberOfDiseases >= 0) {
            this.numberOfDiseases = numberOfDiseases;
        }
    }

    public int getSectionId() {
        return sectionId;
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getSectionType() {
        return sectionType;
    }

    public int getSectionCapacity() {
        return sectionCapacity;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }

    public int getNumberOfDiseases() {
        return numberOfDiseases;
    }

    public static int getNumberOfSections() {
        return numberOfSections;
    }

    @Override
    public String toString() {
        return "Section ID: " + this.getSectionId()
                + "\nType: " + this.getSectionType()
                + "\nCapacity: " + this.getSectionCapacity()
                + "\nPatients: " + this.getNumberOfPatients()
                + "\nOperations: " + this.getNumberOfOperations()
                + "\nDiseases: " + this.getNumberOfDiseases()
                + "\nDepartment ID: " + this.getDepartmentId()
                + "\nRooms: " + this.getRooms().toString()
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Section)) {
            return false;
        }
        Section section = (Section) o;
        return sectionId == section.sectionId
                && departmentId == section.departmentId
                && sectionCapacity == section.sectionCapacity
                && numberOfPatients == section.numberOfPatients
                && numberOfOperations == section.numberOfOperations
                && numberOfDiseases == section.numberOfDiseases
                && Objects.equals(sectionType, section.sectionType)
                && Objects.equals(rooms, section.rooms);
    }

}

//////////**********************

class MedicalRecord {

    private int patientID;
    private int recordId;
    private ArrayList<String> allergies;
    private double cash;
    private int operationID;
    private int diseaseID;
    private int medicineID;
    private static int recordCount;

    public MedicalRecord(int patientID, int recordId, double cash,
            int operationID, int diseaseID, int medicineID) {
        this.patientID = patientID;
        this.recordId = recordId;
        this.cash = cash;
        this.allergies = new ArrayList<>();
        this.operationID = operationID;
        this.diseaseID = diseaseID;
        this.medicineID = medicineID;
        recordCount++;
    }

    public MedicalRecord() {
        this(0, 0, 0.0, 0, 0, 0);
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void addAllergy(String allergy) {
        this.allergies.add(allergy);
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }

    public void setMedicine(int medicineID) {
        this.medicineID = medicineID;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getRecordId() {
        return recordId;
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public double getCash() {
        return cash;
    }

    public int getOperationID() {
        return operationID;
    }

    public int getDisease() {
        return diseaseID;
    }

    public int getMedicine() {
        return medicineID;
    }

    public static int getRecordCount() {
        return recordCount;
    }

    @Override
    public String toString() {
        return "MedicalRecord:\n"
                + "PatientID: " + patientID
                + "\nRecordID: " + recordId
                + "\nAllergies: " + allergies
                + "\nCash: " + cash
                + "\nOperation ID: " + operationID
                + "\nDisease: " + diseaseID
                + "\nMedicine: " + medicineID
                + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MedicalRecord)) {
            return false;
        }
        MedicalRecord other = (MedicalRecord) obj;
        return patientID == other.patientID
                && recordId == other.recordId
                && Double.compare(cash, other.cash) == 0
                && Objects.equals(allergies, other.allergies)
                && other.operationID == this.operationID
                && other.diseaseID == this.diseaseID
                && other.medicineID == this.medicineID;
    }
}

class Disease {

    private int id;
    private String name;
    private boolean contagious;

    public Disease(int id, String name, boolean contagious) {
        this.id = id;
        this.name = name;
        this.contagious = contagious;
    }

    public Disease() {
        this(0, "Unknown", false);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContagious(boolean contagious) {
        this.contagious = contagious;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isContagious() {
        return contagious;
    }

    @Override
    public String toString() {
        return "Disease:\n"+"Disease ID: " + id + "\nName: " + name + "\nContagious: " + contagious + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Disease)) {
            return false;
        }
        Disease disease = (Disease) o;
        return id == disease.id && contagious == disease.contagious && Objects.equals(name, disease.name);
    }
}

class Operation {

    private int id;
    private String name;
    private String date;
    private String room;
    private int sectionId;
    private ArrayList<Integer> doctorIds = new ArrayList<>();

    public Operation(int id, String name, String date, String room) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
    }

    public Operation() {
        this(0, "Unknown", "Unknown", "Unknown");
    }

    public void addDoctor(int doctorId) {
        doctorIds.add(doctorId);
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getRoom() {
        return room;
    }

    public int getSectionId() {
        return sectionId;
    }

    public ArrayList<Integer> getDoctorIds() {
        return doctorIds;
    }

    @Override
    public String toString() {
        return "Operation:\nID: " + id + "\nName: " + name + "\nDate: " + date + "\nRoom: " + room
                + "\nSectionID: " + sectionId + "\nDoctors=" + doctorIds + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Operation)) {
            return false;
        }
        Operation that = (Operation) o;
        return id == that.id && sectionId == that.sectionId
                && Objects.equals(name, that.name) && Objects.equals(date, that.date)
                && Objects.equals(room, that.room) && Objects.equals(doctorIds, that.doctorIds);
    }
}

class Medicine {

    private int id;
    private String name;
    private String dosage;
    private ArrayList<String> sideEffects = new ArrayList<>();

    public Medicine(int id, String name, String dosage, String[] sideEffects) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        if (sideEffects != null) {
            for (String effect : sideEffects) {
                this.sideEffects.add(effect);
            }
        }
    }

    public Medicine() {
        this(0, "Unknown", "Unknown", null);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void addSideEffect(String effect) {
        sideEffects.add(effect);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    @Override
    public String toString() {
        return "Medicine:\nID: " + id + "\nName: " + name + "\nDosage: " + dosage + "\nSideEffects: " + sideEffects + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Medicine)) {
            return false;
        }
        Medicine medicine = (Medicine) o;
        return id == medicine.id && Objects.equals(name, medicine.name)
                && Objects.equals(dosage, medicine.dosage) && Objects.equals(sideEffects, medicine.sideEffects);
    }
}

enum Status {
    CONFIRMED, PENDING, CANCELLED
}

class Appointment {

    private int doctorId;
    private int patientId;
    private String room;
    private String time;
    private String date;
    private Status status;

    public Appointment(int doctorId, int patientId, String room, String time, String date, Status status) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.room = room;
        this.time = time;
        this.date = date;
        this.status = status;
    }

    public Appointment() {
        this(0, 0, "Unknown", "Unknown", "Unknown", Status.PENDING);
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Appointment:\nDoctorID: " + doctorId + "\nPatientID: " + patientId
                + "\nRoom: " + room + "\nTime: " + time + "\nDate: " + date + "\nStatus: " + status + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Appointment)) {
            return false;
        }
        Appointment that = (Appointment) o;
        return doctorId == that.doctorId && patientId == that.patientId
                && Objects.equals(room, that.room) && Objects.equals(time, that.time)
                && Objects.equals(date, that.date) && status == that.status;
    }
}

public class Hospital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();
        ArrayList<MedicalRecord> medical_records = new ArrayList<>();
        ArrayList<Disease> diseases = new ArrayList<>();
        ArrayList<Medicine> medicines = new ArrayList<>();
        ArrayList<Operation> operations = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Section> sections = new ArrayList<>();
        System.out.println("\n=======================================\n=Welcome to Hospital management system=\n=======================================\n");
        System.out.println("This project was submitted as a requirement for the Object Oriented Programming (OOP) course.\nCourse instructor: Moataz Rasmi Abu Sarah\nProgrammed by: Mohammad nafiz sammour\nUniversity ID:22210257\n=======================================\n");
        int choose = -1;
        do {
            System.out.println("Enter what do you want to do from these actions\n1.Retrieve\n2.Search\n3.Add\n4.Delete\n5.Update\n0.Exit\n-->");
            if (input.hasNextInt()) {
                choose = input.nextInt();
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (choose == 1) {
                    //////////////////////////////////////////////////////////////////////////////////////
                    System.out.println("What do you want to Print\nChoose from the following actions:\n1.Doctor\n2.Patient\n3.Appoitment\n4.Medical Record\n5.Disease\n6.Medicine\n7.Operation\n8.Department\n9.Section\n");
                    choose = input.nextInt();
                    if (choose == 1) {//------------------------------------------------------------Print
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all doctors");
                        System.out.println("2. Print doctor by National ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (doctors.isEmpty()) {
                                    System.out.println("No doctors found.");
                                } else {
                                    System.out.println("All Registered Doctors:");
                                    for (Doctor d : doctors) {
                                        System.out.println("-----------------------------");
                                        System.out.println(d);
                                    }
                                }
                            }
                            case 2 -> {
                                if (doctors.isEmpty()) {
                                    System.out.println("No doctors to search.");
                                } else {
                                    System.out.print("Enter National ID of doctor to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Doctor d : doctors) {
                                        if (d.getNationalID() == id) {
                                            System.out.println("Doctor found:\n" + d);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No doctor found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }
                    } else if (choose == 2) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all patients");
                        System.out.println("2. Print patient by National ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (patients.isEmpty()) {
                                    System.out.println("No patients found.");
                                } else {
                                    System.out.println("All Registered Patients:");
                                    for (Patient p : patients) {
                                        System.out.println("-----------------------------");
                                        System.out.println(p);
                                    }
                                }
                            }
                            case 2 -> {
                                if (patients.isEmpty()) {
                                    System.out.println("No patients to search.");
                                } else {
                                    System.out.print("Enter National ID of patient to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Patient p : patients) {
                                        if (p.getNationalID() == id) {
                                            System.out.println("Patient found:\n" + p);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No patient found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 3) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Show all appointments");
                        System.out.println("2. Search appointment by Doctor ID and Patient ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (appointments.isEmpty()) {
                                    System.out.println("No appointments found.");
                                } else {
                                    System.out.println("All Appointments:");
                                    for (Appointment a : appointments) {
                                        System.out.println("-----------------------------");
                                        System.out.println(a);
                                    }
                                }
                            }
                            case 2 -> {
                                if (appointments.isEmpty()) {
                                    System.out.println("No appointments to search.");
                                } else {
                                    System.out.print("Enter Doctor ID: ");
                                    int doctorId = input.nextInt();
                                    System.out.print("Enter Patient ID: ");
                                    int patientId = input.nextInt();
                                    boolean found = false;
                                    for (Appointment a : appointments) {
                                        if (a.getDoctorId() == doctorId && a.getPatientId() == patientId) {
                                            System.out.println("Appointment found:\n" + a);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("Appointment not found.");
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 4) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all medical records");
                        System.out.println("2. Print record by Record ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();
                        input.nextLine();

                        switch (choice) {
                            case 1 -> {
                                if (medical_records.isEmpty()) {
                                    System.out.println("No medical records found.");
                                } else {
                                    System.out.println("All Medical Records:");
                                    for (MedicalRecord r : medical_records) {
                                        System.out.println("-----------------------------");
                                        System.out.println(r);
                                    }
                                }
                            }
                            case 2 -> {
                                if (medical_records.isEmpty()) {
                                    System.out.println("No records to search.");
                                } else {
                                    System.out.print("Enter Record ID to print: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (MedicalRecord r : medical_records) {
                                        if (r.getRecordId() == id) {
                                            System.out.println("Medical Record found:\n" + r);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("Record not found.");
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 5) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all diseases");
                        System.out.println("2. Print disease by ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (diseases.isEmpty()) {
                                    System.out.println("No diseases recorded.");
                                } else {
                                    System.out.println("All Diseases:");
                                    for (Disease d : diseases) {
                                        System.out.println(d);
                                        System.out.println("------------------------");
                                    }
                                }
                            }
                            case 2 -> {
                                if (diseases.isEmpty()) {
                                    System.out.println("No diseases to search.");
                                } else {
                                    System.out.print("Enter ID: ");
                                    int id = input.nextInt();
                                    Disease found = null;
                                    for (Disease d : diseases) {
                                        if (d.getId() == id) {
                                            found = d;
                                            break;
                                        }
                                    }
                                    if (found != null) {
                                        System.out.println("Disease found:\n" + found);
                                    } else {
                                        System.out.println("Disease not found.");
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 6) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all medicines");
                        System.out.println("2. Print medicine by ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (medicines.isEmpty()) {
                                    System.out.println("No medicines found.");
                                } else {
                                    System.out.println("All Medicines:");
                                    for (Medicine m : medicines) {
                                        System.out.println("-----------------------------");
                                        System.out.println(m);
                                    }
                                }
                            }
                            case 2 -> {
                                if (medicines.isEmpty()) {
                                    System.out.println("No medicines to search.");
                                } else {
                                    System.out.print("Enter ID of the medicine to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Medicine m : medicines) {
                                        if (m.getId() == id) {
                                            System.out.println("Medicine found:\n" + m);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No medicine found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 7) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all operations");
                        System.out.println("2. Print operation by ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (operations.isEmpty()) {
                                    System.out.println("No operations found.");
                                } else {
                                    System.out.println("All Registered Operations:");
                                    for (Operation op : operations) {
                                        System.out.println("-----------------------------");
                                        System.out.println(op);
                                    }
                                }
                            }
                            case 2 -> {
                                if (operations.isEmpty()) {
                                    System.out.println("No operations to search.");
                                } else {
                                    System.out.print("Enter ID of operation to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Operation op : operations) {
                                        if (op.getId() == id) {
                                            System.out.println("Operation found:\n" + op);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No operation found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 8) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all departments");
                        System.out.println("2. Print department by ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (departments.isEmpty()) {
                                    System.out.println("No departments found.");
                                } else {
                                    System.out.println("All Departments:");
                                    for (Department d : departments) {
                                        System.out.println("-----------------------------");
                                        System.out.println(d);
                                    }
                                }
                            }
                            case 2 -> {
                                if (departments.isEmpty()) {
                                    System.out.println("No departments to search.");
                                } else {
                                    System.out.print("Enter ID of the department to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Department d : departments) {
                                        if (d.getDepartmentId() == id) {
                                            System.out.println("Department found:\n" + d);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No department found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else if (choose == 9) {
                        System.out.println("What would you like to print?");
                        System.out.println("1. Print all sections");
                        System.out.println("2. Print section by ID");
                        System.out.print("Enter your choice: ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1 -> {
                                if (sections.isEmpty()) {
                                    System.out.println("No sections found.");
                                } else {
                                    System.out.println("All Sections:");
                                    for (Section s : sections) {
                                        System.out.println("-----------------------------");
                                        System.out.println(s);
                                    }
                                }
                            }
                            case 2 -> {
                                if (sections.isEmpty()) {
                                    System.out.println("No sections to search.");
                                } else {
                                    System.out.print("Enter ID of the section to search: ");
                                    int id = input.nextInt();
                                    boolean found = false;
                                    for (Section s : sections) {
                                        if (s.getSectionId() == id) {
                                            System.out.println("Section found:\n" + s);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("No section found with ID: " + id);
                                    }
                                }
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }

                    } else {
                        System.out.println("Enter a valid choose");
                    }
                }  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (choose == 2) {//------------------------------------------------------------Search
                    System.out.println("What do you want to Search\nChoose from the following actions:\n1.Doctor\n2.Patient\n3.Appoitment\n4.Medical Record\n5.Disease\n6.Medicine\n7.Operation\n8.Department\n9.Section\n");
                    choose = input.nextInt();
                    if (choose == 1) {
                        if (doctors.isEmpty()) {
                            System.out.println("No doctors available to search.");
                        } else {
                            System.out.print("Enter the National ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Doctor doctor : doctors) {
                                if (doctor.getNationalID() == id) {
                                    System.out.println("Doctor found:");
                                    System.out.println(doctor);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No doctor found with ID: " + id);
                            }
                        }

                    } else if (choose == 2) {
                        if (patients.isEmpty()) {
                            System.out.println("No patients available to search.");
                        } else {
                            System.out.print("Enter the National ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Patient patient : patients) {
                                if (patient.getNationalID() == id) {
                                    System.out.println("Patient found:");
                                    System.out.println(patient);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No patient found with ID: " + id);
                            }
                        }

                    } else if (choose == 3) {
                        if (appointments.isEmpty()) {
                            System.out.println("No appointments available to search.");
                        } else {
                            System.out.print("Enter Doctor ID: ");
                            int doctorId = input.nextInt();
                            System.out.print("Enter Patient ID: ");
                            int patientId = input.nextInt();
                            boolean found = false;

                            for (Appointment a : appointments) {
                                if (a.getDoctorId() == doctorId && a.getPatientId() == patientId) {
                                    System.out.println("Appointment found:");
                                    System.out.println(a);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Appointment not found with the given Doctor and Patient IDs.");
                            }
                        }

                    } else if (choose == 4) {
                        if (medical_records.isEmpty()) {
                            System.out.println("No medical records available to search.");
                        } else {
                            System.out.print("Enter Record ID to search: ");
                            int targetId = input.nextInt();
                            boolean found = false;

                            for (MedicalRecord r : medical_records) {
                                if (r.getRecordId() == targetId) {
                                    System.out.println("Medical Record found:");
                                    System.out.println(r);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No record found with Record ID: " + targetId);
                            }
                        }

                    } else if (choose == 5) {
                        if (diseases.isEmpty()) {
                            System.out.println("No diseases available to search.");
                        } else {
                            System.out.print("Enter Disease ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Disease d : diseases) {
                                if (d.getId() == id) {
                                    System.out.println("Disease found:");
                                    System.out.println(d);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No disease found with ID: " + id);
                            }
                        }

                    } else if (choose == 6) {
                        if (medicines.isEmpty()) {
                            System.out.println("No medicines available to search.");
                        } else {
                            System.out.print("Enter the ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Medicine m : medicines) {
                                if (m.getId() == id) {
                                    System.out.println("Medicine found:");
                                    System.out.println(m);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No medicine found with ID: " + id);
                            }
                        }

                    } else if (choose == 7) {
                        if (operations.isEmpty()) {
                            System.out.println("No operations available to search.");
                        } else {
                            System.out.print("Enter the Operation ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Operation op : operations) {
                                if (op.getId() == id) {
                                    System.out.println("Operation found:");
                                    System.out.println(op);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No operation found with ID: " + id);
                            }
                        }

                    } else if (choose == 8) {
                        if (departments.isEmpty()) {
                            System.out.println("No departments available to search.");
                        } else {
                            System.out.print("Enter the ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Department d : departments) {
                                if (d.getDepartmentId() == id) {
                                    System.out.println("Department found:");
                                    System.out.println(d);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No department found with ID: " + id);
                            }
                        }

                    } else if (choose == 9) {
                        if (sections.isEmpty()) {
                            System.out.println("No sections available to search.");
                        } else {
                            System.out.print("Enter the ID to search: ");
                            int id = input.nextInt();
                            boolean found = false;

                            for (Section s : sections) {
                                if (s.getSectionId() == id) {
                                    System.out.println("Section found:");
                                    System.out.println(s);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("No section found with ID: " + id);
                            }
                        }

                    } else {
                        System.out.println("Enter a valid choose");
                    }
                }  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (choose == 3) {//------------------------------------------------------------Add
                    System.out.println("What do you want to Add\nChoose from the following actions:\n1.Doctor\n2.Patient\n3.Appoitment\n4.Medical Record\n5.Disease\n6.Medicine\n7.Operation\n8.Department\n9.Section\n");
                    choose = input.nextInt();
                    if (choose == 1) {
                        System.out.print("Enter National ID (positive integer): ");
                        int nationalId = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Name: ");
                        String name = input.nextLine();

                        System.out.print("Enter Birth Year (>= 1870): ");
                        int birthYear = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Location: ");
                        String location = input.nextLine();

                        System.out.print("Enter Gender (MALE, FEMALE, UNKNOWN): ");
                        Gender gender = Gender.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Social Status (MARRIED, SINGLE, DIVORCED, OTHER): ");
                        SocialStatus status = SocialStatus.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Phone Number: ");
                        long phone = input.nextLong();
                        input.nextLine();

                        System.out.print("Enter Blood Type (A, B, AB, O, UNKNOWN): ");
                        BloodType blood = BloodType.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Department ID: ");
                        int departmentId = input.nextInt();

                        System.out.print("Enter Salary: ");
                        double salary = input.nextDouble();
                        input.nextLine();

                        System.out.print("Enter Working Hours: ");
                        String workingHours = input.nextLine();

                        System.out.print("Enter Start Date (e.g., 2024/01/15): ");
                        String startDate = input.nextLine();

                        System.out.print("Enter Work Email: ");
                        String email = input.nextLine();

                        System.out.print("Enter Work Phone Number: ");
                        long workPhone = input.nextLong();
                        input.nextLine();

                        System.out.print("Enter Medical Specification: ");
                        String spec = input.nextLine();

                        System.out.print("Enter Years of Experience: ");
                        double experience = input.nextDouble();

                        Doctor doctor = new Doctor(nationalId, name, birthYear, location, gender, status, phone, blood,
                                departmentId, salary, workingHours, startDate, email, workPhone, spec, experience);
                        doctors.add(doctor);

                        System.out.println("\nDoctor successfully added:\nInformation:");
                        System.out.println(doctor);

                    } else if (choose == 2) {
                        System.out.print("Enter National ID (positive integer): ");
                        int nationalId = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Name: ");
                        String name = input.nextLine();

                        System.out.print("Enter Birth Year (>= 1870): ");
                        int birthYear = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Location: ");
                        String location = input.nextLine();

                        System.out.print("Enter Gender (MALE, FEMALE, UNKNOWN): ");
                        Gender gender = Gender.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Social Status (MARRIED, SINGLE, OTHER): ");
                        SocialStatus status = SocialStatus.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Phone Number: ");
                        long phone = input.nextLong();
                        input.nextLine();

                        System.out.print("Enter Blood Type (A, B, AB, O, UNKNOWN): ");
                        BloodType blood = BloodType.valueOf(input.nextLine().trim().toUpperCase());

                        System.out.print("Enter Emergency Condition (true/false): ");
                        boolean emergency = input.nextBoolean();
                        input.nextLine();

                        System.out.print("Enter Admission Date (e.g., 2024/01/15): ");
                        String date = input.nextLine();

                        System.out.print("Enter Section ID: ");
                        int sectionId = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Room: ");
                        String room = input.nextLine();

                        Patient newPatient = new Patient(nationalId, name, birthYear, location, gender, status, phone, blood, emergency, date, sectionId, room, null);
                        patients.add(newPatient);

                        System.out.println("\nPatient successfully added:\nInformation:");
                        System.out.println(newPatient);

                    } else if (choose == 3) {
                        System.out.print("Enter Doctor ID: ");
                        int doctorId = input.nextInt();

                        System.out.print("Enter Patient ID: ");
                        int patientId = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Room: ");
                        String room = input.nextLine();

                        System.out.print("Enter Time (e.g., 14:30): ");
                        String time = input.nextLine();

                        System.out.print("Enter Date (e.g., 2024-12-10): ");
                        String date = input.nextLine();

                        System.out.print("Enter Status (PENDING, COMPLETED, CANCELED): ");
                        Status status = Status.valueOf(input.nextLine().trim().toUpperCase());

                        Appointment a = new Appointment(doctorId, patientId, room, time, date, status);
                        appointments.add(a);

                        System.out.println("\nAppointment successfully added:\nInformation:");
                        System.out.println(a);

                    } else if (choose == 4) {
                        System.out.print("Enter Patient ID: ");
                        int patientID = input.nextInt();

                        System.out.print("Enter Record ID: ");
                        int recordID = input.nextInt();

                        System.out.print("Enter Cash: ");
                        double cash = input.nextDouble();

                        System.out.print("Enter Operation ID: ");
                        int operationID = input.nextInt();

                        System.out.print("Enter Disease ID: ");
                        int diseaseID = input.nextInt();

                        System.out.print("Enter Medicine ID: ");
                        int medicineID = input.nextInt();
                        input.nextLine();

                        MedicalRecord record = new MedicalRecord(patientID, recordID, cash, operationID, diseaseID, medicineID);

                        System.out.print("Enter number of allergies: ");
                        int n = input.nextInt();
                        input.nextLine();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter allergy #" + (i + 1) + ": ");
                            record.addAllergy(input.nextLine());
                        }

                        medical_records.add(record);
                        System.out.println("\nMedical Record successfully added:\nInformation:");
                        System.out.println(record);

                    } else if (choose == 5) {
                        System.out.print("Enter Disease ID: ");
                        int id = input.nextInt();
                        input.nextLine();

                        boolean exists = false;
                        for (Disease d : diseases) {
                            if (d.getId() == id) {
                                exists = true;
                                break;
                            }
                        }

                        if (exists) {
                            System.out.println("A disease with this ID already exists.");
                        } else {
                            System.out.print("Enter Disease Name: ");
                            String name = input.nextLine();

                            System.out.print("Is the disease contagious? (true/false): ");
                            boolean contagious = input.nextBoolean();

                            diseases.add(new Disease(id, name, contagious));
                            System.out.println("\nDisease successfully added.");
                        }

                    } else if (choose == 6) {
                        System.out.print("Enter Medicine ID: ");
                        int id = new Scanner(System.in).nextInt();
                        System.out.print("Enter Medicine Name: ");
                        String name = new Scanner(System.in).nextLine();
                        System.out.print("Enter Dosage: ");
                        String dosage = new Scanner(System.in).nextLine();
                        System.out.print("Enter number of side effects: ");
                        int count = new Scanner(System.in).nextInt();
                        String[] effects = new String[count];
                        new Scanner(System.in).nextLine();
                        for (int i = 0; i < count; i++) {
                            System.out.print("Enter side effect " + (i + 1) + ": ");
                            effects[i] = new Scanner(System.in).nextLine();
                        }
                        Medicine med = new Medicine(id, name, dosage, effects);
                        medicines.add(med);
                        System.out.println("\nMedicine successfully added:\nInformation: ");
                        System.out.println(med);

                    } else if (choose == 7) {
                        System.out.print("Enter Operation ID: ");
                        int opId = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Operation Name: ");
                        String opName = input.nextLine();

                        System.out.print("Enter Date (e.g., 2025/05/11): ");
                        String opDate = input.nextLine();

                        System.out.print("Enter Room: ");
                        String opRoom = input.nextLine();

                        System.out.print("Enter Section ID: ");
                        int sectionId = input.nextInt();

                        Operation operation = new Operation(opId, opName, opDate, opRoom);
                        operation.setSectionId(sectionId);

                        System.out.print("Enter number of doctors assigned to this operation: ");
                        int numDoctors = input.nextInt();

                        for (int i = 0; i < numDoctors; i++) {
                            System.out.print("Enter Doctor National ID #" + (i + 1) + ": ");
                            int doctorIdAssigned = input.nextInt();
                            operation.addDoctor(doctorIdAssigned);
                        }

                        operations.add(operation);
                        System.out.println("\nOperation successfully added:\nInformation:");
                        System.out.println(operation);

                    } else if (choose == 8) {
                        System.out.print("Enter Department Name: ");
                        input.nextLine();
                        String name = input.nextLine();

                        System.out.print("Enter number of locations: ");
                        int locCount = input.nextInt();
                        input.nextLine();
                        String[] locations = new String[locCount];
                        for (int i = 0; i < locCount; i++) {
                            System.out.print("Enter location " + (i + 1) + ": ");
                            locations[i] = input.nextLine();
                        }

                        System.out.print("Enter Number of Employees: ");
                        int employees = input.nextInt();

                        System.out.print("Enter Number of Sections: ");
                        int sectionsnum = input.nextInt();

                        System.out.print("Enter Number of Medicines: ");
                        int meds = input.nextInt();

                        System.out.print("Enter Department Manager ID: ");
                        int managerId = input.nextInt();
                        input.nextLine(); //

                        Department newDept = new Department(name, locations, employees, sectionsnum, meds, managerId);

                        System.out.print("Enter Manager Start Date (YYYY-MM-DD): ");
                        newDept.setManagerStartDate(input.nextLine());

                        System.out.print("Enter number of Section IDs to add: ");
                        int sectionCount = input.nextInt();
                        for (int i = 0; i < sectionCount; i++) {
                            System.out.print("Enter Section ID " + (i + 1) + ": ");
                            newDept.addSectionID(input.nextInt());
                        }

                        departments.add(newDept);
                        System.out.println("\nDepartment successfully added:\nInformation:");
                        System.out.println(newDept);

                    } else if (choose == 9) {
                        System.out.print("Enter Section ID: ");
                        int sectionId = input.nextInt();
                        System.out.print("Enter Department ID: ");
                        int departmentId = input.nextInt();
                        input.nextLine();
                        System.out.print("Enter Section Type: ");
                        String type = input.nextLine();
                        System.out.print("Enter Section Capacity: ");
                        int capacity = input.nextInt();
                        System.out.print("Enter Number of Operations: ");
                        int ops = input.nextInt();
                        System.out.print("Enter Number of Diseases: ");
                        int diseasesnum = input.nextInt();
                        System.out.print("Enter Number of Patients: ");
                        int patientsnum = input.nextInt();
                        Section sec = new Section(departmentId, sectionId, type, capacity, ops, diseasesnum, patientsnum);
                        System.out.print("Enter number of rooms to add: ");
                        int roomCount = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < roomCount; i++) {
                            System.out.print("Enter room " + (i + 1) + ": ");
                            sec.addRoom(input.nextLine());
                        }
                        sections.add(sec);
                        System.out.println("\nSection successfully added:\nInformation: ");
                        System.out.println(sec);
                    } else {
                        System.out.println("Enter a valid choose");
                    }
                }  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (choose == 4) {
                    ////------------------------------------------------------------Delete 
                    System.out.println("What do you want to Delete\nChoose from the following actions:\n1.Doctor\n2.Patient\n3.Appoitment\n4.Medical Record\n5.Disease\n6.Medicine\n7.Operation\n8.Department\n9.Section\n");
                    choose = input.nextInt();
                    if (choose == 1) {
                        System.out.print("Enter National ID for the Doctor you want to delete: ");
                        int targetID = input.nextInt();
                        Doctor toDelete = null;

                        for (Doctor d : doctors) {
                            if (d.getNationalID() == targetID) {
                                toDelete = d;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            doctors.remove(toDelete);
                            System.out.println("Doctor with National ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No doctor found with National ID " + targetID + "\n");
                        }

                    } else if (choose == 2) {
                        System.out.print("Enter National ID for the Patient you want to delete: ");
                        int targetID = input.nextInt();
                        Patient toDelete = null;

                        for (Patient p : patients) {
                            if (p.getNationalID() == targetID) {
                                toDelete = p;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            patients.remove(toDelete);
                            System.out.println("Patient with National ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No patient found with National ID " + targetID + "\n");
                        }

                    } else if (choose == 3) {
                        System.out.print("Enter Doctor ID for the Appointment: ");
                        int docId = input.nextInt();
                        System.out.print("Enter Patient ID for the Appointment: ");
                        int patId = input.nextInt();

                        Appointment toDelete = null;

                        for (Appointment a : appointments) {
                            if (a.getDoctorId() == docId && a.getPatientId() == patId) {
                                toDelete = a;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            appointments.remove(toDelete);
                            System.out.println("Appointment deleted.\n");
                        } else {
                            System.out.println("Appointment not found.\n");
                        }

                    } else if (choose == 4) {
                        System.out.print("Enter Record ID to delete: ");
                        int targetID = input.nextInt();
                        MedicalRecord toDelete = null;

                        for (MedicalRecord r : medical_records) {
                            if (r.getRecordId() == targetID) {
                                toDelete = r;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            medical_records.remove(toDelete);
                            System.out.println("Record with ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No record found with ID " + targetID + "\n");
                        }

                    } else if (choose == 5) {
                        System.out.print("Enter ID of the Disease to delete: ");
                        int targetID = input.nextInt();
                        Disease toDelete = null;

                        for (Disease d : diseases) {
                            if (d.getId() == targetID) {
                                toDelete = d;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            diseases.remove(toDelete);
                            System.out.println("Disease with ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("Disease not found with ID " + targetID + "\n");
                        }

                    } else if (choose == 6) {
                        System.out.print("Enter ID for the Medicine you want to delete: ");
                        int targetID = new Scanner(System.in).nextInt();
                        Medicine toDelete = null;
                        for (Medicine m : medicines) {
                            if (m.getId() == targetID) {
                                toDelete = m;
                                break;
                            }
                        }
                        if (toDelete != null) {
                            medicines.remove(toDelete);
                            System.out.println("Medicine with ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No medicine found with ID " + targetID + "\n");
                        }

                    } else if (choose == 7) {
                        System.out.print("Enter ID for the Operation you want to delete: ");
                        int targetID = input.nextInt();
                        Operation toDelete = null;

                        for (Operation op : operations) {
                            if (op.getId() == targetID) {
                                toDelete = op;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            operations.remove(toDelete);
                            System.out.println("Operation with ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No operation found with ID " + targetID + "\n");
                        }

                    } else if (choose == 8) {
                        System.out.print("Enter ID for the Department you want to delete: ");
                        int targetID = input.nextInt();
                        Department toDelete = null;

                        for (Department d : departments) {
                            if (d.getDepartmentId() == targetID) {
                                toDelete = d;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            departments.remove(toDelete);
                            System.out.println("Department with ID " + targetID + " has been deleted.\n");
                        } else {
                            System.out.println("No department found with ID " + targetID + "\n");
                        }

                    } else if (choose == 9) {
                        System.out.print("Enter ID for the Section you want to delete: ");
                        int targetID = new Scanner(System.in).nextInt();
                        Section toDelete = null;

                        for (Section s : sections) {
                            if (s.getSectionId() == targetID) {
                                toDelete = s;
                                break;
                            }
                        }

                        if (toDelete != null) {
                            sections.remove(toDelete);
                            System.out.println("Section with ID " + targetID + " has been deleted\n");
                        } else {
                            System.out.println("No section found with ID " + targetID + "\n");
                        }

                    } else {
                        System.out.println("Enter a valid choose");
                    }
                }  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (choose == 5) {//------------------------------------------------------------Update
                    System.out.println("What do you want to Update\nChoose from the following actions:\n1.Doctor\n2.Patient\n3.Appoitment\n4.Medical Record\n5.Disease\n6.Medicine\n7.Operation\n8.Department\n9.Section\n");
                    choose = input.nextInt();
                    if (choose == 1) {
                        System.out.print("Enter the National ID of the doctor to update: ");
                        int targetID = input.nextInt();
                        Doctor doctorToUpdate = null;

                        for (Doctor d : doctors) {
                            if (d.getNationalID() == targetID) {
                                doctorToUpdate = d;
                                break;
                            }
                        }

                        if (doctorToUpdate != null) {
                            System.out.println("🩺 Doctor found. Old Info:\n" + doctorToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Birth Year");
                            System.out.println("3. Location");
                            System.out.println("4. Gender");
                            System.out.println("5. Social Status");
                            System.out.println("6. Phone Number");
                            System.out.println("7. Blood Type");
                            System.out.println("8. Department ID");
                            System.out.println("9. Salary");
                            System.out.println("10. Working Hours");
                            System.out.println("11. Start Date");
                            System.out.println("12. Email");
                            System.out.println("13. Work Phone");
                            System.out.println("14. Specification");
                            System.out.println("15. Years of Experience");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    doctorToUpdate.setName(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new birth year: ");
                                    doctorToUpdate.setBirthYear(input.nextInt());
                                }
                                case 3 -> {
                                    System.out.print("Enter new location: ");
                                    doctorToUpdate.setLocation(input.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Enter new gender (MALE/FEMALE/UNKNOWN): ");
                                    doctorToUpdate.setGender(Gender.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 5 -> {
                                    System.out.print("Enter new social status (SINGLE/MARRIED/OTHER): ");
                                    doctorToUpdate.setSocialStatus(SocialStatus.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 6 -> {
                                    System.out.print("Enter new phone number: ");
                                    doctorToUpdate.setPhoneNumber(input.nextLong());
                                }
                                case 7 -> {
                                    input.nextLine();
                                    System.out.print("Enter new blood type (A/B/AB/O/UNKNOWN): ");
                                    doctorToUpdate.setBloodType(BloodType.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 8 -> {
                                    System.out.print("Enter new department ID: ");
                                    doctorToUpdate.setDepartmentId(input.nextInt());
                                }
                                case 9 -> {
                                    System.out.print("Enter new salary: ");
                                    doctorToUpdate.setSalary(input.nextDouble());
                                }
                                case 10 -> {
                                    input.nextLine();
                                    System.out.print("Enter new working hours: ");
                                    doctorToUpdate.setWorkingHours(input.nextLine());
                                }
                                case 11 -> {
                                    System.out.print("Enter new start date: ");
                                    doctorToUpdate.setStartDate(input.nextLine());
                                }
                                case 12 -> {
                                    System.out.print("Enter new email: ");
                                    doctorToUpdate.setEmail(input.nextLine());
                                }
                                case 13 -> {
                                    System.out.print("Enter new work phone number: ");
                                    doctorToUpdate.setWorkingPhoneNumber(input.nextLong());
                                }
                                case 14 -> {
                                    input.nextLine();
                                    System.out.print("Enter new specification: ");
                                    doctorToUpdate.setSpecification(input.nextLine());
                                }
                                case 15 -> {
                                    System.out.print("Enter new years of experience: ");
                                    doctorToUpdate.setYearOfExperience(input.nextDouble());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Doctor updated successfully:");
                            System.out.println(doctorToUpdate);
                        } else {
                            System.out.println("No doctor found with National ID: " + targetID);
                        }

                    } else if (choose == 2) {
                        System.out.print("Enter the National ID of the patient to update: ");
                        int targetID = input.nextInt();
                        Patient patientToUpdate = null;

                        for (Patient p : patients) {
                            if (p.getNationalID() == targetID) {
                                patientToUpdate = p;
                                break;
                            }
                        }

                        if (patientToUpdate != null) {
                            System.out.println("🧑‍⚕️ Patient found. Old Info:\n" + patientToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Birth Year");
                            System.out.println("3. Location");
                            System.out.println("4. Gender");
                            System.out.println("5. Social Status");
                            System.out.println("6. Phone Number");
                            System.out.println("7. Blood Type");
                            System.out.println("8. Emergency Condition");
                            System.out.println("9. Admission Date");
                            System.out.println("10. Section ID");
                            System.out.println("11. Room");

                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    patientToUpdate.setName(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new birth year: ");
                                    patientToUpdate.setBirthYear(input.nextInt());
                                }
                                case 3 -> {
                                    System.out.print("Enter new location: ");
                                    patientToUpdate.setLocation(input.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Enter new gender (MALE/FEMALE/UNKNOWN): ");
                                    patientToUpdate.setGender(Gender.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 5 -> {
                                    System.out.print("Enter new social status (SINGLE/MARRIED/OTHER): ");
                                    patientToUpdate.setSocialStatus(SocialStatus.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 6 -> {
                                    System.out.print("Enter new phone number: ");
                                    patientToUpdate.setPhoneNumber(input.nextLong());
                                }
                                case 7 -> {
                                    input.nextLine();
                                    System.out.print("Enter new blood type (A/B/AB/O/UNKNOWN): ");
                                    patientToUpdate.setBloodType(BloodType.valueOf(input.nextLine().toUpperCase()));
                                }
                                case 8 -> {
                                    System.out.print("Is emergency condition true or false? ");
                                    patientToUpdate.setEmergencyCondition(input.nextBoolean());
                                }
                                case 9 -> {
                                    input.nextLine();
                                    System.out.print("Enter new admission date: ");
                                    patientToUpdate.setAdmissionDate(input.nextLine());
                                }
                                case 10 -> {
                                    System.out.print("Enter new section ID: ");
                                    patientToUpdate.setSectionID(input.nextInt());
                                }
                                case 11 -> {
                                    input.nextLine();
                                    System.out.print("Enter new room: ");
                                    patientToUpdate.setRoom(input.nextLine());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Patient updated successfully:");
                            System.out.println(patientToUpdate);
                        } else {
                            System.out.println("Patient not found with National ID: " + targetID);
                        }

                    } else if (choose == 3) {
                        System.out.print("Enter Doctor ID to update: ");
                        int docId = input.nextInt();
                        System.out.print("Enter Patient ID to update: ");
                        int patId = input.nextInt();
                        Appointment toUpdate = null;

                        for (Appointment a : appointments) {
                            if (a.getDoctorId() == docId && a.getPatientId() == patId) {
                                toUpdate = a;
                                break;
                            }
                        }

                        if (toUpdate != null) {
                            System.out.println("Appointment found:\n" + toUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Room");
                            System.out.println("2. Time");
                            System.out.println("3. Date");
                            System.out.println("4. Status");
                            System.out.print("Choice: ");
                            int updateChoice = input.nextInt();
                            input.nextLine();

                            switch (updateChoice) {
                                case 1 -> {
                                    System.out.print("Enter new room: ");
                                    toUpdate.setRoom(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new time: ");
                                    toUpdate.setTime(input.nextLine());
                                }
                                case 3 -> {
                                    System.out.print("Enter new date: ");
                                    toUpdate.setDate(input.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Enter new status (PENDING, COMPLETED, CANCELED): ");
                                    toUpdate.setStatus(Status.valueOf(input.nextLine().trim().toUpperCase()));
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Updated Appointment:\n" + toUpdate);
                        } else {
                            System.out.println("Appointment not found.");
                        }
                    } else if (choose == 4) {
                        System.out.print("Enter Record ID to update: ");
                        int targetId = input.nextInt();
                        MedicalRecord toUpdate = null;

                        for (MedicalRecord r : medical_records) {
                            if (r.getRecordId() == targetId) {
                                toUpdate = r;
                                break;
                            }
                        }

                        if (toUpdate != null) {
                            System.out.println("Medical Record found:\n" + toUpdate);
                            System.out.println("1. Update Cash");
                            System.out.println("2. Update Operation ID");
                            System.out.println("3. Update Disease ID");
                            System.out.println("4. Update Medicine ID");
                            System.out.println("5. Add Allergy");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new cash amount: ");
                                    toUpdate.setCash(input.nextDouble());
                                }
                                case 2 -> {
                                    System.out.print("Enter new Operation ID: ");
                                    toUpdate.setOperationID(input.nextInt());
                                }
                                case 3 -> {
                                    System.out.print("Enter new Disease ID: ");
                                    toUpdate.setDiseaseID(input.nextInt());
                                }
                                case 4 -> {
                                    System.out.print("Enter new Medicine ID: ");
                                    toUpdate.setMedicine(input.nextInt());
                                }
                                case 5 -> {
                                    System.out.print("Enter allergy to add: ");
                                    toUpdate.addAllergy(input.nextLine());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Record updated:\n" + toUpdate);
                        } else {
                            System.out.println("Record not found.");
                        }
                    } else if (choose == 5) {
                        System.out.print("Enter ID of the disease to update: ");
                        int id = input.nextInt();
                        input.nextLine();

                        Disease diseaseToUpdate = null;
                        for (Disease d : diseases) {
                            if (d.getId() == id) {
                                diseaseToUpdate = d;
                                break;
                            }
                        }

                        if (diseaseToUpdate != null) {
                            System.out.println("1. Update Name");
                            System.out.println("2. Update Contagious Status");
                            System.out.println("3. Update ID");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    diseaseToUpdate.setName(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Is the disease contagious (true/false): ");
                                    diseaseToUpdate.setContagious(input.nextBoolean());
                                }
                                case 3 -> {
                                    System.out.print("Enter new ID: ");
                                    int newId = input.nextInt();
                                    boolean idExists = diseases.stream().anyMatch(d -> d.getId() == newId);
                                    if (idExists) {
                                        System.out.println("Another disease with this ID already exists.");
                                    } else {
                                        diseaseToUpdate.setId(newId);
                                    }
                                }
                                default ->
                                    System.out.println("Invalid option.");
                            }

                            System.out.println("Updated Disease:\n" + diseaseToUpdate);
                        } else {
                            System.out.println("Disease not found.");
                        }

                    } else if (choose == 6) {
                        System.out.print("Enter the ID of the medicine to update: ");
                        int targetID = input.nextInt();
                        Medicine medToUpdate = null;

                        for (Medicine m : medicines) {
                            if (m.getId() == targetID) {
                                medToUpdate = m;
                                break;
                            }
                        }

                        if (medToUpdate != null) {
                            System.out.println("Medicine found. Old Info:\n" + medToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Dosage");
                            System.out.println("3. Add Side Effect");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    medToUpdate.setName(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new dosage: ");
                                    medToUpdate.setDosage(input.nextLine());
                                }
                                case 3 -> {
                                    System.out.print("Enter new side effect to add: ");
                                    medToUpdate.addSideEffect(input.nextLine());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }
                            System.out.println("Medicine information updated:");
                            System.out.println(medToUpdate);
                        } else {
                            System.out.println("No medicine found with ID: " + targetID);
                        }

                    } else if (choose == 7) {
                        System.out.print("Enter the Operation ID to update: ");
                        int targetID = input.nextInt();
                        Operation opToUpdate = null;

                        for (Operation op : operations) {
                            if (op.getId() == targetID) {
                                opToUpdate = op;
                                break;
                            }
                        }

                        if (opToUpdate != null) {
                            System.out.println("Operation found. Old Info:\n" + opToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Date");
                            System.out.println("3. Room");
                            System.out.println("4. Section ID");
                            System.out.println("5. Add Doctor ID");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    opToUpdate.setName(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new date (e.g., 2025/05/11): ");
                                    opToUpdate.setDate(input.nextLine());
                                }
                                case 3 -> {
                                    System.out.print("Enter new room: ");
                                    opToUpdate.setRoom(input.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Enter new section ID: ");
                                    opToUpdate.setSectionId(input.nextInt());
                                }
                                case 5 -> {
                                    System.out.print("Enter doctor ID to add: ");
                                    int newDocId = input.nextInt();
                                    opToUpdate.addDoctor(newDocId);
                                }
                                default ->
                                    System.out.println("Invalid choice");
                            }

                            System.out.println("Operation information updated:");
                            System.out.println(opToUpdate);
                        } else {
                            System.out.println("No operation found with ID: " + targetID);
                        }
                    } else if (choose == 8) {
                        System.out.print("Enter the ID of the department to update: ");
                        int targetID = input.nextInt();
                        Department deptToUpdate = null;

                        for (Department d : departments) {
                            if (d.getDepartmentId() == targetID) {
                                deptToUpdate = d;
                                break;
                            }
                        }

                        if (deptToUpdate != null) {
                            System.out.println("Department found. Old Info:\n" + deptToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Add Location");
                            System.out.println("3. Number of Employees");
                            System.out.println("4. Number of Sections");
                            System.out.println("5. Number of Medicines");
                            System.out.println("6. Manager ID");
                            System.out.println("7. Manager Start Date");
                            System.out.println("8. Add Section ID");

                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    deptToUpdate.setDepartmentName(input.nextLine());
                                }
                                case 2 -> {
                                    String[] currentLocations = deptToUpdate.getDepartmentLocations();
                                    System.out.print("Enter new location to add: ");
                                    String newLoc = input.nextLine();
                                    String[] updated = Arrays.copyOf(currentLocations, currentLocations.length + 1);
                                    updated[updated.length - 1] = newLoc;
                                    deptToUpdate.setDepartmentLocations(updated);
                                }
                                case 3 -> {
                                    System.out.print("Enter new number of employees: ");
                                    deptToUpdate.setNumberOfEmployees(input.nextInt());
                                }
                                case 4 -> {
                                    System.out.print("Enter new number of sections: ");
                                    deptToUpdate.setNumberOfSections(input.nextInt());
                                }
                                case 5 -> {
                                    System.out.print("Enter new number of medicines: ");
                                    deptToUpdate.setNumberOfMedicines(input.nextInt());
                                }
                                case 6 -> {
                                    System.out.print("Enter new manager ID: ");
                                    deptToUpdate.setDepartmentManagerId(input.nextInt());
                                }
                                case 7 -> {
                                    System.out.print("Enter new manager start date: ");
                                    deptToUpdate.setManagerStartDate(input.nextLine());
                                }
                                case 8 -> {
                                    System.out.print("Enter new section ID to add: ");
                                    deptToUpdate.addSectionID(input.nextInt());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Department information updated:");
                            System.out.println(deptToUpdate);
                        } else {
                            System.out.println("No department found with ID: " + targetID);
                        }

                    } else if (choose == 9) {
                        System.out.print("Enter the ID of the section to update: ");
                        int targetID = input.nextInt();
                        Section sectionToUpdate = null;

                        for (Section s : sections) {
                            if (s.getSectionId() == targetID) {
                                sectionToUpdate = s;
                                break;
                            }
                        }

                        if (sectionToUpdate != null) {
                            System.out.println("Section found. Old Info:\n" + sectionToUpdate);
                            System.out.println("What do you want to update?");
                            System.out.println("1. Section Type");
                            System.out.println("2. Capacity");
                            System.out.println("3. Add Room");
                            System.out.println("4. Number of Patients");
                            System.out.println("5. Number of Operations");
                            System.out.println("6. Number of Diseases");
                            System.out.print("Enter your choice: ");
                            int choice = input.nextInt();
                            input.nextLine();

                            switch (choice) {
                                case 1 -> {
                                    System.out.print("Enter new section type: ");
                                    sectionToUpdate.setSectionType(input.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new section capacity: ");
                                    sectionToUpdate.setSectionCapacity(input.nextInt());
                                }
                                case 3 -> {
                                    System.out.print("Enter room to add: ");
                                    sectionToUpdate.addRoom(input.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Enter new number of patients: ");
                                    sectionToUpdate.setNumberOfPatients(input.nextInt());
                                }
                                case 5 -> {
                                    System.out.print("Enter new number of operations: ");
                                    sectionToUpdate.setNumberOfOperations(input.nextInt());
                                }
                                case 6 -> {
                                    System.out.print("Enter new number of diseases: ");
                                    sectionToUpdate.setNumberOfDiseases(input.nextInt());
                                }
                                default ->
                                    System.out.println("Invalid choice.");
                            }

                            System.out.println("Section information updated:");
                            System.out.println(sectionToUpdate);
                        } else {
                            System.out.println("No section found with ID: " + targetID);
                        }

                    } else {
                        System.out.println("Enter a valid choose");
                    }
                }  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (choose == 0) {
                    System.out.println("Exit the program");
                }
            } else {
                System.out.println("Enter a valid input");
            }
        } while (choose != 0);

    

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}

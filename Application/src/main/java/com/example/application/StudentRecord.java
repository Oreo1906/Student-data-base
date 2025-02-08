package com.example.application;

public class StudentRecord {
    private final int srNo;
    private final String studentId;
    private final String name;
    private final String admissionYear;
    private final String currentYear;
    private final String currentSemester;
    private final String course;

    public StudentRecord(int srNo, String studentId, String name, String admissionYear, String currentYear, String currentSemester, String course) {
        this.srNo = srNo;
        this.studentId = studentId;
        this.name = name;
        this.admissionYear = admissionYear;
        this.currentYear = currentYear;
        this.currentSemester = currentSemester;
        this.course = course;
    }

    public int getSrNo() { return srNo; }
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getAdmissionYear() { return admissionYear; }
    public String getCurrentYear() { return currentYear; }
    public String getCurrentSemester() { return currentSemester; }
    public String getCourse() { return course; }
}

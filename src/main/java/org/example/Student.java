package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private List<String> marks;
    private Set<String> phone;
    private Map<String, String> course;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getMarks() {
        return marks;
    }

    public Set<String> getPhone() {
        return phone;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setMarks(List<String> marks) {
        this.marks = marks;
    }

    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public Student(int studentId, String studentName, List<String> marks, Set<String> phone, Map<String, String> course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.phone = phone;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", phone=" + phone +
                ", course=" + course +
                '}';
    }
}

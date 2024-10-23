package com.example.mobilna.api;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;


public class Grade {
    @Getter @Setter
    private String grade;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String subject;

    @Override
    public String toString() {
        return "Grade{" +
                "grade='" + grade + '\'' +
                ", description='" + description + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

package com.harkka.keskustelupalsta.entities;

public class Subject {
    private int id;
    private String subject;
    private String message;
    private String aikaleima;

    public Subject() {
        this.id = 99;
        this.subject = "Test subject";
        this.message = "Test message";
        this.aikaleima = "12:30";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAikaleima() {
        return aikaleima;
    }

    public void setAikaleima(String aikaleima) {
        this.aikaleima = aikaleima;
    }
}

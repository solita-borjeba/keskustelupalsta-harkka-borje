package com.harkka.keskustelupalsta.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Subject {
    private int id;
    private String subject;
    private String message;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date aikaleima;
    private int numberOfMessage;

    public int getNumberOfMessage() {
        return numberOfMessage;
    }

    public void setNumberOfMessage(int numberOfMessage) {
        this.numberOfMessage = numberOfMessage;
    }

    public Subject() {
        this.id = 99;
        this.subject = "Test subject";
        this.message = "Test message";
        this.aikaleima = new Date();
        this.numberOfMessage = 99;
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

    public Date getAikaleima() {
        return aikaleima;
    }

    public void setAikaleima(Date aikaleima) {
        this.aikaleima = aikaleima;
    }
}

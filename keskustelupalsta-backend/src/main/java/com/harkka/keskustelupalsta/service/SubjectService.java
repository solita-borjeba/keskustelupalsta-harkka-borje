package com.harkka.keskustelupalsta.service;

import com.harkka.keskustelupalsta.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectService {
    public List<Subject> get() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject());
        subjects.add(new Subject());
        return subjects;
    }

    public Subject create(Subject subject) {
        Subject createSubject = new Subject();
        createSubject.setId(subject.getId());
        createSubject.setSubject(subject.getSubject());
        createSubject.setMessage(subject.getMessage());
        createSubject.setAikaleima(subject.getAikaleima());

        return createSubject;
    }

}

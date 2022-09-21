package com.harkka.keskustelupalsta.service;

import com.harkka.keskustelupalsta.entities.Subject;
import com.harkka.keskustelupalsta.response.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class SubjectService {
    public ResponseEntity<Object> createSubject(Subject subject) {
        Subject newSubject = new Subject();
        newSubject.setId(subject.getId());
        newSubject.setSubject(subject.getSubject());
        newSubject.setMessage(subject.getMessage());
        newSubject.setAikaleima(subject.getAikaleima());

        //DB
        /*
        try {
            Subject createdSubject = subjectRepository.save(newSubject);
            //ToDo : Siirrä return tähän. return createdSubject;
        } catch (Exception e) {
            System.out.println("Jotain pielessä createSubject");
        }

         */

        return ResponseHandler.generateResponse("Successfully", HttpStatus.CREATED, newSubject);
        //return newSubject; //ToDo : korvaa tämä createdSubject kun kanta toimii.
    }

    public ResponseEntity<Object> getSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject());
        subjects.add(new Subject());

        return ResponseHandler.generateResponse("Successfully", HttpStatus.OK,subjects);
    }

    public ResponseEntity<Object> updateSubject(Subject subject) {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject());
        subjects.add(new Subject());

        return ResponseHandler.generateResponse("Successfully", HttpStatus.OK,subjects);
    }

    public ResponseEntity<Object> deleteSubject(Subject subject) {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject());
        subjects.add(new Subject());

        return ResponseHandler.generateResponse("Successfully", HttpStatus.NO_CONTENT,subjects);
    }

}

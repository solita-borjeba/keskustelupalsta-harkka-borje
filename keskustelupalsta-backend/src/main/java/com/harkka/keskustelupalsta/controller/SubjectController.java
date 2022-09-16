package com.harkka.keskustelupalsta.controller;

import com.harkka.keskustelupalsta.response.ResponseHandler;
import com.harkka.keskustelupalsta.entities.Subject;
import com.harkka.keskustelupalsta.service.SubjectService;
import com.harkka.keskustelupalsta.service.TestResponse;
import com.harkka.keskustelupalsta.service.TestResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.ServerSocket;
import java.net.URI;
import java.util.List;

@RestController
public class SubjectController {

    private SubjectService service;
    TestResponseService trs;

    public SubjectController() {
        this.trs = new TestResponseService();
        this.service = new SubjectService();
    }



    @PostMapping("/createSubject")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> create(@RequestBody Subject subject) {

        try {
            System.out.println("Perille tuli.");
            Subject createdSubject = service.create(subject);
            return ResponseHandler.generateResponse("Successfully", HttpStatus.OK, createdSubject);
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }
    }

    @GetMapping("/getSubject")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> getSubject() {

        try {
            List<Subject> result = service.get();
            return ResponseHandler.generateResponse("Successfully", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }


    }


    @GetMapping("/getSubjects")
    @CrossOrigin(origins = "http://localhost:3000")
    /*List<String>*/ TestResponse getSubjects() {
        return trs.get();
    }


    @PostMapping("/addSubject")
    public TestResponse addSubject(/*@RequestBody String subject*/) {
        return /*"AddSubject ei vielä toteutettu."*/ trs.get();
    }

    @PutMapping("putSubject")
    public String changeSubjectName(@RequestBody String subjectName) {
        return "Ei vielä toteutettu.";
    }

    @DeleteMapping("/deleteSubject/{id}")
    public TestResponse deleteSubject(@PathVariable long id) {
        return trs.get();
    }
}

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
    public ResponseEntity<Object> createSubject(@RequestBody Subject subject) {

        try {
            System.out.println("Perille tuli Create.");
            return service.createSubject(subject);
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }
    }

    @GetMapping("/getSubjects")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> getSubjects() {

        try {
            System.out.println("Perille tuli GetSubjects."); //OK
            return service.getSubjects();
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }


    }

    @PostMapping("/addSubject")
    public TestResponse addSubject(/*@RequestBody String subject*/) {
        return /*"AddSubject ei vielä toteutettu."*/ trs.get();
    }

    @PutMapping("/updateSubject")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> updateSubject(@RequestBody Subject subject) {

        try {
            System.out.println("Perille tuli Update.");
            return service.updateSubject(subject);
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }

    }

    @DeleteMapping("/deleteSubject")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> deleteSubject(@RequestBody Subject subject) {

        try {
            System.out.println("Perille tuli Delete.");
            return service.deleteSubject(subject);
        } catch (Exception e) {
            return ResponseHandler.generateResponse("Nou work", HttpStatus.MULTI_STATUS, null);
        }
    }
}

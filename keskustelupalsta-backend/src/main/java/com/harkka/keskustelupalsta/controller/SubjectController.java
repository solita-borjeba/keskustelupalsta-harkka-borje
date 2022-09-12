package com.harkka.keskustelupalsta.controller;

import com.harkka.keskustelupalsta.service.TestResponse;
import com.harkka.keskustelupalsta.service.TestResponseService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubjectController {

    TestResponseService trs;

    public SubjectController() {
        this.trs = new TestResponseService();
    }
    @GetMapping("/getSubjects")
    /*List<String>*/ TestResponse getSubjects() {
        return /*Arrays.asList("GetSubjects ei vielä toteutettu.")*/ trs.get();
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

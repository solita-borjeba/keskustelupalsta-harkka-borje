package com.harkka.keskustelupalsta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelController {

    @GetMapping("/wel")
    public String welcome() {
        return "Well vaan";
    }
}

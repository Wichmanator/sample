package org.wichmanator.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunkyMonkeyController {
    @RequestMapping("/")
    public String salutation() {
        return "Hello, Funky Code Monkey";
    }
}

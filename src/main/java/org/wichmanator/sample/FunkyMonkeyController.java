package org.wichmanator.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunkyMonkeyController {
    @RequestMapping("/")
    public String salutation() {
        return "Hello, Funky Code Monkey";
    }
    public int justSomeBoringMath() {
        int x = 0, y = 5;
        int total = 0;
        if (x <= 3) {
            total = ++x - y;
        }
        return total;
    }
    public String counter() {
        int count = 1;
        if (count <= 10) {
            return "Count is greater than 10";
        } else {
            return "Count is not";
        }
    }
    public String gandalfTheGrey() {
        int counter = 1;
        while (counter <= 3) {
            ++counter;
            System.out.println("you can pass");
        }
        System.out.println("YOU SHALL NOT PASS!");
        return "YOU SHALL NOT PASS!";
    }

}

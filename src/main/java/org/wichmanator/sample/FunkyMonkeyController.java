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

        int total = 0;
        for (int number = 2; number <= 8; total += number, number +=2) {

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
        for (int counter = 1; counter <= 3; counter++) {
            System.out.println("you can pass");
        }
        System.out.println("YOU SHALL NOT PASS!");
        return "YOU SHALL NOT PASS!";
    }
        /*int counter = 1;
        while (counter++ <= 3) {
            System.out.println("you can pass");
            System.out.println("YOU SHALL NOT PASS!");
            return "YOU SHALL NOT PASS!";
        }
    }*/
}

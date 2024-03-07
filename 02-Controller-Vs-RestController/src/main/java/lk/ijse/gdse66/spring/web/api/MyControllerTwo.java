package lk.ijse.gdse66.spring.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class MyControllerTwo {
    public MyControllerTwo() {
        System.out.println("MyControllerTwo()----Constructor");
    }

    @GetMapping
    public String getMethod(){
        return "index";
    }
}


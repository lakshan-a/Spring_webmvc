package lk.ijse.gdse66.spring.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MyControllerOne {
    public MyControllerOne() {
        System.out.println("MyControllerOne()-- Contractor");
    }

    @GetMapping
    public String getMethod(){
        return "MyControllerOne";
    }
}

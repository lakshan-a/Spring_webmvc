package lk.ijse.gdse66.Controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

@RestController
@RequestMapping("/one")
public class MyController1 {
    public MyController1() {
        System.out.println("MyController() - constructor");
    }

    @GetMapping
    public String getMethod(){
        return "MyController1";
    }
}

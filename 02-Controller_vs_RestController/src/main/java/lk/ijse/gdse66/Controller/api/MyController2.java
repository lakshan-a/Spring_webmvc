package lk.ijse.gdse66.Controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

@Controller
@RequestMapping("/two")
public class MyController2 {

    public MyController2() {
        System.out.println("MyController2() - constructor");
    }

    @GetMapping
    public String getMethod(){
        return "index";
    }



}

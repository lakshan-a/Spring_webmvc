package lk.ijse.gdse66.HelloSpringWebMvc.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

@RestController
@RequestMapping("/hello")
public class Hello_webmvc {

    /*public Hello_webmvc() {
        System.out.println("Hello webmvc()");
    }*/

    @GetMapping
    public String  myMethod(){
        System.out.println("MyMethod");
        return "MyMethod";
    }

    @GetMapping("/two")
    public String  myMethod2(){
        System.out.println("MyMethod");
        return "MyMethod2";
    }



}

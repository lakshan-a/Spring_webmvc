package lk.ijse.gdse66.HelloSpringWebMvc.bean;

import org.springframework.web.bind.annotation.*;

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

    /*@GetMapping("/two")
    public String  myMethod2(){
        System.out.println("MyMethod");
        return "MyMethod2";
    }*/

    @GetMapping
    public String  handleGetMethod(){
        System.out.println("MyMethod");
        return "Get";
    }

    @DeleteMapping
    public String  handleDeleteMethod(){
        System.out.println("Delete");
        return "Delete";
    }

    @PostMapping
    public String  handlePostMethod(){
        System.out.println("Post");
        return "Post";
    }

    @PutMapping
    public String  handlePutMethod(){
        System.out.println("Put");
        return "Put";
    }



}

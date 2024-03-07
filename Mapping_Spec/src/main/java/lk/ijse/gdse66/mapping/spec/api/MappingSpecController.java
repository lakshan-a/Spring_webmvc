package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/customer")
public class MappingSpecController {

    @GetMapping
    public String getMethod(){
        return "GetMethod";
    }

    @GetMapping
    public String getMethod2(){
        return "GetMethod2()";
    }

}

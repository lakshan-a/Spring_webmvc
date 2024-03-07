package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @GetMapping
    public String getMethodWithParam1(String id){
        return String.format("getMethodWithParam1(String id): %s",id);
    }

    @GetMapping(params = "age")
    public String getMethodWithParam2( int age){
        return String.format("getMethodWithParam2(int age): %s",age);
    }

    @GetMapping(params = "age")
    public String getMethodWithParam3( int age){
        return String.format("getMethodWithParam2(int age): %s",age);
    }


}

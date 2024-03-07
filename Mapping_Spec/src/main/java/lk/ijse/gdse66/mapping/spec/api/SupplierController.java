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
    public String getMethod1(@RequestParam(required = false) String id){
        return String.format("getMethod1(String id): %s",id);
    }

    @GetMapping(params = "age")
    public String getMethod2( int age){
        return String.format("getMethod2(int age): %s",age);
    }

    @GetMapping(params = {"id","name","age"})
    public String getMethod3(@RequestParam("id") String CusId,String name, int age){
        return String.format("getMethod3(String id,String name, int age): %s,%s,%s",CusId,name,age);
    }


}

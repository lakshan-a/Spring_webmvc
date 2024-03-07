package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.WildcardType;

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


/*  path Mapping  */

    @GetMapping(path = "/ijse")
    public String getMethod2(){
        return "GetMethod2()";
    }

    @GetMapping(path = "/ijse/gdse")
    public String getMethod3(){
        return "GetMethod3()";
    }

    /*  Character Mapping  */

    @GetMapping("/ijse/gd?se")
//    @GetMapping("/ijse/gdse?")
    public String getMethod4(){
        return "GetMethod4()";
    }

    /* Wildcard Mapping */

//    @GetMapping("/ijse/gdse/*")
//    @GetMapping("/ijse/*/*/gdse")
    public String getMethod5(){
        return "GetMethod5()";
    }

    @GetMapping("/ijse/galle/*")
    public String getMethod6(){
        return "GetMethod6()";
    }

    @GetMapping("/batch*")
    public String getMethod7(){
        return "GetMethod7()";
    }



}

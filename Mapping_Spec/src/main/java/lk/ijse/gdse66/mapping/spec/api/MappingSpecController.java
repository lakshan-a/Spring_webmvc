package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController("/map")
public class MappingSpecController {

    public String getMethod(){
        return "getMethod";
    }
}

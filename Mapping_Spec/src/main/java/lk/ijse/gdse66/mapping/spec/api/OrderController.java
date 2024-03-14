package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/14/2024
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String getOrder(String token){
        return String.format("grtAllOrder(token=%s",token);
    }
}

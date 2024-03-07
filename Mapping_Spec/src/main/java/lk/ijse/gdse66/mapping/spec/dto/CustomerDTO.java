package lk.ijse.gdse66.mapping.spec.dto;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

public class CustomerDTO {
    private String id;
    private String name;
    private int age;


    public CustomerDTO(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

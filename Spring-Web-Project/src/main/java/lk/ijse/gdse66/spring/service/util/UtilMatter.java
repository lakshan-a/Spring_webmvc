package lk.ijse.gdse66.spring.service.util;

import java.util.UUID;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

public class UtilMatter {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}

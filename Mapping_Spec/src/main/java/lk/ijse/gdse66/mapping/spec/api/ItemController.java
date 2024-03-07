package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/7/2024
 */

@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String SaveItemJson(){
        return "String SaveItemJson(): I  accept only application/Json";
    }

    @PostMapping(consumes = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String SaveItemXml(){
        return "String SaveItemJson(): I  accept only application/Xml";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String SaveItemMultipartFormData(){
        return "String SaveItemJson(): I  accept only Multipart/form-Data(";
    }

    @PostMapping(consumes = MediaType.M)
    public String SaveItemUrl(){
        return "String SaveItemJson(): I  accept only application/Url(";
    }
}

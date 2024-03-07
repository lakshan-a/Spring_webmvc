package lk.ijse.gdse66.mapping.spec.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String SaveItemXml(){
        return "String SaveItemXml(): I  accept only application/Xml";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String SaveItemMultipartFormData(){
        return "String SaveItemMultipartFormData(): I  accept only Multipart/form-Data";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String SaveItemUrl(){
        return "String SaveItemUrl(): I  accept only application/Url";
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String GetItemAsJson(){
        return "GetItemJson";
    }

    /*@GetMapping(produces = MediaType.APPLICATION_XML_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String GetItem(){
        return "GetItem()";
    }*/

    @GetMapping(headers = {"produces = MediaType.APPLICATION_XML_VALUE",
                "consumes = MediaType.APPLICATION_JSON_VALUE"})
    public String GetItem(){
        return "GetItem()";
    }


}

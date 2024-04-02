package lk.ijse.gdse66.spring.api;

import jakarta.validation.Valid;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.dto.ItemDto;
import lk.ijse.gdse66.spring.service.CustomerService;
import lk.ijse.gdse66.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ItemDto> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveItem(@Valid @RequestPart("code") String itemCode,
                             @RequestPart("name") String itemName,
                             @RequestPart("price") Double itemPrice,
                             @RequestPart("Qty") int itemQty) {
//        String base64ProfilePic = Base64.getEncoder().encodeToString(profilePic.getBytes());
        ItemDto item = new ItemDto(itemCode, itemName, itemPrice, itemQty);
        itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable("id") String id){
        itemService.deleteItem(id);
    }

}

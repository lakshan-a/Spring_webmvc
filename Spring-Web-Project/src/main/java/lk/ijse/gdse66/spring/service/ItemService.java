package lk.ijse.gdse66.spring.service;

import lk.ijse.gdse66.spring.dto.ItemDto;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */
public interface ItemService {

    List<ItemDto> getAllItems();

    ItemDto getItemDetails(String id);

    ItemDto saveItem(ItemDto itemDto);

    void updateItem(ItemDto itemDto);

    void deleteItem(String id);
}

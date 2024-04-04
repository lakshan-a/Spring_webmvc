package lk.ijse.gdse66.spring.service.impl;

import lk.ijse.gdse66.spring.dto.ItemDto;
import lk.ijse.gdse66.spring.repositories.ItemRepo;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import lk.ijse.gdse66.spring.service.util.Transformer;
import lk.ijse.gdse66.spring.service.util.UtilMatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */

@Service
@Transactional
public class ItemServiceImpl implements lk.ijse.gdse66.spring.service.ItemService {


    @Autowired
    ItemRepo repo;

    ArrayList<ItemDto> itemList = new ArrayList<>();


    @Autowired
    Transformer transformer;

    @Override
    public List<ItemDto> getAllItems() {
        return repo.findAll().stream().map(item -> transformer.fromItemEntity(item)).toList();
    }

    @Override
    public ItemDto getItemDetails(String id) {
        if (!repo.existsById(id)){
            throw new NotFoundException("Item Code :" + id +"Dones not exis");
        }
        return transformer.fromItemEntity(repo.findById(id).get());
    }

    @Override
    public ItemDto saveItem(ItemDto itemDto) {
        itemDto.setItemCode(UtilMatter.generateId());
        return transformer.fromItemEntity(repo.save(transformer.toItemEntity(itemDto)));
    }

    @Override
    public void updateItem(ItemDto itemDto) {
        if (!repo.existsById(itemDto.getItemCode())){
            throw new NotFoundException("Update Filled Id :" + itemDto.getItemCode() +"Does not exist");
        }
        repo.save(transformer.toItemEntity(itemDto));
    }

    @Override
    public void deleteItem(String id) {
        if (!repo.existsById(id)){
            throw new NotFoundException("Delete Filled Code :" + id +"Does not exist");
        }
        repo.deleteById(id);
    }
}

package com.niiodm.itemtracker.service.item;

import com.niiodm.itemtracker.data.model.Item;
import com.niiodm.itemtracker.data.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}

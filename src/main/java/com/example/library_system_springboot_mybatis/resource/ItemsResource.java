package com.example.library_system_springboot_mybatis.resource;

import com.example.library_system_springboot_mybatis.mappers.ItemsMapper;
import com.example.library_system_springboot_mybatis.model.Items;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/items")
public class ItemsResource {
    private ItemsMapper itemsMapper;
    public ItemsResource(ItemsMapper itemsMapper) {
        this.itemsMapper = itemsMapper;
    }
   // public ItemsResource(){}


  /*  @GetMapping("/all")
    public List<Items> getAll(){
        return itemsMapper.findAll();
    }
    @GetMapping("/insertion")
    public String insertion(){
        Items items =new Items();
        items.setAuthNo(3);
        items.setTitle("Into the darkness");
        items.setEdition("Horror Edition");
        items.setCategory("Romans");
        items.setPrice(35);
        itemsMapper.insert(items);
        return "SUCCESSFUL INSERTION";
        // return usersMapper.findAll();

    }
    @GetMapping("/update")
    private String update()
    {
        Items items=new Items();
        itemsMapper.update(items);
        return "SUCCESSFUL UPDATE";
    }
    @GetMapping("/delete")
    private String delete()
    {
        Items items =new Items();
        itemsMapper.delete(items);
        return "SUCCESSFUL DELETION";
    }*/



}

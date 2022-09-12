package com.vue.minwoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.minwoo.entity.Item;
import com.vue.minwoo.repository.ItemRepository;

@RestController
public class HomeController {
  @Autowired
  ItemRepository itemRepository;

  @GetMapping(value = "/api/items")
  public List<Item> getItems(){
    List<Item> items = itemRepository.findAll();
    return items;
  }
}

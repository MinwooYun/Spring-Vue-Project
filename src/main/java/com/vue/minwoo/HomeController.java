package com.vue.minwoo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @GetMapping(value = "/api/items")
  public List<String> getItems(){
    List<String> items = Arrays.asList("alpha", "beta", "gamma");
    return items;
  }
}

package com.vue.minwoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vue.minwoo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
  
}

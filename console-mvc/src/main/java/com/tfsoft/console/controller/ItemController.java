package com.tfsoft.console.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tfsoft.console.pojo.Item;
import com.tfsoft.console.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	@ResponseBody
	@RequestMapping(value="/selectItemByItemId/{itemId}",method=RequestMethod.GET)
	public Item selectItemByItemId(@PathVariable Long itemId){
		Item item = itemService.selectItemByItemId(itemId);
		return item;
	}
}

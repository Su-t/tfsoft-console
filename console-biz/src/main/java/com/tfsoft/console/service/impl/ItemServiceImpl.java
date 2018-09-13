package com.tfsoft.console.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfsoft.console.mapper.ItemMapper;
import com.tfsoft.console.pojo.Item;
import com.tfsoft.console.pojo.ItemExample;
import com.tfsoft.console.pojo.ItemExample.Criteria;
import com.tfsoft.console.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public Item selectItemByItemId(long itemId) {
		ItemExample itemExample = new ItemExample();
		Criteria criteria = itemExample.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<Item> items = itemMapper.selectByExample(itemExample);
		if(items != null && items.size()>0){
			Item item = items.get(0);
			return item;
		}
		return null;
	}

}

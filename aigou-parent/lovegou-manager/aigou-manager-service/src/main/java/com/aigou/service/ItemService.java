package com.aigou.service;

import com.aigou.pojo.Item;

/**
 * 商品信息服务
 * 的接口
 * @author hebin
 *
 */
public interface ItemService {
	//根据商品的id取得商品
	public Item getItemById(long itemId);
}

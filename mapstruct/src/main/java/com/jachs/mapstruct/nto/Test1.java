package com.jachs.mapstruct.nto;

import com.google.gson.Gson;
import com.jachs.mapstruct.nto.domain.Item;
import com.jachs.mapstruct.nto.domain.Sku;
import com.jachs.mapstruct.nto.mapper.ItemConverter;
import com.jachs.mapstruct.nto.model.SkuDTO;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Test1 {
	static Gson gson = new Gson();

	public static void main(String[] args) {
		Item item = new Item(1L, "iPhone X");
		Sku sku = new Sku(2L, "phone12345", 1000000);
		SkuDTO skuDTO = ItemConverter.INSTANCE.domain2dto(item, sku);

		System.out.println(skuDTO.getSkuId() + "\t" + sku.getId());
		System.out.println(skuDTO.getSkuCode() + "\t" + sku.getCode());
		System.out.println(skuDTO.getSkuPrice() + "\t" + sku.getPrice());
		System.out.println(skuDTO.getItemId() + "\t" + sku.getId());
		System.out.println(skuDTO.getItemName() + "\t" + item.getTitle());
		
		
		System.out.println(gson.toJson(item));
		System.out.println(gson.toJson(sku));
		System.out.println(gson.toJson(skuDTO));
	}
}

package com.jachs.mapstruct.nto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.jachs.mapstruct.nto.domain.Item;
import com.jachs.mapstruct.nto.domain.Sku;
import com.jachs.mapstruct.nto.model.SkuDTO;

@Mapper
public interface ItemConverter {
    ItemConverter INSTANCE = Mappers.getMapper(ItemConverter.class);

    @Mappings({
            @Mapping(source = "sku.id",target = "skuId"),
            @Mapping(source = "sku.code",target = "skuCode"),
            @Mapping(source = "sku.price",target = "skuPrice"),
            @Mapping(source = "item.id",target = "itemId"),
            @Mapping(source = "item.title",target = "itemName")
    })
    SkuDTO domain2dto(Item item, Sku sku);
}

package com.jachs.mapstruct.nto.model;

public class SkuDTO {
	private Long skuId;
	private String skuCode;
	private Integer skuPrice;
	private Long itemId;
	private String itemName;

	public SkuDTO() {
		super();
	}

	public SkuDTO(Long skuId, String skuCode, Integer skuPrice, Long itemId, String itemName) {
		super();
		this.skuId = skuId;
		this.skuCode = skuCode;
		this.skuPrice = skuPrice;
		this.itemId = itemId;
		this.itemName = itemName;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getSkuPrice() {
		return skuPrice;
	}

	public void setSkuPrice(Integer skuPrice) {
		this.skuPrice = skuPrice;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}

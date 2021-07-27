package com.jachs.mapstruct.nto.domain;

public class Sku {
	private Long id;
    private String code;
    private Integer price;
    
	public Sku() {
		super();
	}
	public Sku(Long id, String code, Integer price) {
		super();
		this.id = id;
		this.code = code;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
    
    
}

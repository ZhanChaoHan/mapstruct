package com.jachs.mapstruct.nto.domain;

public class Item {
	private Long id;
    private String title;
    
	public Item() {
		super();
	}
	public Item(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    
}

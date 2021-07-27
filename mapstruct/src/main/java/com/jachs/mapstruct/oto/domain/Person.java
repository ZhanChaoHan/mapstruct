package com.jachs.mapstruct.oto.domain;


import java.util.Date;


public class Person {
    private Long id;
    private String name;
    private String email;
    private Date birthday;
    
	public Person() {
		super();
	}
	public Person(Long id, String name, String email, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
    
}

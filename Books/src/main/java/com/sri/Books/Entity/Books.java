package com.sri.Books.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")

public class Books {
	@Id
	private int id;
	
	private int bNum;
	
	private String bName;
	
	private String date;
	
	private String mob;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Books() {}

	public Books(int id, int bNum, String bName, String date, String mob, String name) {
		super();
		this.id = id;
		this.bNum = bNum;
		this.bName = bName;
		this.date = date;
		this.mob = mob;
		this.name = name;
	}
	
	

}

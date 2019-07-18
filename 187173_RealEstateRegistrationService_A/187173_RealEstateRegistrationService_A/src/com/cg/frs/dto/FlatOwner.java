package com.cg.frs.dto;

public class FlatOwner {
	private int id;
	private String name;
	private long mobNumber;
	
	public FlatOwner() {
		
	}
	
	public FlatOwner(int id, String name, String mobNumber) {
		this.id = id;
		this.name = name;
		this.mobNumber = Long.parseLong(mobNumber);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getMobNumber() {
		return mobNumber;
	}
}

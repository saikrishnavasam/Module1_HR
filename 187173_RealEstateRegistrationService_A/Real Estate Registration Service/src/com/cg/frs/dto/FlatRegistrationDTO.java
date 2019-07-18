package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int flatId = 1000;
	private String flatType;
	private String flatArea;
	private String flatRent;
	private String flatDeposit;
	
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public double getFlatArea() {
		return Double.parseDouble(flatArea);
	}
	public void setFlatArea(String flatArea) {
		this.flatArea = flatArea;
	}
	public long getFlatRent() {
		return Long.parseLong(flatRent);
	}
	public void setFlatRent(String flatrent) {
		this.flatRent = flatrent;
	}
	public long getFlatDeposit() {
		return Long.parseLong(flatDeposit);
	}
	public void setFlatDeposit(String flatDeposit) {
		this.flatDeposit = flatDeposit;
	}
	
	@Override
	public String toString() {
		return "flatId=" + flatId + "\nflatType=" + flatType + "\nflatArea=" + flatArea
				+ "\nflatRent=" + flatRent + "\nflatDeposit=" + flatDeposit+"\n";
	}
}
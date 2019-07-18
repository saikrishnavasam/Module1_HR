//User Interface which displays the menu and accept the input from user
package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;

public class Client {
	//abstraction
	private FlatRegistrationDTO flat = getRegistration();
	private FlatRegistrationServiceImpl frs = getFlatRegistration();
	Scanner sc = new Scanner(System.in);
	
	public Client() {
		while(true) {
			String input = getInput(); //taking input by calling method
			switch(input) {
				case "1":
						System.out.println("Existing Owner IDs Are:-" + frs.getAllOwnersId()); //get owners ID
						int id;
						while(true) {
							System.out.print("Please enter your owner id from above list:");
							id = sc.nextInt();
							if(frs.isPresent(id)==false) {
								System.out.println("owner does not exists");
							}
							else {
								break;
							}
						}
						String fType;
						while(true) {
							System.out.print("Select Flat Type(1-1BHK, 2-2BHK):");
							fType = sc.next();
							if(fType.equals("1")||fType.equals("2")) {
								break;
							}
							else {
								System.out.println("\t\tchoice should be 1 or 2.");
							}
						}
						System.out.print("Enter Flat are in sq. ft:");
						String fArea = sc.next();
						System.out.print("Enter desired rent amount Rs:");
						String fRent = sc.next();
						String fDeposit;
						while(true) {
							System.out.print("Enter desired deposit amount Rs:");
							fDeposit = sc.next();
							if(Long.parseLong(fDeposit)>Long.parseLong(fRent)) {
								break;
							}
							else{
								System.out.println("\n\t\tDeposit Amount should be greater than Rent Amount.");
							}
						}
						flat = getRegistration();
						flat.setFlatArea(fArea);
						flat.setFlatDeposit(fDeposit);
						flat.setFlatRent(fRent);
						flat.setFlatType(fType);
						FlatRegistrationDTO flat1 = getRegistration(); //object creation of FlatRegistrationDTO
						flat1 = frs.registerFlat(flat); //getting object of FlatRegistrationDTO for printing ID
						System.out.println("Flat successfully registered. Registration id:"+ flat1.getFlatId()); //registration id is fetched from DAO
						break;
				case "2":
						System.out.println("Flat registration details : ");
						ArrayList<FlatRegistrationDTO> al = frs.getFlatDetails();
						if(al!=null)
							al.stream().forEach(System.out::println);
						else
							System.out.println("\t\tWrong Registration Id.");
						break;
				case "3":
						System.out.println("Thank You!");
						System.exit(0);
			}
		}
	}
	
	public String getInput() {
		System.out.println("1. Register Flat");
		System.out.println("2. Display Flat Registration Details");
		System.out.println("3. Exit");
		return sc.next();
	}
	
	public static void main(String[] args) {
		new Client();
	}
	private FlatRegistrationServiceImpl getFlatRegistration() {
		return new FlatRegistrationServiceImpl();
	}
	private FlatRegistrationDTO getRegistration(){
		return new FlatRegistrationDTO();
	}
}

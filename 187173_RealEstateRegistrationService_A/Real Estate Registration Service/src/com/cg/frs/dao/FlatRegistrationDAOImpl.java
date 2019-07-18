//Data Access Logic class
package com.cg.frs.dao;

import java.util.*;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {
	
	Map<Integer, FlatOwner> owners = new HashMap<>();
	Map<Integer, FlatRegistrationDTO> flatDetails = new HashMap<>();
	FlatRegistrationDTO frdo = getFlatregistration();
	
	public FlatRegistrationDAOImpl() {
		//Parameterized Constructor is called and values are stored in HashMap
		owners.put(1, new FlatOwner(1, "Vaishali", "9023002122"));
		owners.put(2, new FlatOwner(2, "Megha", "9643221234"));
		owners.put(3, new FlatOwner(3, "Manish", "5453221234"));
	}

	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		double temp = Math.random()*10000;
		int id = (int)temp;
		//System.out.println("Random " + id);
		flat.setFlatId(id);
		flatDetails.put(id, flat);
		//System.out.println("HashMap Flat Details :\n" + flatDetails);
		return flat;
	}
	
	public FlatRegistrationDTO getFlatDetails(int id){
		//ArrayList<FlatRegistrationDTO> al1 = new ArrayList<>();
		//FlatRegistrationDTO frdo = (FlatRegistrationDTO) flatDetails.values();
		//al1.add(frdo);
		//System.out.println(al1);
		//return al1;
		FlatRegistrationDTO flat = null;
		if(flatDetails.containsKey(id)) {
		flat = flatDetails.get(id);
		}
		return flat;
	}

	@Override
	public ArrayList<Integer> getOwnersId() {
		ArrayList<Integer> al = new ArrayList<>();
		Set<Integer> s = owners.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			al.add(itr.next());
		}
		return al;
	}

	@Override
	public boolean isPres(int id) {
		if(owners.containsKey(id)) {
			return true;
		}
		return false;
	}
	private FlatRegistrationDTO getFlatregistration(){
		return new FlatRegistrationDTO();
	}
}

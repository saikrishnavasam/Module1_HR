//service utility class
package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {

	private FlatRegistrationDAOImpl frd = getFlatRegisteration();
	
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		frd.registerFlat(flat);
		return flat;
	}

	@Override
	public ArrayList<Integer> getAllOwnersId() {
		ArrayList<Integer> al = frd.getOwnersId();
		return al;
	}

	@Override
	public boolean isPresent(int id) {
		if(frd.isPres(id)==true) {
			return true;
		}
		return false;
	}

	public FlatRegistrationDAOImpl getFlatRegisteration() {
		return new FlatRegistrationDAOImpl();
	}

	@Override
	public ArrayList<FlatRegistrationDTO> getFlatDetails() {
		return frd.getFlatDetails();
	}
}

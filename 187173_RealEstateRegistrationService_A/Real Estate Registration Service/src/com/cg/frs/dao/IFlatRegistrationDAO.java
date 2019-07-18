//Data Access Logic interface
package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationDAO {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	ArrayList<Integer> getOwnersId();
	FlatRegistrationDTO getFlatDetails(int id);
	boolean isPres(int id);
}

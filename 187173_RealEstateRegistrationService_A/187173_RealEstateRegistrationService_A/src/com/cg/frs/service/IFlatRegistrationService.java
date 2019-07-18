//service utility interface
package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationService {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	ArrayList<Integer> getAllOwnersId();
	ArrayList<FlatRegistrationDTO> getFlatDetails();
	boolean isPresent(int id);
}

package com.example.addressbook.services;

import java.util.List;
import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int contactId);
	
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
	
	AddressBookData updateAddressBookData(int contactId,AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int contactId);
}

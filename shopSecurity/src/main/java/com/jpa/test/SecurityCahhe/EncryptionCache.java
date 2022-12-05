package com.jpa.test.SecurityCahhe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.jpa.test.securityModel.EncryptionGlobalModel;
import com.jpa.test.securityModel.EncryptionGlobalModel.DekModel;

public class EncryptionCache {
	
	
	private static Map<Long, EncryptionGlobalModel> encMap = new ConcurrentHashMap<>();
	private static EncryptionGlobalModel encglobModel = null;
	
	
	
	public EncryptionCache() {
		
	}



	public static void popuateencGlobMap(Map<Long, EncryptionGlobalModel> encfill) throws Exception
	{
		encMap = encfill;
		
		for(EncryptionGlobalModel model : encMap.values())
		{
			if("Y".equals(model.getIsAvtive()))
			{
				encglobModel = model;
				break;
			}
		}
	}
	
	public static List<DekModel> encList(Map<Long, EncryptionGlobalModel> encMap)
	{
		Collection<EncryptionGlobalModel> model = encMap.values();
		List<DekModel> list = new ArrayList<EncryptionGlobalModel.DekModel>();
		for(EncryptionGlobalModel enc : model)
		{
			DekModel dekModel = new EncryptionGlobalModel.DekModel(enc.getId(), enc.getDek(), enc.getDekSalt());
			list.add(dekModel);
		}
		
		return list;
	}
	
	/**
	 * pass encryptionFlag as true if you want to encrypt the data.
	 * pass encryptionFlag as false if you want to decrypt the data.
	 * 
	 * @param encryptionFlag true and id is null :- This will return active DEK always.
	 * @param encryptionFlag false and id is null :- it will return empty DEKModel object.
	 * @param encryptionFlag false and id is not null :- it will return the corresponding DEKModel for id. 
	*/
	public static DekModel fetchDek(boolean flag, Long id)
	{
		DekModel result = null;
		if(flag == true)
		{
			if(encglobModel == null)
			{
				result = new EncryptionGlobalModel.DekModel(null, null, null);
			}
			else
			{
				result = new EncryptionGlobalModel.DekModel(encglobModel.getId(), encglobModel.getDek(), encglobModel.getDekSalt());
			}
		}
		else
		{
			if(id == null)
			{
				result = new EncryptionGlobalModel.DekModel(null, null, null);
			}
			else
			{
				EncryptionGlobalModel map = encMap.get(id);
				result = new EncryptionGlobalModel.DekModel(map.getId(), map.getDek(), map.getDekSalt());
			}
		}
		return result;
	}
	

}

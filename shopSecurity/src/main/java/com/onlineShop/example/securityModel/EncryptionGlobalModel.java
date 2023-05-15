package com.onlineShop.example.securityModel;

public final class EncryptionGlobalModel {
	
	private Long id;
	private String dek;
	private String dekSalt;
	private String kek;
	private String kekSalt;
	private String isAvtive;
	
	
	public EncryptionGlobalModel(Long id, String dek, String dekSalt, String kek, String kekSalt, String isActive) {
		
		this.id = id;
		this.dek = dek;
		this.dekSalt = dekSalt;
		this.kek = kek;
		this.kekSalt = kekSalt;
		this.isAvtive = isActive;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDek() {
		return dek;
	}


	public void setDek(String dek) {
		this.dek = dek;
	}


	public String getDekSalt() {
		return dekSalt;
	}


	public void setDekSalt(String dekSalt) {
		this.dekSalt = dekSalt;
	}


	public String getKek() {
		return kek;
	}


	public void setKek(String kek) {
		this.kek = kek;
	}


	public String getKekSalt() {
		return kekSalt;
	}


	public void setKekSalt(String kekSalt) {
		this.kekSalt = kekSalt;
	}


	public String getIsAvtive() {
		return isAvtive;
	}


	public void setIsAvtive(String isAvtive) {
		this.isAvtive = isAvtive;
	}
	
	
	public final static class DekModel
	{
		private Long id;
		private String dek;
		private String dekSalt;
		public DekModel(Long id, String dek, String dekSalt) {
			
			this.id = id;
			this.dek = dek;
			this.dekSalt = dekSalt;
		}
		
	}
	
	public final static class KekModel
	{
		private String kek;
		private String kekSalt;
		public KekModel(String kek, String kekSalt) {
		
			this.kek = kek;
			this.kekSalt = kekSalt;
		}
		
	}
	
	

}

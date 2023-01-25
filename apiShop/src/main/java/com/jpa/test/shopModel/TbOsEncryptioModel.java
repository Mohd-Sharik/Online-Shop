package com.jpa.test.shopModel;

import java.util.Date;

public class TbOsEncryptioModel {
	
	
	
    private Long id;
	private String key;
	private String salt;
	private String isActv;
	private String kekJksPath;
	private String kekJksPswd;
	private String custodian1Key;
	private String custodian1Salt;
	private String custodian2Key;
	private String custodian2Salt;
	private String crtBy;
	private Date crtTs;
	private String updBy;
	private Date updTs;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getIsActv() {
		return isActv;
	}
	public void setIsActv(String isActv) {
		this.isActv = isActv;
	}
	public String getKekJksPath() {
		return kekJksPath;
	}
	public void setKekJksPath(String kekJksPath) {
		this.kekJksPath = kekJksPath;
	}
	public String getKekJksPswd() {
		return kekJksPswd;
	}
	public void setKekJksPswd(String kekJksPswd) {
		this.kekJksPswd = kekJksPswd;
	}
	public String getCustodian1Key() {
		return custodian1Key;
	}
	public void setCustodian1Key(String custodian1Key) {
		this.custodian1Key = custodian1Key;
	}
	public String getCustodian1Salt() {
		return custodian1Salt;
	}
	public void setCustodian1Salt(String custodian1Salt) {
		this.custodian1Salt = custodian1Salt;
	}
	public String getCustodian2Key() {
		return custodian2Key;
	}
	public void setCustodian2Key(String custodian2Key) {
		this.custodian2Key = custodian2Key;
	}
	public String getCustodian2Salt() {
		return custodian2Salt;
	}
	public void setCustodian2Salt(String custodian2Salt) {
		this.custodian2Salt = custodian2Salt;
	}
	public String getCrtBy() {
		return crtBy;
	}
	public void setCrtBy(String crtBy) {
		this.crtBy = crtBy;
	}
	public Date getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(Date crtTs) {
		this.crtTs = crtTs;
	}
	public String getUpdBy() {
		return updBy;
	}
	public void setUpdBy(String updBy) {
		this.updBy = updBy;
	}
	public Date getUpdTs() {
		return updTs;
	}
	public void setUpdTs(Date updTs) {
		this.updTs = updTs;
	}
	
	
	
	
	
	

}

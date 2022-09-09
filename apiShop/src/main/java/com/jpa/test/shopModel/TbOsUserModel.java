package com.jpa.test.shopModel;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class TbOsUserModel {
	
	private Long id;
	private String refId;
	private String pswd;
	private String fullNm;
	private String dsplNm;
	private String email;
	private String cntctInfo;
	private String cntctNumber;
	private String location;
	private Long fldLgnCnt;
	private Date lstLgnCnt;
	private Date exprTs;
	private String pswdCrtBy;
	private String userState;
	private String sessionId;
	private String ldapAuth;
	private String skipInactvn;
	private Date crtTs;
	private String crtBy;
	private Date updTs;
	private String updBy;
	private Date dltTs;
	private String dltBy;
	private Long encKeyId;
	
	private String UpdTsString;
	private String CrtTsString;
	private String dltTsString;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getFullNm() {
		return fullNm;
	}
	public void setFullNm(String fullNm) {
		this.fullNm = fullNm;
	}
	public String getDsplNm() {
		return dsplNm;
	}
	public void setDsplNm(String dsplNm) {
		this.dsplNm = dsplNm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCntctInfo() {
		return cntctInfo;
	}
	public void setCntctInfo(String cntctInfo) {
		this.cntctInfo = cntctInfo;
	}
	public String getCntctNumber() {
		return cntctNumber;
	}
	public void setCntctNumber(String cntctNumber) {
		this.cntctNumber = cntctNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getFldLgnCnt() {
		return fldLgnCnt;
	}
	public void setFldLgnCnt(Long fldLgnCnt) {
		this.fldLgnCnt = fldLgnCnt;
	}
	public Date getLstLgnCnt() {
		return lstLgnCnt;
	}
	public void setLstLgnCnt(Date lstLgnCnt) {
		this.lstLgnCnt = lstLgnCnt;
	}
	public Date getExprTs() {
		return exprTs;
	}
	public void setExprTs(Date exprTs) {
		this.exprTs = exprTs;
	}
	public String getPswdCrtBy() {
		return pswdCrtBy;
	}
	public void setPswdCrtBy(String pswdCrtBy) {
		this.pswdCrtBy = pswdCrtBy;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getLdapAuth() {
		return ldapAuth;
	}
	public void setLdapAuth(String ldapAuth) {
		this.ldapAuth = ldapAuth;
	}
	public String getSkipInactvn() {
		return skipInactvn;
	}
	public void setSkipInactvn(String skipInactvn) {
		this.skipInactvn = skipInactvn;
	}
	public Date getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(Date crtTs) {
		this.crtTs = crtTs;
	}
	public String getCrtBy() {
		return crtBy;
	}
	public void setCrtBy(String crtBy) {
		this.crtBy = crtBy;
	}
	public Date getUpdTs() {
		return updTs;
	}
	public void setUpdTs(Date updTs) {
		this.updTs = updTs;
	}
	public String getUpdBy() {
		return updBy;
	}
	public void setUpdBy(String updBy) {
		this.updBy = updBy;
	}
	public Date getDltTs() {
		return dltTs;
	}
	public void setDltTs(Date dltTs) {
		this.dltTs = dltTs;
	}
	public String getDltBy() {
		return dltBy;
	}
	public void setDltBy(String dltBy) {
		this.dltBy = dltBy;
	}
	public Long getEncKeyId() {
		return encKeyId;
	}
	public void setEncKeyId(Long encKeyId) {
		this.encKeyId = encKeyId;
	}
	
	
	
	
	
	
	
	public String getUpdTsString() {
		return UpdTsString;
	}
	public void setUpdTsString(String updTsString) {
		UpdTsString = updTsString;
	}
	public String getCrtTsString() {
		return CrtTsString;
	}
	public void setCrtTsString(String crtTsString) {
		CrtTsString = crtTsString;
	}
	public String getDltTsString() {
		return dltTsString;
	}
	public void setDltTsString(String dltTsString) {
		this.dltTsString = dltTsString;
	}
	public String validate()
	{
		StringBuilder result = new StringBuilder();
		
		Boolean flag = StringUtils.isEmpty(refId);
		if(flag)
		{
			result.append("RefId must Not be Empty : "+refId);
		}
		
		flag = StringUtils.isEmpty(pswd);
		if(flag)
		{
			result.append("password Must not be Empty : "+pswd);
		}
		flag = StringUtils.isEmpty(fullNm);
		if(flag)
		{
			result.append("Full Name must not be Empty : "+fullNm);
		}
		
		flag = StringUtils.isEmpty(dsplNm);
		if(flag)
		{
			result.append("Display Name must not be Empty : "+dsplNm);
		}
		
		flag = StringUtils.isEmpty(userState);
		if(flag)
		{
			result.append("User State must not be Empty : "+userState);
		}
		
		flag = StringUtils.isEmpty(email);
		if(flag)
		{
			result.append("Email must be not Empty : "+email);
		}
		
		flag = StringUtils.isEmpty(cntctNumber);
		if(flag)
		{
			result.append("Contace Number must Not be Empty : "+cntctNumber);
		}
		return result.toString();
	}

}

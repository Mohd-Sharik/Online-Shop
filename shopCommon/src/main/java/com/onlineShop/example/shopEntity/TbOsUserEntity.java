package com.onlineShop.example.shopEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_OS_USER")
public class TbOsUserEntity implements Serializable {
	
	/**
	 * @author MohdSharik
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_OS_USR_GEN" )
	@SequenceGenerator(name = "SEQ_OS_USR_GEN", sequenceName = "SEQ_OS_USR", allocationSize = 1)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "REF_ID")
	private String refId;
	
	@Column(name = "PSWD")
	private String pswd;
	
	@Column(name = "FULL_NM")
	private String fullNm;
	
	@Column(name = "DSPL_NM")
	private String dsplNm;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CNTCT_INFO")
	private String cntctInfo;
	
	@Column(name = "CNTCT_NUMBER")
	private String cntctNum;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "FLD_LGN_CNT")
	private Long fldLgnCnt;
	
	@Column(name = "LST_LGN_TS")
	private Date  lstLgnTs;
	
	@Column(name = "EXPR_TS")
	private Date exprTs;
	
	@Column(name = "PSWD_CRT_BY")
	private String pswdCrtBy;
	
	@Column(name = "USER_STATE")
	private String userState;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name = "LDAP_AUTH")
	private String ldapAuth;
	
	@Column(name = "SKIP_INACTVN")
	private String skipInactvn = "N";
	
	@Column(name = "CRT_TS")
	private Date crtTs;
	
	@Column(name = "CRT_BY")
	private String crtBy;
	
	@Column(name = "UPD_TS")
	private Date updTs;
	
	@Column(name = "UPD_BY")
	private String updBy;
	
	@Column(name = "DLT_TS")
	private Date dltTs;
	
	@Column(name = "DLT_BY")
	private String dltBy;
	
//	@Column(name = "ENC_KEY_ID")
//	private Long encKeyId;

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

	public String getCntctNum() {
		return cntctNum;
	}

	public void setCntctNum(String cntctNum) {
		this.cntctNum = cntctNum;
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

	public Date getLstLgnTs() {
		return lstLgnTs;
	}

	public void setLstLgnTs(Date lstLgnTs) {
		this.lstLgnTs = lstLgnTs;
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

//	public Long getEncKeyId() {
//		return encKeyId;
//	}
//
//	public void setEncKeyId(Long encKeyId) {
//		this.encKeyId = encKeyId;
//	}
//	
	
	
	

}

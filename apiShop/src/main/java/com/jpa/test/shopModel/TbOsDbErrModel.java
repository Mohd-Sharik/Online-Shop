package com.jpa.test.shopModel;

import java.util.Date;

public class TbOsDbErrModel {
	
	
	private Long id;
	private String refCd;
	private String errCd;
	private String errMsg;
	private String refNm;
	private String crtBy;
	private Date crtTs;
	private String crtTsString;
	
	
	public TbOsDbErrModel(String refCd, String errCd, String errMsg, String refNm, String crtBy) {
		super();
		this.refCd = refCd;
		this.errCd = errCd;
		this.errMsg = errMsg;
		this.refNm = refNm;
		this.crtBy = crtBy;
		
	}


	public TbOsDbErrModel() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRefCd() {
		return refCd;
	}


	public void setRefCd(String refCd) {
		this.refCd = refCd;
	}


	public String getErrCd() {
		return errCd;
	}


	public void setErrCd(String errCd) {
		this.errCd = errCd;
	}


	public String getErrMsg() {
		return errMsg;
	}


	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}


	public String getRefNm() {
		return refNm;
	}


	public void setRefNm(String refNm) {
		this.refNm = refNm;
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


	public String getCrtTsString() {
		return crtTsString;
	}


	public void setCrtTsString(String crtTsString) {
		this.crtTsString = crtTsString;
	}
	
	
	
	
	

}

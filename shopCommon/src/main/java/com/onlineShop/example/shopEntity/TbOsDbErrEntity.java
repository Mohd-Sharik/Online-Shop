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
@Table(name = "TB_OS_DB_ERR")

public class TbOsDbErrEntity implements Serializable {

	/**
	 * @author MohdSharik
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_OS_DB_ERR_GEN")
	@SequenceGenerator(name = "SEQ_OS_DB_ERR_GEN", sequenceName = "SEQ_OS_DB_ERR", allocationSize = 1)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "REF_CD")
	private String refCd;
	
	@Column(name = "ERR_CD")
	private String errCd;
	
	@Column(name = "ERR_MSG")
	private String errMsg;
	
	@Column(name = "REF_NM")
	private String refNm;
	
	@Column(name = "CRT_BY")
	private String crtBy;
	
	@Column(name = "CRT_TS")
	private Date crtTs = new Date();

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
	
	
	
	
	
	

}

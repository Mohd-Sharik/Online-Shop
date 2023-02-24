package userModel;

public class LoginResponce {
	
	private String authToken;
	private String userId;
	private Boolean passExpired;
	private String errorMessage;
	private String lockTs;
	private String lastLogin;
	private Integer loginAtmp = 1;
	private String userState;
	private String passCrtBy;
	private String workingHrsFrom;
	private String workingHrsTo;
	private String daysInactivity;
	private String crtTs;
	private String emailExists;
	private String unlockTime;
	private Boolean isAuthUser;
	private Long aplCount;
	private String sessionId;
	private String dsplNm;
	
	
	
	
	public String getDsplNm() {
		return dsplNm;
	}
	public void setDsplNm(String dsplNm) {
		this.dsplNm = dsplNm;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Boolean getPassExpired() {
		return passExpired;
	}
	public void setPassExpired(Boolean passExpired) {
		this.passExpired = passExpired;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getLockTs() {
		return lockTs;
	}
	public void setLockTs(String lockTs) {
		this.lockTs = lockTs;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Integer getLoginAtmp() {
		return loginAtmp;
	}
	public void setLoginAtmp(Integer loginAtmp) {
		this.loginAtmp = loginAtmp;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getPassCrtBy() {
		return passCrtBy;
	}
	public void setPassCrtBy(String passCrtBy) {
		this.passCrtBy = passCrtBy;
	}
	public String getWorkingHrsFrom() {
		return workingHrsFrom;
	}
	public void setWorkingHrsFrom(String workingHrsFrom) {
		this.workingHrsFrom = workingHrsFrom;
	}
	public String getWorkingHrsTo() {
		return workingHrsTo;
	}
	public void setWorkingHrsTo(String workingHrsTo) {
		this.workingHrsTo = workingHrsTo;
	}
	public String getDaysInactivity() {
		return daysInactivity;
	}
	public void setDaysInactivity(String daysInactivity) {
		this.daysInactivity = daysInactivity;
	}
	public String getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(String crtTs) {
		this.crtTs = crtTs;
	}
	public String getEmailExists() {
		return emailExists;
	}
	public void setEmailExists(String emailExists) {
		this.emailExists = emailExists;
	}
	public String getUnlockTime() {
		return unlockTime;
	}
	public void setUnlockTime(String unlockTime) {
		this.unlockTime = unlockTime;
	}
	public Boolean getIsAuthUser() {
		return isAuthUser;
	}
	public void setIsAuthUser(Boolean isAuthUser) {
		this.isAuthUser = isAuthUser;
	}
	public Long getAplCount() {
		return aplCount;
	}
	public void setAplCount(Long aplCount) {
		this.aplCount = aplCount;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
	
	
	


}

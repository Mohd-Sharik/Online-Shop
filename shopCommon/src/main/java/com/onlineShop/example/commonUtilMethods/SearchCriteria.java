package com.onlineShop.example.commonUtilMethods;

public class SearchCriteria {
	
	
	private String key;
	private String secondKey;
	private String secondSecondryKey;
	private Object value;
	private SearchOperation Operation;
	
	public SearchCriteria()
	{
		
	}
	
	public SearchCriteria(String key, SearchOperation operation)
	{
		this.key = key;
		this.Operation = operation;
	}
	
	public SearchCriteria(String key, Object value, SearchOperation operation)
	{
		this.key = key;
		this.value = value;
		this.Operation = operation;
	}
	
	public SearchCriteria(String key, String secondKey, Object value, SearchOperation operation)
	{
		this.key = key;
		this.secondKey = secondKey;
		this.value = value;
		this.Operation = operation;
	}
	
	
	public SearchCriteria(String key, String secondKey, String secondSecondryKey, Object value, SearchOperation operation )
	{
		this.key = key;
		this.secondKey = secondKey;
		this.secondSecondryKey = secondSecondryKey;
		this.value = value;
		this.Operation = operation;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSecondKey() {
		return secondKey;
	}
	public void setSecondKey(String secondKey) {
		this.secondKey = secondKey;
	}
	public String getSecondSecondryKey() {
		return secondSecondryKey;
	}
	public void setSecondSecondryKey(String secondSecondryKey) {
		this.secondSecondryKey = secondSecondryKey;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public SearchOperation getOperation() {
		return Operation;
	}
	public void setOperation(SearchOperation operation) {
		Operation = operation;
	}
	
	
	
	

}

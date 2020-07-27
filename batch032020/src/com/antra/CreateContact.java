package com.antra;

public class CreateContact {
	
	int contactId;
	String contactName;
	int contactNumber;
	
	public CreateContact(int contactId,String contactName,int contactNumber) {
		
		this.contactId=contactId;
		this.contactName=contactName;
		this.contactNumber=contactNumber;
	}
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	/*public String toString() {
		
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
	/*public int hashCode() {
		
		return 123;
	}*/
	
	public boolean equals(Object obj) {
		CreateContact contact=(CreateContact)obj;
		if(this.contactId==contact.contactId && 
			this.contactName.equals(contact.contactName) &&
			this.contactNumber==contact.contactNumber) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

}

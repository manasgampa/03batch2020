package com.antra;

public final class ImmutableEx {
	
	private String str;
	
	public ImmutableEx(String str) {
		
		this.str=str;
	}
	
	public String getName() {
		
		return str;
	}

	public String concate(String str1) {
		
		return new String(str1+str);
	}
	
	public String toString() {
		
		return str;
	}
}

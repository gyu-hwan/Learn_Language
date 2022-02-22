package com.Gradle.chap02;


public class Greeterr {
	private String _format;
	
	public String greet(String _greet) {
		return String.format(_format, _greet);
	}
	
	public void setFormat(String for_mat) {
		this._format=for_mat;
	}
	
	
}

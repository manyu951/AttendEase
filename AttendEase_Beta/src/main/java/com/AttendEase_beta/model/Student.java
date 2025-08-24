package com.AttendEase_beta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Student {
	@Id
	private Integer regno;
	
	private String name;
	
	private String sec;
	
	private String serial;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

}

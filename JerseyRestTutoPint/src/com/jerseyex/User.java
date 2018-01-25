package com.jerseyex;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient; 

@XmlRootElement(name = "user_info1")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {  
	private static final long serialVersionUID = 1L; 
	private int id; 
	private String name; 
	private String profession;
	private String profession1;
	
	public User(){} 

	public User(int id, String name, String profession, String profession1){  
		this.id = id; 
		this.name = name; 
		this.profession = profession;
		this.profession1 = profession1;
	}  
	public int getId() { 
		return id; 
	}  
	
	@XmlTransient
	public void setId(int id) { 
		this.id = id; 
	} 
	public String getName() { 
		return name; 
	} 
	
	public void setName(String name) { 
		this.name = name; 
	} 
	@XmlTransient
	public String getProfession() { 
		return profession; 
	} 
	public void setProfession(String profession) { 
		System.out.println(profession);
		this.profession = profession; 
	}

//	public String getProfession1() {
//		return profession1;
//	}
//
//	public void setProfession1(String profession1) {
//		this.profession1 = profession1;
//		System.out.println("Prof1" + profession1);
//	}   

} 

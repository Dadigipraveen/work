package com.ct.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="section")
public class Section {
	
	
	Section no;
	Section name;
	Section type;
	Section description;
	public Section getNo() {
		return no;
	}
	public void setNo(Section no) {
		this.no = no;
	}
	public Section getName() {
		return name;
	}
	public void setName(Section name) {
		this.name = name;
	}
	public Section getType() {
		return type;
	}
	public void setType(Section type) {
		this.type = type;
	}
	public Section getDescription() {
		return description;
	}
	public void setDescription(Section description) {
		this.description = description;
	}
	
	public Section() {
		
	}
	@Override
	public String toString() {
		return "Section [no=" + no + ", name=" + name + ", type=" + type + ", description=" + description + "]";
	}
	public Section(Section no, Section name, Section type, Section description) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	

	
	

}

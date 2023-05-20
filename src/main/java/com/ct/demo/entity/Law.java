package com.ct.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lawtable")
public class Law {

	@Id
	@Column(name = "ID")
	Law id;
	@Column(name = "NAME")
	Law name;
	@Column(name = "FIRM")
	Law firm;
	@Column(name = "TYPE")
	Law Type;

	public Law getId() {
		return id;
	}

	public void setId(Law id) {
		this.id = id;
	}

	public Law getName() {
		return name;
	}

	public void setName(Law name) {
		this.name = name;
	}

	public Law getFirm() {
		return firm;
	}

	public void setFirm(Law firm) {
		this.firm = firm;
	}

	public Law getType() {
		return Type;
	}

	public void setType(Law type) {
		Type = type;
	}

	public Law(Law id, Law name, Law firm, Law type) {
		super();
		this.id = id;
		this.name = name;
		this.firm = firm;
		Type = type;
	}

	public Law() {

	}

	@Override
	public String toString() {
		return "Law [id=" + id + ", name=" + name + ", firm=" + firm + ", Type=" + Type + "]";
	}

}

package com.ct.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


	
	@Entity
	@Table(name = "CriminalTable" )
	public class Criminal {

		@Id
		int criminalid;
		String criminalname;
		String criminalgender;
		int criminalage;
		String criminalNationality;
		String typeofoffence;
		int jailterm;
		String bailstatus;
		public int getCriminalid() {
			return criminalid;
		}
		public void setCriminalid(int criminalid) {
			this.criminalid = criminalid;
		}
		public String getCriminalname() {
			return criminalname;
		}
		public void setCriminalname(String criminalname) {
			this.criminalname = criminalname;
		}
		public String getCriminalgender() {
			return criminalgender;
		}
		public void setCriminalgender(String criminalgender) {
			this.criminalgender = criminalgender;
		}
		public int getCriminalage() {
			return criminalage;
		}
		public void setCriminalage(int criminalage) {
			this.criminalage = criminalage;
		}
		public String getCriminalNationality() {
			return criminalNationality;
		}
		public void setCriminalNationality(String criminalNationality) {
			this.criminalNationality = criminalNationality;
		}
		public String getTypeofoffence() {
			return typeofoffence;
		}
		public void setTypeofoffence(String typeofoffence) {
			this.typeofoffence = typeofoffence;
		}
		public int getJailterm() {
			return jailterm;
		}
		public void setJailterm(int jailterm) {
			this.jailterm = jailterm;
		}
		public String getBailstatus() {
			return bailstatus;
		}
		public void setBailstatus(String bailstatus) {
			this.bailstatus = bailstatus;
		}
		
		public Criminal() {
			
		}
		public Criminal(int criminalid, String criminalname, String criminalgender, int criminalage,
				String criminalNationality, String typeofoffence, int jailterm, String bailstatus) {
			super();
			this.criminalid = criminalid;
			this.criminalname = criminalname;
			this.criminalgender = criminalgender;
			this.criminalage = criminalage;
			this.criminalNationality = criminalNationality;
			this.typeofoffence = typeofoffence;
			this.jailterm = jailterm;
			this.bailstatus = bailstatus;
		}
		@Override
		public String toString() {
			return "Criminal [criminalid=" + criminalid + ", criminalname=" + criminalname + ", criminalgender="
					+ criminalgender + ", criminalage=" + criminalage + ", criminalNationality=" + criminalNationality
					+ ", typeofoffence=" + typeofoffence + ", jailterm=" + jailterm + ", bailstatus=" + bailstatus + "]";
		}
		
		
		
		

}

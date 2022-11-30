package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class History {
	

private int hisid;
private int did;
private String illness;
private String doctor;
private String startdate;
private String enddate;
private String dosageamount;
private String dosetime;
private String dosefrequency;
	private String medicine;
	
	
	
	
	
	

	@Override
	public String toString() {
		return "History [hisid=" + hisid + ", did=" + did + ", illness=" + illness + ", doctor=" + doctor
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", dosageamount=" + dosageamount + ", dosetime="
				+ dosetime + ", dosefrequency=" + dosefrequency + ", medicine=" + medicine + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int getHisid() {
		return hisid;
	}
	public void setHisid(int hisid) {
		this.hisid = hisid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getDosageamount() {
		return dosageamount;
	}
	public void setDosageamount(String dosageamount) {
		this.dosageamount = dosageamount;
	}
	public String getDosetime() {
		return dosetime;
	}
	public void setDosetime(String dosetime) {
		this.dosetime = dosetime;
	}
	public String getDosefrequency() {
		return dosefrequency;
	}
	public void setDosefrequency(String dosefrequency) {
		this.dosefrequency = dosefrequency;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	
	
	
	
}

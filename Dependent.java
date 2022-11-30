package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="dependent")
public class Dependent {
	@Override
	public String toString() {
		return "Dependent [id=" + id + ", pemail=" + pemail + ", relationship=" + relationship + ", name=" + name
				+ ", email=" + email + ", contact=" + contact + ", bloodgroup=" + bloodgroup + ", dob=" + dob
				+ ", weight=" + weight + ", height=" + height + "]";
	}
	private int id;
	private String pemail;
private String relationship;
private String name;
private String email;
private String contact;
private String bloodgroup;
private String dob;
private String weight;
private String height;




@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getPemail() {
	return pemail;
}
public void setPemail(String pemail) {
	this.pemail = pemail;
}
public String getRelationship() {
	return relationship;
}
public void setRelationship(String relationship) {
	this.relationship = relationship;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}



}

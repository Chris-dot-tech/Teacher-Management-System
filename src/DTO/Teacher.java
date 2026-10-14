package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="teacher")
public class Teacher {

	@Id
	@Column
	int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	int contact;
	
	@Column
	String gender;
	
	@Column
	String subject;
	
	@Column
	int salary;
	
	public Teacher() {
		
	}
	
	public Teacher(int id, String name, String email, int contact, String gender,String subject, int salary) {
		
		this.id = id;
		
		this.name = name;
		
		this.email = email;
		
		this.contact = contact;
		
		this.gender = gender;
		
		this.subject = subject;
		
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Teacher[id = " +id+ ", name = " +name+ ", email = " +email+ ", contact = " + contact + ",gender = " +gender+ ",subject = " +subject+ ",salary = " +salary+ "]";
	}
}

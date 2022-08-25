package com.vcare.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="contactemployee")
public class ContractEmployees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateOfBirth")
   // private LocalDate dateOfBirth;
	private LocalDate DOB;
	private String age;
	private String Gender;
	private int Fee;
	private String experience;
	private String captchaContract;
	private String userCaptcha; 
	private String qualification;
	private Long mobileNo;
	private String about;
	private String email;
	private String password;
	private String services;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "offerId")
    public popularOffers popularOffers;
	
	
	@OneToMany(mappedBy = "contractEmployees")
	private Set<Appointment> appointment = new HashSet<Appointment>();

	
	
	
	public popularOffers getPopularOffers() {
		return popularOffers;
	}
	public void setPopularOffers(popularOffers popularOffers) {
		this.popularOffers = popularOffers;
	}
	
	public Set<Appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getCaptchaContract() {
		return captchaContract;
	}
	public void setCaptchaContract(String captchaContract) {
		this.captchaContract = captchaContract;
	}
	public String getUserCaptcha() {
		return userCaptcha;
	}
	public void setUserCaptcha(String userCaptcha) {
		this.userCaptcha = userCaptcha;
	}
	public String getAge() {
		return age;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public void setAge(String age) {
		this.age = age;
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
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}

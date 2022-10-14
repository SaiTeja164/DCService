/**
 * 
 */
package in.saiteja.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author K.SAITEJA
 *
 */
@Entity
@Table(name="CITIZEN_DATA_COLLECTION_ENTITY")
@Data
public class CitizenDataCollectionEntity 
{
	@Id
	@GeneratedValue
	@Column(name="CASE_NUMBER")
	private  Integer caseNumber;
	
	@Column(name="APP_ID")
	private Integer appId;
	
	@Column(name="PLAN_NAME")
	private List planName;
	
	@Column(name="MONTHLY_SALARY_INCOME")
	private double monthlySalaryIncome;
	
	@Column(name="RENT_INCOME")
	private double rentIncome;
	
	@Column(name="PROPERTY_INCOME")
	private double propertyIncome;
	
	@Column(name="HIGHES_TDEGREE")
	private  String highestDegree;
	
	@Column(name="GRADUATION_YEAR")
	private LocalDate graduationYear;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	
	@Column(name="KID_NAME")
	private String kidName;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="SSN")
	private Integer SSN;

	public CitizenDataCollectionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitizenDataCollectionEntity(Integer caseNumber, Integer appId, List planName, double monthlySalaryIncome,
			double rentIncome, double propertyIncome, String highestDegree, LocalDate graduationYear,
			String universityName, String kidName, Integer age, Integer sSN) {
		super();
		this.caseNumber = caseNumber;
		this.appId = appId;
		this.planName = planName;
		this.monthlySalaryIncome = monthlySalaryIncome;
		this.rentIncome = rentIncome;
		this.propertyIncome = propertyIncome;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.kidName = kidName;
		this.age = age;
		SSN = sSN;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public List getPlanName() {
		return planName;
	}

	public void setPlanName(List planName) {
		this.planName = planName;
	}

	public double getMonthlySalaryIncome() {
		return monthlySalaryIncome;
	}

	public void setMonthlySalaryIncome(double monthlySalaryIncome) {
		this.monthlySalaryIncome = monthlySalaryIncome;
	}

	public double getRentIncome() {
		return rentIncome;
	}

	public void setRentIncome(double rentIncome) {
		this.rentIncome = rentIncome;
	}

	public double getPropertyIncome() {
		return propertyIncome;
	}

	public void setPropertyIncome(double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSSN() {
		return SSN;
	}

	public void setSSN(Integer sSN) {
		SSN = sSN;
	}
	
}

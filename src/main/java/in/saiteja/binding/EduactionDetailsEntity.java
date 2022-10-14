/**
 * 
 */
package in.saiteja.binding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author K.SAITEJA
 *
 */
public class EduactionDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name="CASE_NUMBER")
	private  Integer caseNumber;
	
	@Column(name="HIGHES_TDEGREE")
	private  String highestDegree;
	
	@Column(name="GRADUATION_YEAR")
	private LocalDate graduationYear;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;

	public EduactionDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EduactionDetailsEntity(Integer caseNumber, String highestDegree, LocalDate graduationYear,
			String universityName) {
		super();
		this.caseNumber = caseNumber;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
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
	
	
}

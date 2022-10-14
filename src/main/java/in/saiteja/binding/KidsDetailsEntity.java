/**
 * 
 */
package in.saiteja.binding;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author K.SAITEJA
 *
 */
public class KidsDetailsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="CASE_NUMBER")
	private  Integer caseNumber;
	
	@Column(name="KID_NAME")
	private String kidName;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="SSN")
	private Integer SSN;

	public KidsDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KidsDetailsEntity(Integer caseNumber, String kidName, Integer age, Integer sSN) {
		super();
		this.caseNumber = caseNumber;
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

	@Override
	public String toString() {
		return "KidsDetailsEntity [caseNumber=" + caseNumber + ", kidName=" + kidName + ", age=" + age + ", SSN=" + SSN
				+ "]";
	}

	
}

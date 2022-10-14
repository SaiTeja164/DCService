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
public class IncomeDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name="CASE_NUMBER")
	private  Integer caseNumber;
	
	@Column(name="MONTHLY_SALARY_INCOME")
	private double monthlySalaryIncome;
	
	@Column(name="RENT_INCOME")
	private double rentIncome;
	
	@Column(name="PROPERTY_INCOME")
	private double propertyIncome;

	public IncomeDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncomeDetailsEntity(Integer caseNumber, double monthlySalaryIncome, double rentIncome,
			double propertyIncome) {
		super();
		this.caseNumber = caseNumber;
		this.monthlySalaryIncome = monthlySalaryIncome;
		this.rentIncome = rentIncome;
		this.propertyIncome = propertyIncome;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
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
	
	
}

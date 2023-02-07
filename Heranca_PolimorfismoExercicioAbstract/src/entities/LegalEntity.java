package entities;

public class LegalEntity extends Person {

	public Integer numberOfEmployee;
	
	public LegalEntity () {
		super();
		
	}
	
	
	public LegalEntity(String name, Double annualIncome, Integer numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}
	


	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}


	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}


	@Override
	public double taxes() {
		double sum = 0.0;
		if(numberOfEmployee > 10) {
			sum = annualIncome * 0.14;
		} else {
			sum = annualIncome * 0.16;
		}
		return sum;
	}

}

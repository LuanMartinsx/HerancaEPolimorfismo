package entities;

public class PhysicalPerson extends Person {

	public Double healthExpenditure;
	
	
	public PhysicalPerson() {
		super();
	}
	
	
	public PhysicalPerson(String name, Double annualIncome, Double healthExpenditure) {
		super(name, annualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}


	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}


	@Override
	public double taxes() {
		double sum = 0.0;
		if(annualIncome < 20000.0) {
			sum = (annualIncome * 0.15) - (healthExpenditure * 0.50);
		} else {
			sum = (annualIncome * 0.25) - (healthExpenditure * 0.50);
		}
		
		return sum;
	}

}

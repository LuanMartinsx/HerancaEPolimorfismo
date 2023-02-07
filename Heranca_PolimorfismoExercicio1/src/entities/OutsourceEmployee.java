package entities;

public class OutsourceEmployee extends Employee {
	
	private Double adicionalCharge;
	
	OutsourceEmployee() {
	super();	
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHours, Double adicionalCharge) {
		super(name, hours, valuePerHours);
		this.adicionalCharge = adicionalCharge;
	}

	public Double getAdicionalCharge() {
		return adicionalCharge;
	}

	public void setAdicionalCharge(Double adicionalCharge) {
		this.adicionalCharge = adicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + adicionalCharge * 1.1;
		
	}
	
}

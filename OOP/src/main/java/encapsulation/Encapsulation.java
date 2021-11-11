package encapsulation;

public class Encapsulation {
	
	private String stringVar;
	private Integer intVar;
	private double doubleVar;
	private float floatVar;
	private long longVar;
	
	
	public Encapsulation() {
		super();
	}
	
	public Encapsulation(String stringVar, Integer intVar, double doubleVar, float floatVar, long longVar) {
		super();
		this.stringVar = stringVar;
		this.intVar = intVar;
		this.doubleVar = doubleVar;
		this.floatVar = floatVar;
		this.longVar = longVar;
	}
	
	
	
	@Override
	public String toString() {
		return "Encapsulation: stringVar =" + stringVar + ", intVar =" + intVar + ", doubleVar =" + doubleVar
				+ ", floatVar =" + floatVar + ", longVar =" + longVar;
	}

	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	public Integer getIntVar() {
		return intVar;
	}
	public void setIntVar(Integer intVar) {
		this.intVar = intVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	public float getFloatVar() {
		return floatVar;
	}
	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}
	public long getLongVar() {
		return longVar;
	}
	public void setLongVar(long longVar) {
		this.longVar = longVar;
	}
	
	
	

}

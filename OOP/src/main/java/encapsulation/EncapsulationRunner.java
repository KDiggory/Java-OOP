package encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		Encapsulation encap = new Encapsulation();
		
		encap.setStringVar("I am learning about encapsulation");
		System.out.println(encap.getStringVar());
		
		encap.setDoubleVar(100.0);
		System.out.println(encap.getDoubleVar());
		
		encap.setFloatVar(567.567f);
		System.out.println(encap.getFloatVar());
		
		encap.setIntVar(1);
		System.out.println(encap.getIntVar());
		
		encap.setLongVar(65432187L);
		System.out.println(encap.getLongVar());
		
		encap.toString();
	}

}

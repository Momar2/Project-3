package Math;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int add = cal.addition (10, 15);
		int result = add + 5;
		System.out.println(result);
		cal.addNdisplay(100, 90);
	
	}

}

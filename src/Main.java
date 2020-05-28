public class Main {
	public static void main(String[] args) {
		MathCalculatorProxy proxy = new MathCalculatorProxy();
		double result = proxy.subtract(100, 20);
		System.out.println("100 - 20 = " + result);

		result = proxy.subtract(Double.MIN_VALUE, 2);
		System.out.println("2 - Double.MIN_VALUE = " + result);
	}
}

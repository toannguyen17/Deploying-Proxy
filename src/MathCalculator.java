public class MathCalculator implements Calculator {

	@Override
	public double plus(double first, double second) {
		return first + second;
	}

	@Override
	public double subtract(double first, double second) {
		return first - second;
	}

	@Override
	public double mul(double first, double second) {
		return first * second;
	}

	@Override
	public double div(double first, double second) {
		return first / second;
	}
}

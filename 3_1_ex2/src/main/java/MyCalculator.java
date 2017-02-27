
public class MyCalculator {

	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {

	}

	public MyCalculator add() {
		calculator.add(firstNum, secondNum);
		return this;
	}
	
	public MyCalculator sub() {
		calculator.sub(firstNum, secondNum);
		return this;
	}
	
	public MyCalculator mul() {
		calculator.mul(firstNum, secondNum);
		return this;
	}
	
	public MyCalculator div() {
		calculator.div(firstNum, secondNum);
		return this;
	}
	
	public MyCalculator setCalculator(Calculator calculator) {
		this.calculator = calculator;
		return this;
	}
	
	public MyCalculator setFirstNum(int firstNum) {
		this.firstNum = firstNum;
		return this;
	}
	
	public MyCalculator setSecondNum(int secondNum) {
		this.secondNum = secondNum;
		return this;
	}
}

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		MyCalculator myCalculator = new MyCalculator()
//				.setCalculator(new Calculator())
//				.setFirstNum(10)
//				.setSecondNum(2)
//				.add().sub().mul().div();

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:application-context.xml");
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add().sub().mul().div();
		ctx.close();
	}

}

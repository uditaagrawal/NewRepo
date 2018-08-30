import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class FirstClass {
	
	@Test
	public void TestingHelloworld() {
		
		assertEquals("Here is test for Hello World String:", "Hello World", HelloWorld());
	}
	public String HelloWorld()	{
		// TODO Auto-generated method stub
		String helloworld = "Hello" + " World";
		return helloworld;

	}
	
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(FirstClass.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }

}

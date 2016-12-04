import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class LearnAssertion {
	@Rule
	public ErrorCollector ec =new ErrorCollector();
	
	@Test
	public void testtitle()
	{
		String actual_title="Google.com";
		String expected_title="Google.com1";
		/*
		if (actual_title==expected_title)
		{
			System.out.println("validating Title:- Pass");
		}
		else
		{
			System.out.println("validating Title:- Fail");
		}
		*/
		System.out.println("comparison started");
		try{
			Assert.assertEquals(actual_title, expected_title);
		}catch(Throwable t){
			System.out.println("error captured");
			ec.addError(t);
		}
		System.out.println("Camparison done");
			
		
	}

}

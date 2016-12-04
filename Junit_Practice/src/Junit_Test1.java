import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class Junit_Test1 {
	
	public static boolean dbconnection()
	{
		return true;
	}

	
	@Test	
	public void login()
	{
		System.out.println("Login successfully");
	}
	@Ignore
	@Test
	public void createlead()
	{
		System.out.println("Lead Created successfully");
	}
	
	@Before
	public void openbrowser()
	{
		System.out.println("open application");
	}
	
	@After
	public void closebrowser()
	{
		System.out.println("Closed browser");
	}
	
	@BeforeClass
	public static void startServer()
	{
		System.out.println("Starting selenium server");
		Assume.assumeTrue(dbconnection());
	}
	
	@AfterClass
	public static void stopServer()
	{
		System.out.println("Stoping selenium server");
	}
	
	
	

}

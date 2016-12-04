

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//first step
@RunWith(Parameterized.class)
public class Junit_Parameterization {
	//second step declartion
	String firstname;
	String lname;
	String email;
	int age;
	//third step
	public Junit_Parameterization(String firstname,	String lname,	String email,	int age)
	{
		this.firstname=firstname;
		this.lname=lname;
		this.email=email;
		this.age=age;
	}
	
	//forth step
	
	@Parameters
	public static Collection<Object[]> getdata()
	{
		Object[][] data =new Object[2][4];
		//firstow
		data[0][0]="F1";
		data[0][1]="L1";
		data[0][2]="E1";
		data[0][3]=28;
		
		data[1][0]="F2";
		data[1][1]="L2";
		data[1][2]="E2";
		data[1][3]=26;
		
		return Arrays.asList(data);
	}
	
	@Test
	public void doLogin()
	{
		System.out.println(firstname+"-"+lname+"-"+email+"-"+age);
	}

}


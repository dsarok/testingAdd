package base.code;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class testing {
	
	@Test(priority=1)
	public void noinput() throws Exception {
		final int expected=0;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("");
//		System.out.println(Stringcalculator.count);
		assertEquals(actual,expected);
		}
	
	@Test(priority=2)
	public void simpleinput() throws Exception {
		final int expected=143+99;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("143;99");
//		System.out.println(Stringcalculator.count);
		assertEquals(actual,expected);
	}
	@Test(priority=3)
	public void input1() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[***]\\n1***2***3*-9*%-2-4&-655");
//		System.out.println(Stringcalculator.count);
		assertEquals(expected,actual);
	}
	@Test(priority=4)
	public void input2() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[*][%]\\n1*2%3-");
//		System.out.println(Stringcalculator.count);
		assertEquals(expected,actual);
	}
	@Test(priority=5)
	public void input3() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[**][%%]\n1**2%%3" );
//		System.out.println(Stringcalculator.count);
		assertEquals(expected,actual);
	}
	@Test(priority=6)
	public void number_of_times_called_add() {
		assertEquals(5,Stringcalculator.count);
	}
	
	
}

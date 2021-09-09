package base.code;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class testing {
	@Test
	public void noinput() throws Exception {
		final int expected=0;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("");
		assertEquals(actual,expected);
		}
	@Test
	public void negativenumber() throws Exception {
		final int expected=143+99;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("143;99");
		assertEquals(actual,expected);
	}
	@Test
	public void input1() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[***]\\n1***2***3*-9*%-2-4&-655");
		assertEquals(expected,actual);
	}
	@Test
	public void input2() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[*][%]\\n1*2%3-");
		assertEquals(expected,actual);
	}
	@Test
	public void input3() throws Exception {
		final int expected=6;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("//[**][%%]\n1**2%%3" );
		assertEquals(expected,actual);
	}
	@Test
	public void number_of_times_called_add() {
		System.out.println(Stringcalculator.count);
	}
}

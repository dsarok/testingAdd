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
		final int actual=addi.Add("143;99,-2,-4");
		assertEquals(actual,expected);
	}
	@Test
	public void simpleinput() throws Exception {
		final int expected=143+99+12;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("143;99\n&&(***12");
		assertEquals(actual,expected);
	}
}

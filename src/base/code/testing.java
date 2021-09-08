package base.code;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class testing {
	@Test
	public void noinput() {
		final int expected=0;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("");
		assertEquals(actual,expected);
		
	}
	@Test
	public void singleinput() {
		final int expected=1;
		Stringcalculator addi=new Stringcalculator();
		final int actual=addi.Add("1");
		assertEquals(actual,expected);
	}
}

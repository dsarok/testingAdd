package base.code;

public class Stringcalculator {

	public int Add(String numbers) {
		if(numbers.length()==0) {
				return 0;
		}
		else {
			String []parts=numbers.split(",");
			int j=0;
			for(int i=0;i<parts.length;i++) {
				j+=Integer.parseInt(parts[i]);
			}
			return j;
		}
	}
}

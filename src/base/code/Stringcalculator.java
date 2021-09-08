package base.code;

public class Stringcalculator {

	public int Add(String numbers) {
		if(numbers.length()==0) {
				return 0;
		}
		else {
			String []parts=numbers.split(",");
			int k=0;
			for(int i=0;i<parts.length;i++) {
				String[]parts2=parts[i].split("\n");
				for(int j=0;j<parts2.length;j++) {
					k+=Integer.parseInt(parts2[j]);
				}
			}
			return k;
		}
	}
}

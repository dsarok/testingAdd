package base.code;

public class Stringcalculator {

	public int Add(String numbers) throws Exception {
		if(numbers.length()==0) {
				return 0;
		}
		else {
			
			String negative="";
			int k=0;
			String[] kh=(numbers.split("[\\W]+"));
			for(int i=0;i<kh.length;i++) {
				int h=Integer.parseInt(kh[i]);
				if(h<1000 && h>0) {
					k+=h;
				}
				else if(h<0) {
					negative+=h+" ";
				}
			}
			
			if (negative.length()>0) {
				throw new Exception("no negative numbers allowed"+negative);
			}
			return k;
		}
	}
}

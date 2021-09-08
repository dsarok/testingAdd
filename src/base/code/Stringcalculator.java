package base.code;

public class Stringcalculator {

	public int Add(String numbers) throws Exception {
		if(numbers.length()==0) {
				return 0;
		}
		else {
			String []parts=numbers.split(",");
			String negative="";
			int k=0;
			for(int i=0;i<parts.length;i++) {
				String[]parts2=parts[i].split("\n");
				for(int j=0;j<parts2.length;j++) {
					String[]parts3=parts2[j].split("/");
					for(int l=0;l<parts3.length;l++) {
						String[]parts4=parts3[l].split(";");
						for(int m=0;m<parts4.length;m++) {
							int h=Integer.parseInt(parts4[m]);
							
							if(h<0) {
								
								negative=negative+h+ " ";
							}
							else if(h<1000) {
								k+=h;
							}
						}
					}
				}
			}
			if (negative.length()>0) {
				throw new Exception("no negative numbers allowed"+negative);
			}
			return k;
		}
	}
}

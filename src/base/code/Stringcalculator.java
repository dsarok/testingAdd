package base.code;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Stringcalculator extends Exception{

	public static int count=0;
	 public int GetCalledCount() {
		 return Stringcalculator.count;
	 }
	 
	 public int Add(String r) throws Exception  {
		 count++;
		 String ss="";
		 String[] kh=(r.split("\\D{1}"));
		 String pattern="\\-\\d+";
		 Pattern re=Pattern.compile(pattern);
		 Matcher m=re.matcher(r);
		 while (m.find()) {
		       ss+=m.group()+ " ";
		    } 
		 if(kh.length==0) {
			 System.out.print("no integer");
			 return 0;
			 
		 }
		 int ir=0;
		 for(int i=0;i<kh.length;i++) {
			if(kh[i].length()>0)
			{int y=Integer.parseInt(kh[i]);
			if(y<0) {
				ss+=y+" ";
			}
			else if(y<1000) {
				ir+=y;
			}
			}
			
		 }
		 if(ss.length()>0) {
			 throw new Exception("no negative numbers allowed "+ss);
		 }
		 return ir;
	 }

}

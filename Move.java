package Testing;

public class Move {
	public static String movespecial(String s1) {
		int len=s1.length();
		String spchar="[a-zA-Z0-9\\s++]";
		String r1="",r2="";
		for(int i=0;i<len;i++) {
		
			char c=s1.charAt(i);
			if(String.valueOf(c).matches(spchar)) {
				r1=r1+c;
			}
			else {
				r2=r2+c;
				
			}
		}return r1+r2;
	
		}

	public static void main(String args[]) {
		String s1="He@#$llo!*&";
		String s2="%$well*@come";
		System.out.println(movespecial(s1));
		System.out.println(movespecial(s2));
		
	}
	

}

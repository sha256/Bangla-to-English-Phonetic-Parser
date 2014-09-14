package net.hasnath.b2ephonetic;



public class ReverseParser {
	
	BanglaUnicode unicode; 
	
	public ReverseParser(){
		unicode = new BanglaUnicode();
	}
	
	public String parse(String bangla){
		
		
		StringBuilder out = new StringBuilder("");
		char carry = 0;
		
		for (char now : bangla.toCharArray()){
			
			String b = unicode.get(now);
			
			if (b != null) {
				
				if ( now == '\u09CD'){
					carry = 0;
					continue;
				} else if (!isBanglaVowel(carry) && !isBanglaVowel(now) && carry != 0){
					out.append("o");
					out.append(b);
				} else {
					out.append(b);
				}				
			
			} else {
				out.append(Character.toString(now));
				carry = 0;
				continue;
			}			
			
			carry = now;
			
		}
		
		
		return out.toString();
		
		
	}
	
	boolean isBanglaVowel(char fo){
		return Character.toString(fo).matches("[\u0985-\u0994\u09BE-\u09CC]");
	}


}

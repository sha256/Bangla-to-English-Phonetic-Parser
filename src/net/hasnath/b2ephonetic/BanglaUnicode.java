package net.hasnath.b2ephonetic;


import java.util.HashMap;
import java.util.Map;

public class BanglaUnicode {
	
	private Map<String, String> map = new HashMap<String, String>();
	
	
	public BanglaUnicode(){
		// Same : a, k, g, c, f, e, b, v, l, m, p
		map.put("\u0985", "o");
		map.put("\u0993", "O");
		map.put("\u0986", "a");
		//map.put("\u0986", "A");
		//map.put("\u09B6", "S");
		map.put("\u09B6", "sh");
		map.put("\u09B8", "s");
		map.put("\u09B7", "Sh");
		map.put("\u09B9", "h");
		//map.put("\u09B9", "H");
		map.put("\u09B0", "r");
		map.put("\u09DC", "R");
		map.put("\u09DD", "Rh");
		map.put("\u0995", "k");
		//map.put("\u0995", "K");
		//map.put("\u0995", "q");
		map.put("\u0981", "qq");
		map.put("\u0996", "kh");
		map.put("\u0997", "g");
		//map.put("\u0997", "G");
		map.put("\u0998", "gh");
		map.put("\u0999", "Ng");
		map.put("\u099A", "c");
		map.put("\u099A", "C");
		map.put("\u099B", "ch");
		map.put("\u099C", "j");
		map.put("\u099D", "jh");
		//map.put("\u099C", "J");
		map.put("\u099E", "NG");
		map.put("\u099F", "T");
		map.put("\u09A0", "Th");
		map.put("\u09CE", "TH");
		map.put("\u09AB", "f");
		//map.put("\u09AB", "F");
		//map.put("\u09AB", "ph");
		map.put("\u0987", "i");
		map.put("\u0988", "I");
		map.put("\u098F", "e");
		map.put("\u098F", "E");
		map.put("\u0989", "u");
		map.put("\u098A", "U");
		map.put("\u09AC", "b");
		//map.put("\u09AC", "B");
		//map.put("\u09AC", "w");
		//map.put("\u09AD", "bh");
		//map.put("\u09AD", "V");
		map.put("\u09AD", "v");
		map.put("\u09A4", "t");
		map.put("\u09A5", "th");
		map.put("\u09A6", "d");
		map.put("\u09A7", "dh");
		map.put("\u09A1", "D");
		map.put("\u09A2", "Dh");
		map.put("\u09A8", "n");
		map.put("\u09A3", "N");
		map.put("\u09AF", "z");
		//map.put("\u09AF", "Z");
		map.put("\u09DF", "y");
		map.put("\u09B2", "l");
		//map.put("\u09B2", "L");
		map.put("\u09AE", "m");
		//map.put("\u09AE", "M");
		map.put("\u09AA", "P");
		map.put("\u09AA", "p");
		map.put("\u0982", "ng");
		map.put("\u0981", "cb");
		//map.put("\u0995\u09CD\u09B8", "x");
		map.put("\u0994", "OU");
		map.put("\u0990", "OI");
		map.put("\u098B", "rri");
		map.put("\u09C3", "rri");
		map.put("\u0983", ":");
		
		//map.put("\u09CD", "hs");
		map.put("\u099E\u09CD\u099C", "nj");
		map.put("\u099E\u09CD\u099A", "nc");
        map.put("\u099C\u09CD\u099E", "gg");
		
		
		//map.put("", "o");
		map.put("\u09BE", "a");
		//map.put("\u09BE", "A");
		map.put("\u09C7", "e");
		//map.put("\u09C7", "E");
		map.put("\u09CB", "O");
		map.put("\u09C8", "OI");
		map.put("\u09CC", "OU");
		map.put("\u09BF", "i");
		map.put("\u09C0", "I");
		map.put("\u09C1", "u");
		map.put("\u09C2", "U");
		map.put("\u09CD", "");
		//map.put("\u09C1", "oo");
		
		map.put("\09E6", "0");
		map.put("\09E7", "1");
		map.put("\09E8", "2");
		map.put("\09E9", "3");
		map.put("\09EA", "4");
		map.put("\09EB", "5");
		map.put("\09EC", "6");
		map.put("\09ED", "7");
		map.put("\09EE", "8");
		map.put("\09EF", "9");
	
		
	}
	
	public String get(char x){
		return map.get(Character.toString(x));
	}
	
}

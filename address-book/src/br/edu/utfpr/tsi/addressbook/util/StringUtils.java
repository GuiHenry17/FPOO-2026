package br.edu.utfpr.tsi.addressbook.util;

public class StringUtils {
	
	public static String truncate(String text, int targetWidth) {
		
	    if (text.length() > targetWidth) {
	        return (targetWidth > 3) 
	                ? text.substring(0, targetWidth - 3).concat("...")
	                : text.substring(0, targetWidth);
	    }
	    
	    return text;
	}
	
	public static String center(String text, int targetWidth) {
	    
		var treatedText	= truncate(text, targetWidth);	
	    int totalSpaces = targetWidth - text.length();
	    int leftSpaces  = totalSpaces / 2;
	    int rightSpaces = totalSpaces - leftSpaces;

	  	return (" ".repeat(leftSpaces) + treatedText + " ".repeat(rightSpaces));
	}
	
	

}

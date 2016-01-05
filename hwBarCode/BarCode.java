public class BarCode {//implements Comparable{

    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if (zip.length() != 5){
	    throw new NumberFormatException("wrong length");
	}
	for (int i = 0; i < zip.length(); i++){
	    if (zip.charAt(i) > 71){
		throw new NumberFormatException("NOPE");
	    }else{
		_checkDigit += zip.charAt(i);
	    }
	}
	_zip = zip;
	_checkDigit %= 10;
    }
    
    public static void main (String[]args){
	BarCode a = new BarCode("08451");
	System.out.println(a);
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	BarCode copy = x; //????
    }

    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int check = 0;
	for (int i = 0; i < 4; i++){
	    check += Integer.parseInt(_zip.substring(i,i+1));
	}
	check += Integer.parseInt(_zip.substring(4));
	return check%10;
    }

    private static final String digits[] = {"||:::", ":::||", "::|:|",
					    "::||:", ":|::|", ":|:|:", ":||::",
					    "|:::|", "|::|:", "|:|::", "||:::"};  
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	_zip += this.checkSum();
	String ret = "";
	ret += _zip + "\t|";
	for (int i = 0; i < 5; i++){
	    ret += digits[Integer.parseInt(_zip.substring(i,i+1))];
	}
	ret += digits[Integer.parseInt(_zip.substring(5))];
	return ret+"|";
    }


     // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.   
    public boolean equals(Object other){
	return this == other || (other instance of Barcode &&
				 _zip.equals((Barcode)other._zip));
    }


    // postcondition: compares the zip + checkdigit 
    public int compareTo(Comparable other){
	if (this.checkSum()==_checkDigit){
	    return 0;
	}else if(this.checkSum()>_checkDigit){
	    return 1;
	}else{
	    return -1;
	}
    }

}

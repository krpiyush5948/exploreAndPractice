package practice.strings;

public class StringBuffers {


	public static void main(String[] args) {
		
		
		// String buffer constructor
//		StringBuffer strbfr = new StringBuffer();
//		StringBuffer strbfr = new StringBuffer(int 1000);
//		StringBuffer strbfr = new StringBuffer("piyush");
		
		StringBuffer strbfr = new StringBuffer();
		System.out.println(strbfr.capacity());
		strbfr.append("abcdefghijklmnop"); 
		System.out.println(strbfr.capacity());		
		strbfr.append("abcdefghijklmnopq");
		System.out.println(strbfr.capacity());
		
		//Method in stringbuffer
		//1.public int length()
		//2.public int capacity()
		//3. public char charAt(int index);
		StringBuffer strb = new StringBuffer("Piyush");
		System.out.println(strb.charAt(3));
		//4. public void setCharAt(int index,char newchar);
	        strb.setCharAt(3, 'o'); 
	        System.out.println(strb);
	     //5.public StringBuffer append(String s)
	     //6.public StringBuffer insert(int index,String s)
	     //7.public StringBuffer delete(nt start,int end);
	     //8. public StringBuffer deleteCharAt(int index);
	     //9. public StringBuffer reverse()
	        System.out.println(strb.append("Kumar"));
	        System.out.println(strb.delete(2, 4));
	        System.out.println(strb.deleteCharAt(6));
	        System.out.println(strb.reverse());
		//10.public void setLength(int i)
	        //11.public ensureCapacity(int capacity)
	    	StringBuffer strc = new StringBuffer("SiddharthArya");
	          strc.setLength(9);
	          System.out.println(strc);
	    	strc.ensureCapacity(1000);
	    	System.out.println(strc.capacity());
	    	StringBuffer strd = new StringBuffer(1000);
	    	strd.append("bangalore");
	    //	System.out.println(strd.capacity());
	    	strd.trimToSize();
	    	System.out.println(strd.capacity());
	    	
	}
}

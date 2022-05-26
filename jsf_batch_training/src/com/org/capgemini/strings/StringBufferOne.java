package com.org.capgemini.strings;

public class StringBufferOne {

	public static void main(String[] args) {
		//StringBuffer //apppend is present only in stringBuffer and stringBuilder.
		StringBuffer stringbuffer=new StringBuffer("This is StringBuffer :");
		stringbuffer.append("Example");
		System.out.println(stringbuffer);
		//Capcity of stringbuffre and stringbuilder is 16 bytes.+string length
		System.out.println(stringbuffer.capacity());
		//We cxan change the capacity of stringBuffer from default 16Bytes
		StringBuffer sb=new StringBuffer(1000);
		System.out.println(sb.capacity());
		
		//StringBuilder
		StringBuilder stringbuilder=new StringBuilder("Hello");
		stringbuilder.append("java");
		System.out.println(stringbuilder);
		System.out.println(stringbuffer.capacity());
		//we can change the capacity of strinfBulder also fom default 16Bytes
		StringBuilder sbb=new StringBuilder(100000);
		System.out.println(sbb.capacity());
		
		//String Class
		String string=new String("This is :");
		System.out.println(string);
	
		
	}
}

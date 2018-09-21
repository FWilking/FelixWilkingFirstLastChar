package com.company;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(firstlastchar("hello"));
    }
    public static String firstlastchar(String str) {
	    String out = str.substring(1,str.length()-1);
	    return out;

    }
}

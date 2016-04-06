package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String ver = System.getProperty("java.version");
        System.out.println(ver);
	int pos = ver.indexOf('.');
	pos = ver.indexOf('.', pos+1);
	double version = Double.parseDouble(ver.substring(0, pos));
	return version;
    }

    public static void main(String[] args) {
	    getVersion();
    }
}

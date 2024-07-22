package org.example;

public class Gyal extends Person {
    static double   ageFactor = 1.3;
    public Gyal(String aName) {
        name = "Ms." + aName;
    }

    public String talk() {
        return("Hello! " + jump());
    }
    public String jump() {
        return("I am jumping.");
    }
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }
}




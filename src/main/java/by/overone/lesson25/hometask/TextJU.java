package by.overone.lesson25.hometask;

import java.util.ArrayList;
import java.util.Arrays;

public class TextJU {
    String val;

    public TextJU(String val) {
        this.val = val;
    }

    public TextJU() {
    }

    int numOfWords(String str){
        String[] s1=str.trim().split(" ");
        return s1.length;
    }

    String trimAndChangeA (String str){
        StringBuffer sbuf=new StringBuffer();
        sbuf.append(str.trim());

        while (sbuf.indexOf("a") > 0) {
            int inda = sbuf.indexOf("a");
            sbuf.replace(inda, inda + 1, "%");
        }

        while (sbuf.indexOf("A") > 0) {
            int indA = sbuf.indexOf("A");
            sbuf.replace(indA, indA + 1, "%");
        }
        return sbuf.toString();
    }

    boolean strvoid (String str) {
        return str.length()==0;
    }

     String strEq (ArrayList<String> obj){
        String rezult= "Bad";

        if (this.val.equals(obj)) {rezult =  "Cool";}

        return rezult;
    }




}

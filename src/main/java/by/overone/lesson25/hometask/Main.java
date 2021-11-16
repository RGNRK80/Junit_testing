package by.overone.lesson25.hometask;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextJU stest=new TextJU();
        stest.val="testing";
        String ss;
        System.out.println(stest.strvoid(""));
        System.out.println(stest.strvoid(" "));
        System.out.println(stest.numOfWords("masha myla ramu"));
       // System.out.println(stest.trimAndChangeA(" mAsha myla ramu i razbila "));
        ss=stest.trimAndChangeA(" mAsha myla ramu i razbila ");
        System.out.println(ss);

        TextJU stest2=new TextJU("testing");
        ArrayList<String> strArrLisst=new ArrayList<>();
        ArrayList<Integer> intArrLisst=new ArrayList<>();

        strArrLisst.add("1 go");
        System.out.println(stest2.strEq(strArrLisst));
       // System.out.println(stest2.strEq(intArrLisst));

        Car car1=new Car(new Color("Red"),new Engine(100),Types.CUPE);
        System.out.println(car1);

        System.out.println(Types.valueOf("CUPE"));







    }


}

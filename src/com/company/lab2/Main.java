package com.company.lab2;

import com.company.lab2.hierarhicalinheritance.Frigider;
import com.company.lab2.hierarhicalinheritance.Televizor;
import com.company.lab2.singleinheritance.Dictionar;

public class Main {

    public static void main(String[] args) {
        //hierarhical inheritance
	    Televizor lg = new Televizor(true,"DA","NU","DA","LG",40.5f,3500);
    	Televizor samsung = new Televizor(true,"DA","DA","NU","Samsung",45.5f,3000);
    	Frigider indesit = new Frigider(true,"DA","NU","DA","Indesit",300f,150f,"Alb",4300);
        System.out.println("--------------Toate electrocasnicele:-------------");
        System.out.println(lg.print());
        System.out.println(samsung.print());
        System.out.println(indesit.print());

        lg.setPretul(3000);     //folosire setter
        samsung.setPretul(2800);
        lg.setInStoc("NU");

        System.out.println("--------Preturile televizoarelor in urma reducerilor-------");
        System.out.println("Samsung:" + samsung.getPretul() + "\nLG: " + lg.getPretul());   //folosire getter
        System.out.println("Valabilitatea :\nSamsung: " + samsung.getInStoc() + "\nLG: " + lg.getInStoc());
        System.out.println("-----------A doua mostenire-----------------");

        //single inheritance
        Dictionar dic1 = new Dictionar("DEX","NU",1200,"Univers Enciclopedic","explicativ","romana",2016);
        System.out.println(dic1.print());
        Dictionar dic2 = new Dictionar("DEX de sinonime","NU",900,"ARC","de sinonime","engleza",2005);
        System.out.println(dic2.print());

    }
}

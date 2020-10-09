package com.company.lab2.singleinheritance;

import com.company.lab2.singleinheritance.Carte;

public class Dictionar extends Carte {
    private String tipul;
    private String limba;
    private int anul;

    public Dictionar(String denumirea,String autor,int nrPag,String editura,String tipul,String limba,int anul){
        super(denumirea, autor, nrPag, editura);
    this.tipul=tipul;
    this.limba=limba;
    this.anul=anul;

    }

    public String getTipul() {
        return tipul;
    }

    public void setTipul(String tipul) {
        this.tipul = tipul;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }
    public String print() {
        return "Denumirea: " + getDenumirea() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Numarul de pagini: " + getNrPag() + "\n"+
                "Editura: " + getEditura() + "\n" +
                "Tipul: " + this.tipul + "\n" +
                "Limba: " + this.limba + "\n" +
                "Anul: " + this.anul + "\n";
    }
}

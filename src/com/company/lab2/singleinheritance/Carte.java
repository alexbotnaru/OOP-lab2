package com.company.lab2.singleinheritance;

public class Carte {
    private String denumirea;
    private String autor;
    private int nrPag;
    private String editura;

    public Carte(String denumirea, String autor, int nrPag, String editura) {
        this.denumirea = denumirea;
        this.autor = autor;
        this.nrPag = nrPag;
        this.editura = editura;
    }

    public String getDenumirea() {
        return denumirea;
    }

    public void setDenumirea(String denumirea) {
        this.denumirea = denumirea;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }
    public String print() {
        return "Denumirea: " + this.denumirea + "\n" +
                "Autor: " + this.autor + "\n" +
                "Numarul de pagini: " + this.nrPag + "\n"+
                "Editura: " +this.editura + "\n";
    }
}

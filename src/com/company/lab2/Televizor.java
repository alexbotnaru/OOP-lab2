package com.company.lab2;

public class Televizor extends Electrocasnice {
    private String marca;
    private float diagonala;
    private float pretul;

    public Televizor(boolean functioneaza, String inStoc, String livrare, String inRate,String marca,float diagonala,float pretul) {
        super(functioneaza, inStoc, livrare, inRate);
        this.diagonala = diagonala;
        this.marca = marca;
        this.pretul = pretul;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(float diagonala) {
        this.diagonala = diagonala;
    }

    public float getPretul() {
        return pretul;
    }

    public void setPretul(float pretul) {
        this.pretul = pretul;
    }
@Override
    public String print() {
        return  "Marca: " + this.marca + "\n" +
                "Diagonala: " + this.diagonala + "\n" +
                "Pretul: " + this.pretul + "\n" +
                "In stoc:" + getInStoc() + "\n"+
                "Procurare in rate:" + getInRate() + "\n"+
                "Livrare: " + getLivrare()+ "\n";
    }
}


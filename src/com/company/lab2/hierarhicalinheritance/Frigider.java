package com.company.lab2.hierarhicalinheritance;

public class Frigider extends Electrocasnice {
    private String marca;
    private float consumul_kwh;
    private float capacitatea_l;
    private String culoarea;
    private float pretul;

    public Frigider(boolean functioneaza, String inStoc, String livrare, String inRate, String marca, float consumul_kwh, float capacitatea_l, String culoarea,float pretul) {
        super(functioneaza, inStoc, livrare, inRate);
        this.marca = marca;
        this.consumul_kwh = consumul_kwh;
        this.capacitatea_l = capacitatea_l;
        this.culoarea = culoarea;
        this.pretul=pretul;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getConsumul_kwh() {
        return consumul_kwh;
    }

    public void setConsumul_kwh(float consumul_kwh) {
        this.consumul_kwh = consumul_kwh;
    }

    public float getCapacitatea_l() {
        return capacitatea_l;
    }

    public void setCapacitatea_l(float capacitatea_l) {
        this.capacitatea_l = capacitatea_l;
    }

    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
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
                "Consumul(kwh/an): " + this.consumul_kwh + "\n" +
                "Pretul: " + this.pretul + "\n" +
                "Capacitatea(l): " + this.capacitatea_l + "\n" +
                "Culoarea: " + this.culoarea + "\n" +
                "In stoc:" + getInStoc() + "\n"+
                "Procurare in rate:" + getInRate() + "\n"+
                "Livrare: " + getLivrare()+ "\n";
    }

}




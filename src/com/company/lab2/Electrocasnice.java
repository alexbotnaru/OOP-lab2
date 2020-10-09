package com.company.lab2;

public class Electrocasnice {

        private boolean functioneaza = true;
        private String inStoc = "DA";
        private String livrare = "NU";
        private String inRate = "DA";

        public Electrocasnice(boolean functioneaza, String inStoc, String livrare,String inRate) {
            this.functioneaza = functioneaza;
            this.inStoc = inStoc;
            this.livrare = livrare;
            this.inRate=inRate;
        }

    public boolean getFunctioneaza(){
            return functioneaza;
        }

        public void setFunctioneaza(boolean functioneaza) {
            this.functioneaza = functioneaza;
        }

        public String getInStoc(){
            return inStoc;
        }
        public void setInStoc(String inStoc) {
            this.inStoc = inStoc;
        }

        public String getLivrare() {
            return livrare;
        }

        public void setLivrare(String livrare) {
            this.livrare = livrare;
        }

        public String getInRate() {
        return inRate;
        }

        public void setInRate(String inRate) {
        this.inRate = inRate;
        }

    public String print() {
            return "Functioneaza: " + this.functioneaza + "\n" +
                    "In Stoc: " + this.inStoc + "\n" +
                    "Livrare: " + this.livrare + "\n"+
                    "Procurare in rate: " +this.inRate + "\n";
        }
    }



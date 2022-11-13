package com.Andrej;

public class Avtomobil {
    public String marka,model,boja,registracija;
    public int godinaNaProizvodstvo;
    public double  pominatiKm;


    public Avtomobil(String marka, String model, String boja, double pominatiKm,int godinaNaProizvodstvo, String registracija) {
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.pominatiKm=pominatiKm;
        this.godinaNaProizvodstvo=godinaNaProizvodstvo;
        this.registracija=registracija;
    }


    public void generalInfo () {
        System.out.println(marka + " "+ model + " " + boja);
    }
    public double getPominatiKm() {
        return pominatiKm*1520.25;
    }
}

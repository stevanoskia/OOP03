package com.Andrej;

public class PC {
    public int memorija;
    public String tipNaMemorija;
    public int SSD;
    public String golemina = "GB";
    public PC () {
        memorija=2;
        tipNaMemorija="DDR4";
        SSD=256;
    }
    public void memoryHandler(int zgolemiMemorija, int novSSD) {

        int novaMemorija=this.memorija + zgolemiMemorija;
        int zgolemenSSD = this.SSD + novSSD;
        System.out.println("Memorijata bese: " + memorija + "GB, sega iznesuva " + novaMemorija + "GB");
        System.out.println("Tipot na memorijata e: " + tipNaMemorija);
        System.out.println("SSD ima golemina od: " + zgolemenSSD + "GB. Prethodno iznesuvase: " + this.SSD + "GB");

    }
}

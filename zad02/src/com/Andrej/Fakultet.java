package com.Andrej;

public class Fakultet {
    public String nazivNaFakultet, dekan, sediste;
    public int brNaSmerovi, brNaStudenti;

    public void zgolemiStudenti() {
        System.out.println(this.brNaStudenti + 50);
    }

    public int namaliStudenti(int namali) {
        int namalenaVrednost = this.brNaStudenti - namali;
        return namalenaVrednost;
    }

    public void podatociZaFakultetot() {
        System.out.println("Ime na fakultetot: " + this.nazivNaFakultet + " Lokacija: " + this.sediste);
    }
}

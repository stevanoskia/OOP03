package com.Andrej;

public class Main {

    public static void main(String[] args) {
	Fakultet f1 = new Fakultet();
	f1.brNaSmerovi=4;
	f1.brNaStudenti=150;
	f1.dekan="Andrej Stevanoski";
	f1.nazivNaFakultet="FIKT";
	f1.sediste="Bitola";
		f1.podatociZaFakultetot();
        f1.zgolemiStudenti();
		System.out.println(f1.namaliStudenti(30));


		Fakultet f2 = new Fakultet();
		f2.sediste="Bitola";
		f2.nazivNaFakultet="Pedagoski Fakultet";
		f2.dekan="Dimitar Dimitriovski";
		f2.brNaStudenti=120;
		f2.brNaSmerovi=4;
		f2.podatociZaFakultetot();
		f2.zgolemiStudenti();
		System.out.println(f2.namaliStudenti(40));


    }

    }

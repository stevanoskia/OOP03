package com.Andrej;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int brNaFrlanja;
	Brojach brPismo = new Brojach();
	Brojach brGlava = new Brojach();
	Scanner sc = new Scanner(System.in);
        System.out.println("Vnesete broj na frlanja: ");
        brNaFrlanja = sc.nextInt();

        while (brNaFrlanja > 0) {
            brPismo.brojachReset();
            brGlava.brojachReset();
            for(int i =0; i<brNaFrlanja;i++) {
                    if(Math.random() < 0.5)
                    brPismo.zgolemi();
                    else
                        brGlava.zgolemi();

            }
            System.out.println("Vo " + brNaFrlanja + " frlanja");
            System.out.println("Padnaa " + brPismo.brojach + " pisma");
            System.out.println("Padnaa: " +brGlava.brojach + " glavi");

            System.out.println("Dokolku sakate povtorno da frlate, vnesete broj na frlanja: ");
            brNaFrlanja = sc.nextInt();
        }
        sc.close();
    }
}

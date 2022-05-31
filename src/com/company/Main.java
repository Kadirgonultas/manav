package com.company;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutkg = 2.14,elmakg = 3.67,domateskg = 1.11,muzkg = 0.95,patlicankg = 5.00,toplam;
        int armut,elma,domates,muz,patlican;

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextInt();

        toplam = ((armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg));

        System.out.println(toplam);






    }
}

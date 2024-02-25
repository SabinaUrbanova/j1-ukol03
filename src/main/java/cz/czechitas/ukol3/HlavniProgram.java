package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //ukol 1
        //test, že počítač jde zapnout, jen pokud je správně sestavený.
        Pocitac mujPc = new Pocitac();
        System.out.println(mujPc.toString());
        mujPc.zapniSe();
        // pridám komponenty
        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_000_000_000L);
        mujProcesor.setVyrobce("Intel");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(34_359_738_368L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(1_012_538_540_032L);

        mujPc.setCpu(mujProcesor);
        mujPc.setRam(mojePamet);
        mujPc.setPevnyDisk(mujDisk);

        //test toString funkce
        System.out.println(mujPc.toString());

        mujPc.zapniSe();
        System.out.println(mujPc.toString());
        mujPc.zapniSe();      // Vypíše chybu, protože počítač už běží
        mujPc.vypniSe();
        System.out.println(mujPc.toString());

        mujPc.vypniSe();      // Nevypíše chybu, ale nic neprovede, protože počítač už je vypnutý */

        System.out.println("Program spuštěn.");
        //ukol 2
        System.out.println(mujDisk.getVyuziteMisto());
        mujPc.vytvorSouborOVelikosti(1012538540000L); //vytvorí súbor o velkosti menše ako je kapacita disku
        mujPc.vytvorSouborOVelikosti(1012538540000L); //vyhodí chybu, kapacita disku je prekročená
        System.out.println(mujDisk.getVyuziteMisto());
        mujPc.vymazSouboryOVelikosti(9999999999999L); //vyhodí chybu, pokúsi sa vymazat súbory vačšie ako kapacita disku
        System.out.println(mujDisk.getVyuziteMisto());
        mujPc.vymazSouboryOVelikosti(9999999L); //vymaze súbory zadanej velkosti
        System.out.println(mujDisk.getVyuziteMisto());

    }

}


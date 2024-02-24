package cz.czechitas.ukol3.model;

import java.util.ArrayList;
import java.util.List;

public class Pocitac {
    private boolean jeZapnuty;
    private Pamet ram;
    private Disk pevnyDisk;
    private Procesor cpu; //budeme se tvářit, že počítač má jen jeden procesor s jedním jádrem

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public String toString () {
        String stav;
        if (jeZapnuty == true) {
            stav = "zapnutý";
        } else {
            stav = "vypnutý";
        }
        return ("Toto je počítač, který je " + stav);
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }
    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač není možno zapnout dvakrát.");
        } else
        if (ram == null | cpu == null | pevnyDisk == null) {
            System.err.println("Nejaká komponenta chybí. Zkontrolujte procesor, paměť a disk");
        } else {
            jeZapnuty = true;
        }
    }
    public void vypniSe() {
        jeZapnuty = false;
    }

    //Metoda vytvorSouborOVelikosti(long velikost) zvýší proměnnou vyuziteMisto o velikost.
    //Pokud by se už nově vytvářený soubor na disk nevešel, metoda vypíše chybu a vyuziteMisto se nebude měnit.
    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty==true) {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()+velikost);
        } else {
            System.err.println("Počítač je vypnutý.");
        }
    }

    // Metoda vymazSouboryOVelikosti(long velikost) sníží proměnnou vyuziteMisto o velikost.
    // vyuziteMisto nemůže klesnout pod 0. Metody budou fungovat pouze, pokud je počítač zapnutý.
    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty==true) {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()-velikost);
        } else {
            System.err.println("Počítač je vypnutý.");
        }
    }
}

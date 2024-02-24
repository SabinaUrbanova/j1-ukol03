package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if  (vyuziteMisto <= kapacita & vyuziteMisto >= 0) {
            this.vyuziteMisto = vyuziteMisto;
        } else if (vyuziteMisto > kapacita) {
            System.err.println("Na disku není dostatek místa.");
        } else if (vyuziteMisto < 0) {
            System.err.println("Využité místo na disku nemůže být menší než 0.");
        }
    }

    public String toString () {
        return "Toto je disk, který  má kapacitu " + kapacita + " bajt/ů, z toho bylo využito " + vyuziteMisto + " bajt/ů";
    }
}

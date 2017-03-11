package slavko.baze2.procesnabavke.domain;

import slavko.baze2.procesnabavke.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Slavko Komarica
 */
@Entity
@Table(name = "valuta")
public class Valuta extends BaseEntity {

    @Column
    private String naziv;

    public Valuta() {

    }

    public Valuta(String naziv) {
        this.naziv = naziv;
    }

    public Valuta(Long sifra, String naziv) {
        this.sifra = sifra;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}

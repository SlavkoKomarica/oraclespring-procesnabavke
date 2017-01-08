package slavko.baze2.procesnabavke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Slavko Komarica
 */
@Entity
@Table(name = "zaposleni")
public class Zaposleni {
    @Id
    @Column(name = "sifra_zaposlenog")
    private Long sifraZaposlenog;
    @Column
    private String ime;
    @Column(name = "jmbg", columnDefinition = "JMBG_TYPE")
    @org.hibernate.annotations.Type(type = "slavko.baze2.procesnabavke.domain.Jmbg")
    private Jmbg jmbg;

    public Long getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(Long sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Jmbg getJmbg() {
        return jmbg;
    }

    public void setJmbg(Jmbg jmbg) {
        this.jmbg = jmbg;
    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "sifraZaposlenog=" + sifraZaposlenog +
                ", ime='" + ime + '\'' +
                ", jmbg=" + (jmbg == null ? "" : jmbg.getJmbg()) +
                '}';
    }
}

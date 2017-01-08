package slavko.baze2.procesnabavke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Slavko Komarica
 */
@Entity
@Table(name = "jedinicamere")
public class JedinicaMere {
    @Id
    @Column(name = "sifra_jedinice_mere")
    private Long sifraJediniceMere;
    @Column
    private String naziv;

    public JedinicaMere() {
    }

    public JedinicaMere(Long sifraJediniceMere, String naziv) {
        this.sifraJediniceMere = sifraJediniceMere;
        this.naziv = naziv;
    }

    public Long getSifraJediniceMere() {
        return sifraJediniceMere;
    }

    public void setSifraJediniceMere(Long sifraJediniceMere) {
        this.sifraJediniceMere = sifraJediniceMere;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}

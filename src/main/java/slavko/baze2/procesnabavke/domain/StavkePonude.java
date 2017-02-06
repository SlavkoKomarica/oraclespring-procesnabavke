package slavko.baze2.procesnabavke.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Slavko Komarica
 */
@Embeddable
public class StavkePonude {

    @Column(name = "br_stavke", nullable = false)
    private Long brStavke;

    private Integer kolicina;

    private Double rabat;

    private Double cena;

    @Column(name = "sifra_proizvoda")
    private Long sifraProizvoda;

    @ManyToOne
    @JoinColumn(name = "sifra_proizvoda", insertable = false, updatable = false)
    private Proizvod proizvod;

    public StavkePonude() {
    }

    public Long getBrStavke() {
        return brStavke;
    }

    public void setBrStavke(Long brStavke) {
        this.brStavke = brStavke;
    }

    public Integer getKolicina() {
        return kolicina;
    }

    public void setKolicina(Integer kolicina) {
        this.kolicina = kolicina;
    }

    public Double getRabat() {
        return rabat;
    }

    public void setRabat(Double rabat) {
        this.rabat = rabat;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Long getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(Long sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }


}

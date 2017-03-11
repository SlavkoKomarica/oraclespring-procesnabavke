package slavko.baze2.procesnabavke.domain;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Slavko Komarica
 */
@Embeddable
@ToString
public class StavkeNarudzbenice {

    @Column(name = "broj_stavke", nullable = false)
    private Long brStavke;

    private Integer kolicina;

    @Column(name = "sifra_proizvoda")
    private Long sifraProizvoda;

    @ManyToOne
    @JoinColumn(name = "sifra_proizvoda", insertable = false, updatable = false)
    private Proizvod proizvod;

    public StavkeNarudzbenice() {
    }

    private StavkeNarudzbenice(Builder builder) {
        setBrStavke(builder.brStavke);
        setKolicina(builder.kolicina);
        setSifraProizvoda(builder.sifraProizvoda);
        setProizvod(builder.proizvod);
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

    public static final class Builder {
        private Long brStavke;
        private Integer kolicina;
        private Long sifraProizvoda;
        private Proizvod proizvod;

        public Builder() {
        }

        public Builder withBrStavke(Long val) {
            brStavke = val;
            return this;
        }

        public Builder withKolicina(Integer val) {
            kolicina = val;
            return this;
        }

        public Builder withSifraProizvoda(Long val) {
            sifraProizvoda = val;
            return this;
        }

        public Builder withProizvod(Proizvod val) {
            proizvod = val;
            return this;
        }

        public StavkeNarudzbenice build() {
            return new StavkeNarudzbenice(this);
        }
    }
}

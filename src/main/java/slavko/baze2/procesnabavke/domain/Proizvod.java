package slavko.baze2.procesnabavke.domain;

import slavko.baze2.procesnabavke.BaseEntity;

import javax.persistence.*;

/**
 * @author Slavko Komarica
 */
@Entity
@Table(name = "proizvod")
public class Proizvod extends BaseEntity {

    @Column
    private String naziv;

    @Column(name = "akt_cena")
    private Double aktCena;

    @Column
    private String opis;

    @Column(name = "sifra_tipa_proizvoda")
    private Long sifraTipaProizvoda;

    @ManyToOne
    @JoinColumn(name = "sifra_tipa_proizvoda", insertable = false, updatable = false)
    private TipProizvoda drzava;

    @Column(name = "sifra_jedinice_mere")
    private Long sifraJediniceMere;

    @ManyToOne
    @JoinColumn(name = "sifra_jedinice_mere", insertable = false, updatable = false)
    private JedinicaMere jedinicaMere;


    public Proizvod() {
    }

    private Proizvod(Builder builder) {
        setNaziv(builder.naziv);
        setAktCena(builder.aktCena);
        setSifra(builder.sifra);
        setOpis(builder.opis);
        setSifraTipaProizvoda(builder.sifraTipaProizvoda);
        setDrzava(builder.drzava);
        setSifraJediniceMere(builder.sifraJediniceMere);
        setJedinicaMere(builder.jedinicaMere);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getAktCena() {
        return aktCena;
    }

    public void setAktCena(Double aktCena) {
        this.aktCena = aktCena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Long getSifraTipaProizvoda() {
        return sifraTipaProizvoda;
    }

    public void setSifraTipaProizvoda(Long sifraTipaProizvoda) {
        this.sifraTipaProizvoda = sifraTipaProizvoda;
    }

    public TipProizvoda getDrzava() {
        return drzava;
    }

    public void setDrzava(TipProizvoda drzava) {
        this.drzava = drzava;
    }

    public Long getSifraJediniceMere() {
        return sifraJediniceMere;
    }

    public void setSifraJediniceMere(Long sifraJediniceMere) {
        this.sifraJediniceMere = sifraJediniceMere;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public static final class Builder {
        private String naziv;
        private Double aktCena;
        private Long sifra;
        private String opis;
        private Long sifraTipaProizvoda;
        private TipProizvoda drzava;
        private Long sifraJediniceMere;
        private JedinicaMere jedinicaMere;

        public Builder() {
        }

        public Builder withNaziv(String val) {
            naziv = val;
            return this;
        }

        public Builder withAktCena(Double val) {
            aktCena = val;
            return this;
        }

        public Builder withSifra(Long val) {
            sifra = val;
            return this;
        }

        public Builder withOpis(String val) {
            opis = val;
            return this;
        }

        public Builder withSifraTipaProizvoda(Long val) {
            sifraTipaProizvoda = val;
            return this;
        }

        public Builder withDrzava(TipProizvoda val) {
            drzava = val;
            return this;
        }

        public Builder withSifraJediniceMere(Long val) {
            sifraJediniceMere = val;
            return this;
        }

        public Builder withJedinicaMere(JedinicaMere val) {
            jedinicaMere = val;
            return this;
        }

        public Proizvod build() {
            return new Proizvod(this);
        }
    }
}

package slavko.baze2.procesnabavke.domain;

import javax.persistence.*;
import java.util.*;

/**
 * @author Slavko Komarica
 */
@Entity
@Table(name = "tipproizvoda")
public class TipProizvoda {
    @Id
    @Column(name = "sifra_tipa_proizvoda")
    private Long sifraTipaProizvoda;

    @Column(name = "naziv_tipa_proizvoda")
    private String nazivTipaProizvoda;

    @ElementCollection
    @CollectionTable(name = "pdvistorija", joinColumns = @JoinColumn(name = "sifra_tipa_proizvoda", referencedColumnName = "sifra_tipa_proizvoda"))
    @MapKeyColumn(name = "datum")
    private Map<Date, PdvIstorija> pdvIstorija = new HashMap<>();

    public Long getSifraTipaProizvoda() {
        return sifraTipaProizvoda;
    }

    public void setSifraTipaProizvoda(Long sifraTipaProizvoda) {
        this.sifraTipaProizvoda = sifraTipaProizvoda;
    }

    public String getNazivTipaProizvoda() {
        return nazivTipaProizvoda;
    }

    public void setNazivTipaProizvoda(String nazivTipaProizvoda) {
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }

    public Map<Date, PdvIstorija> getPdvIstorija() {
        return pdvIstorija;
    }

    public void setPdvIstorija(Map<Date, PdvIstorija> pdvIstorija) {
        this.pdvIstorija = pdvIstorija;
    }
}

package slavko.baze2.procesnabavke.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Slavko Komarica
 */
@Embeddable
public class PdvIstorija {

    @Column(name = "pdv_stopa")
    private Double pdvStopa;

    public Double getPdvStopa() {
        return pdvStopa;
    }

    public void setPdvStopa(Double pdvStopa) {
        this.pdvStopa = pdvStopa;
    }
}

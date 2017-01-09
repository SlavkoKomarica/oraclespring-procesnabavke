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

    //not null columns will be used with
    //parent primary key to create composite primary key for this table
    @Column(nullable = false)
    private Date datum;

    @Column(name = "pdv_stopa")
    private Double pdvStopa;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getPdvStopa() {
        return pdvStopa;
    }

    public void setPdvStopa(Double pdvStopa) {
        this.pdvStopa = pdvStopa;
    }
}

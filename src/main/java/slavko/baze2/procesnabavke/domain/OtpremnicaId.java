package slavko.baze2.procesnabavke.domain;

import java.io.Serializable;

/**
 * @author Sinisa Komarica
 */
public class OtpremnicaId implements Serializable {

    private Long sifraDobavljaca;

    private Long brojOtpremnice;

    public OtpremnicaId() {

    }

    public Long getSifraDobavljaca() {
        return sifraDobavljaca;
    }

    public void setSifraDobavljaca(Long sifraDobavljaca) {
        this.sifraDobavljaca = sifraDobavljaca;
    }

    public Long getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(Long brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }
}

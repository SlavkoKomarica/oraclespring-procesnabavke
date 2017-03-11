package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Otpremnica;
import slavko.baze2.procesnabavke.domain.OtpremnicaId;
import slavko.baze2.procesnabavke.repositories.OtpremnicaRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class OtpremnicaService {

    private final OtpremnicaRepo otpremnicaRepo;

    public OtpremnicaService(OtpremnicaRepo otpremnicaRepo) {
        this.otpremnicaRepo = otpremnicaRepo;
    }

    @Transactional(readOnly = true)
    public List<Otpremnica> getAll() {
        return otpremnicaRepo.findAll();
    }

    @Transactional
    public Otpremnica create(Otpremnica otpremnica) {
        return otpremnicaRepo.save(otpremnica);
    }

    @Transactional
    public Otpremnica update(OtpremnicaId id, Otpremnica otpremnica) {
        if (!otpremnicaRepo.exists(id)) {
            throw new RuntimeException(String.format("Otpremnica sa id-em %n ne postoji", otpremnica));
        }

        return otpremnicaRepo.save(otpremnica);
    }

}

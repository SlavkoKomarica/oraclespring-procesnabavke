package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Narudzbenica;
import slavko.baze2.procesnabavke.repositories.NarudzbenicaRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class NarudzbenicaService {

    private final NarudzbenicaRepo narudzbenicaRepo;

    public NarudzbenicaService(NarudzbenicaRepo narudzbenicaRepo) {
        this.narudzbenicaRepo = narudzbenicaRepo;
    }

    @Transactional(readOnly = true)
    public List<Narudzbenica> getAll() {
        return narudzbenicaRepo.findAll();
    }

    @Transactional
    public Narudzbenica create(Narudzbenica narudzbenica) {
        return narudzbenicaRepo.save(narudzbenica);
    }

    @Transactional
    public Narudzbenica update(Long id, Narudzbenica narudzbenica) {
        if (!narudzbenicaRepo.exists(id)) {
            throw new RuntimeException(String.format("Narudzbenica sa id-em %n ne postoji", narudzbenica));
        }

        return narudzbenicaRepo.save(narudzbenica);
    }

}

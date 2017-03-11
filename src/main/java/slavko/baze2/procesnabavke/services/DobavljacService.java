package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Dobavljac;
import slavko.baze2.procesnabavke.repositories.DobavljacRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class DobavljacService {

    private final DobavljacRepo dobavljacRepo;

    public DobavljacService(DobavljacRepo dobavljacRepo) {
        this.dobavljacRepo = dobavljacRepo;
    }

    @Transactional(readOnly = true)
    public List<Dobavljac> getAll() {
        return dobavljacRepo.findAll();
    }

    @Transactional
    public Dobavljac create(Dobavljac dobavljac) {
        return dobavljacRepo.save(dobavljac);
    }

    @Transactional
    public Dobavljac update(Long id, Dobavljac dobavljac) {
        if (!dobavljacRepo.exists(id)) {
            throw new RuntimeException(String.format("Dobavljac sa id-em %n ne postoji", dobavljac));
        }

        return dobavljacRepo.save(dobavljac);
    }

}

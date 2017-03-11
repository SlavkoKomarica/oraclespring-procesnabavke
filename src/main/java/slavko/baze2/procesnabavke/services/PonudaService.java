package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Ponuda;
import slavko.baze2.procesnabavke.repositories.PonudaRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class PonudaService {

    private final PonudaRepo ponudaRepo;

    public PonudaService(PonudaRepo ponudaRepo) {
        this.ponudaRepo = ponudaRepo;
    }

    @Transactional(readOnly = true)
    public List<Ponuda> getAll() {
        return ponudaRepo.findAll();
    }

    @Transactional
    public Ponuda create(Ponuda ponuda) {
        return ponudaRepo.save(ponuda);
    }

    @Transactional
    public Ponuda update(Long id, Ponuda ponuda) {
        if (!ponudaRepo.exists(id)) {
            throw new RuntimeException(String.format("Ponuda sa id-em %n ne postoji", ponuda));
        }

        return ponudaRepo.save(ponuda);
    }

}

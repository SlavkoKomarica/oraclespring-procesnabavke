package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.JedinicaMere;
import slavko.baze2.procesnabavke.repositories.JedinicaMereRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class JedinicaMereService {

    private final JedinicaMereRepo jedinicaMereRepo;

    public JedinicaMereService(JedinicaMereRepo jedinicaMereRepo) {
        this.jedinicaMereRepo = jedinicaMereRepo;
    }

    @Transactional(readOnly = true)
    public List<JedinicaMere> getAll() {
        return jedinicaMereRepo.findAll();
    }

    @Transactional
    public JedinicaMere create(JedinicaMere jedinicaMere) {
        return jedinicaMereRepo.save(jedinicaMere);
    }

    @Transactional
    public JedinicaMere update(Long id, JedinicaMere jedinicaMere) {
        if (!jedinicaMereRepo.exists(id)) {
            throw new RuntimeException(String.format("JedinicaMere sa id-em %n ne postoji", jedinicaMere));
        }

        return jedinicaMereRepo.save(jedinicaMere);
    }

}

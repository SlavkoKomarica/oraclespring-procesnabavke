package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Ugovor;
import slavko.baze2.procesnabavke.repositories.UgovorRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class UgovorService {

    private final UgovorRepo ugovorRepo;

    public UgovorService(UgovorRepo ugovorRepo) {
        this.ugovorRepo = ugovorRepo;
    }

    @Transactional(readOnly = true)
    public List<Ugovor> getAll() {
        return ugovorRepo.findAll();
    }

    @Transactional
    public Ugovor create(Ugovor ugovor) {
        return ugovorRepo.save(ugovor);
    }

    @Transactional
    public Ugovor update(Long id, Ugovor ugovor) {
        if (!ugovorRepo.exists(id)) {
            throw new RuntimeException(String.format("Ugovor sa id-em %n ne postoji", ugovor));
        }

        return ugovorRepo.save(ugovor);
    }

}

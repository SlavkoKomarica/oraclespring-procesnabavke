package slavko.baze2.procesnabavke.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Valuta;
import slavko.baze2.procesnabavke.repositories.ValutaRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class ValutaService {

    private final ValutaRepo valutaRepo;

    public ValutaService(ValutaRepo valutaRepo) {
        this.valutaRepo = valutaRepo;
    }

    @Transactional(readOnly = true)
    public List<Valuta> getAll() {
        return valutaRepo.findAll();
    }

    @Transactional
    public Valuta create(Valuta valuta) {
        return valutaRepo.save(valuta);
    }

    @Transactional
    public Valuta update(Long id, Valuta valuta) {
        if (!valutaRepo.exists(id)) {
            throw new RuntimeException(String.format("Valuta sa id-em %n ne postoji", valuta));
        }

        return valutaRepo.save(valuta);
    }

}

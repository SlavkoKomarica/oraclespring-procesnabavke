package slavko.baze2.procesnabavke.services;

import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slavko.baze2.procesnabavke.domain.Zaposleni;
import slavko.baze2.procesnabavke.repositories.ZaposleniRepo;

import java.util.List;

/**
 * @author Slavko Komarica
 */
@Service
public class ZaposleniService {

    private final ZaposleniRepo zaposleniRepo;

    public ZaposleniService(ZaposleniRepo zaposleniRepo) {
        this.zaposleniRepo = zaposleniRepo;
    }

    @Transactional(readOnly = true)
    public List<Zaposleni> getAll() {
        return zaposleniRepo.findAll();
    }

    //do not put transactional because of caught exception
    public void create(Zaposleni zaposleni) {
        try {
            zaposleniRepo.insert(zaposleni);
        } catch (JpaSystemException e) {
            //jmbg causes problem, but insert was ok
        }
    }

}

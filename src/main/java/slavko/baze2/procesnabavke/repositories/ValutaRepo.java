package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Valuta;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface ValutaRepo extends CrudRepository<Valuta, Long> {

    List<Valuta> findAll();

}

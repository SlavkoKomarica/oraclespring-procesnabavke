package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Ugovor;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface UgovorRepo extends CrudRepository<Ugovor, Long> {

    List<Ugovor> findAll();

}

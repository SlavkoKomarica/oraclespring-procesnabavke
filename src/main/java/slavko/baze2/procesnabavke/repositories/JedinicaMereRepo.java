package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.JedinicaMere;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface JedinicaMereRepo extends CrudRepository<JedinicaMere, Long> {
    List<JedinicaMere> findAll();
}

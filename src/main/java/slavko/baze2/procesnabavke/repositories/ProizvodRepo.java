package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Proizvod;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface ProizvodRepo extends CrudRepository<Proizvod, Long> {
    List<Proizvod> findAll();
}

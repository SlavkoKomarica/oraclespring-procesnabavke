package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Ponuda;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface PonudaRepo extends CrudRepository<Ponuda, Long> {

    List<Ponuda> findAll();

}
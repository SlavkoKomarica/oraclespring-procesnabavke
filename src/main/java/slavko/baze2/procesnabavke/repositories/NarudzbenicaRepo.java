package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Narudzbenica;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface NarudzbenicaRepo extends CrudRepository<Narudzbenica, Long> {

    List<Narudzbenica> findAll();

}

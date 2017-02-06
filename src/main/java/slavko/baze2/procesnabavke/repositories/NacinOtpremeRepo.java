package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.NacinOtpreme;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface NacinOtpremeRepo extends CrudRepository<NacinOtpreme, Long> {
    List<NacinOtpreme> findAll();
}

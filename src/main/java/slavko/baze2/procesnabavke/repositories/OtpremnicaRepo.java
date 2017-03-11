package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.repository.CrudRepository;
import slavko.baze2.procesnabavke.domain.Otpremnica;
import slavko.baze2.procesnabavke.domain.OtpremnicaId;

import java.util.List;

/**
 * @author Slavko Komarica
 */
public interface OtpremnicaRepo extends CrudRepository<Otpremnica, OtpremnicaId> {

    List<Otpremnica> findAll();

}

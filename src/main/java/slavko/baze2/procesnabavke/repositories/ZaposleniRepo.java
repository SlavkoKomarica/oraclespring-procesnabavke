package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import slavko.baze2.procesnabavke.domain.Zaposleni;

import java.util.List;
import java.util.Set;

/**
 * @author Slavko Komarica
 */
public interface ZaposleniRepo extends CrudRepository<Zaposleni, Long> {

    @Override
    @Query(nativeQuery = true, value = "SELECT z.sifra, z.ime, z.prezime, z.jmbg.get() as jmbg FROM ZAPOSLENI z")
    List<Zaposleni> findAll();

    @Override
    @Query(nativeQuery = true, value = "SELECT z.sifra, z.ime, z.prezime, z.jmbg.get() as jmbg FROM ZAPOSLENI z where z.sifra = :id")
    Zaposleni findOne(@Param(value = "id") Long id);

    @Query(nativeQuery = true,
            value = "INSERT into zaposleni(sifra,ime,prezime,jmbg) " +
                    "VALUES(:#{#zaposleni.sifra},:#{#zaposleni.ime},:#{#zaposleni.prezime},JMBG_TYPE(:#{#zaposleni.jmbg.jmbg}))")
    void insert(@Param(value = "zaposleni") Zaposleni zaposleni);

}

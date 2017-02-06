package slavko.baze2.procesnabavke.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import slavko.baze2.procesnabavke.domain.Zaposleni;

import java.util.Set;

/**
 * @author Slavko Komarica
 */
public interface ZaposleniRepo extends CrudRepository<Zaposleni, Long> {
    @Override
    @Query(nativeQuery = true, value = "SELECT z.sifra_zaposlenog, z.ime, z.jmbg.get() as jmbg FROM ZAPOSLENI z")
    Set<Zaposleni> findAll();

    @Override
    @Query(nativeQuery = true, value = "SELECT z.sifra_zaposlenog, z.ime, z.jmbg.get() as jmbg FROM ZAPOSLENI z where z.sifra_zaposlenog = :id")
    Zaposleni findOne(@Param(value = "id") Long id);

    @Override
    @Query(nativeQuery = true, value = "INSERT into zaposleni(sifra_zaposlenog,ime,jmbg) VALUES(:#{#zaposleni.sifraZaposlenog},:#{#zaposleni.ime},JMBG_TYPE(:#{#zaposleni.jmbg.jmbg}))")
    Zaposleni save(@Param(value = "zaposleni") Zaposleni zaposleni);
}

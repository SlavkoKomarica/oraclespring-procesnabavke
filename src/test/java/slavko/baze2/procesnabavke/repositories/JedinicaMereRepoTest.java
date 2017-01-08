package slavko.baze2.procesnabavke.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import slavko.baze2.procesnabavke.domain.JedinicaMere;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JedinicaMereRepoTest {

    @Autowired
    private JedinicaMereRepo jedinicaMereRepo;

    @Test
    public void test() {
        JedinicaMere jedinicaMere = new JedinicaMere(1L, "KOM");
        jedinicaMereRepo.save(jedinicaMere);

        assertThat(jedinicaMereRepo.findOne(1L).getSifraJediniceMere()).isEqualTo(1l);
    }
}

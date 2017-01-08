package slavko.baze2.procesnabavke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import slavko.baze2.procesnabavke.domain.Jmbg;
import slavko.baze2.procesnabavke.domain.Zaposleni;
import slavko.baze2.procesnabavke.repositories.ZaposleniRepo;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Autowired
    private ZaposleniRepo zaposleniRepo;

    @Override
    public void run(String... strings) throws Exception {
//        Zaposleni zaposleni = new Zaposleni();
//        zaposleni.setIme("Slavko");
//        Jmbg jmbg = new Jmbg();
//        jmbg.setJmbg("0112993710329");
//        zaposleni.setJmbg(jmbg);
//        zaposleni.setSifraZaposlenog(2l);

//        zaposleniRepo.save(zaposleni);

        zaposleniRepo.findAll().forEach(System.out::println);
        System.out.println("With id 3: " + zaposleniRepo.findOne(3L));
    }
}

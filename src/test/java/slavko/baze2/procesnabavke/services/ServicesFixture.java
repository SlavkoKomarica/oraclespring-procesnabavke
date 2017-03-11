package slavko.baze2.procesnabavke.services;

import slavko.baze2.procesnabavke.domain.*;

import java.util.Date;

/**
 * @author Slavko Komarica
 */
public class ServicesFixture {

    public static final long STANDARD_SIFRA_VALUTE = 1l;
    public static final String STANDARD_NAZIV_VALUTE = "RSD";
    public static final String STANDARD_NAZIV_VALUTE_UPDATED = "EUR";

    public static final long STANDARD_SIFRA_PONUDE = 1l;

    public static final long STANDARD_SIFRA_DOBAVLJACA = 1l;
    public static final String STANDARD_NAZIV_DOBAVLJACA = "Commerce";
    public static final String STANDARD_NAZIV_DOBAVLJACA_UPDATED = "Commerce D.O.O";

    public static final long STANDARD_SIFRA_UGOVORA = 1l;

    public static final long STANDARD_SIFRA_ZAPOSLENOG = 1l;
    public static final String STANDARD_IME_ZAPOSLENOG = "Pera";
    public static final String STANDARD_PREZIME_ZAPOSLENOG = "Peric";
    public static final Jmbg STANDARD_JMBG_ZAPOSLENOG = new Jmbg("0212995654823");

    public static final long STANDARD_SIFRA_NARUDZBENICE = 1l;

    public static final long STANDARD_BROJ_OTPREMNICE = 1l;

    public static final Date STANDARD_DATUM = new Date();


    public static Valuta standardValuta() {
        return new Valuta(STANDARD_SIFRA_VALUTE, STANDARD_NAZIV_VALUTE);
    }

    public static Valuta standardValutaUpdated() {
        return new Valuta(STANDARD_SIFRA_VALUTE, STANDARD_NAZIV_VALUTE_UPDATED);
    }

    public static Ponuda standardPonuda() {
        return new Ponuda.Builder()
                .withSifra(STANDARD_SIFRA_PONUDE)
                .withSifraValute(STANDARD_SIFRA_VALUTE).build();
    }

    public static Ugovor standardUgovor() {
        return new Ugovor.Builder()
                .withSifra(STANDARD_SIFRA_UGOVORA)
                .withDatum(STANDARD_DATUM)
                .withSifraPonude(STANDARD_SIFRA_PONUDE).build();
    }

    public static Zaposleni standardZaposleni() {
        return new Zaposleni(STANDARD_SIFRA_ZAPOSLENOG, STANDARD_IME_ZAPOSLENOG, STANDARD_PREZIME_ZAPOSLENOG, STANDARD_JMBG_ZAPOSLENOG);
    }

    public static Narudzbenica standardNarudzbenica() {
        return new Narudzbenica.Builder()
                .withSifra(STANDARD_SIFRA_NARUDZBENICE)
                .withDatumKreiranja(STANDARD_DATUM)
                .withSifraObracunao(STANDARD_SIFRA_ZAPOSLENOG)
                .withSifraOdobrio(STANDARD_SIFRA_ZAPOSLENOG)
                .withSifraUgovora(STANDARD_SIFRA_UGOVORA).build();
    }

    public static Dobavljac standardDobavljac() {
        return new Dobavljac.Builder()
                .withSifra(STANDARD_SIFRA_DOBAVLJACA)
                .withNaziv(STANDARD_NAZIV_DOBAVLJACA).build();
    }

    public static Dobavljac standardDobavljacUpdated() {
        return new Dobavljac.Builder()
                .withSifra(STANDARD_SIFRA_DOBAVLJACA)
                .withNaziv(STANDARD_NAZIV_DOBAVLJACA_UPDATED).build();
    }

    public static Otpremnica standardOtpremnica() {
        return new Otpremnica.Builder()
                .withBrojOtpremnice(STANDARD_BROJ_OTPREMNICE)
                .withSifraDobavljaca(STANDARD_SIFRA_DOBAVLJACA)
                .withSifraNarudzbenice(STANDARD_SIFRA_NARUDZBENICE).build();
    }


}

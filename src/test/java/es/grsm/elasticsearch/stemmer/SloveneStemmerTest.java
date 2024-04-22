package es.grsm.elasticsearch.stemmer;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SloveneStemmerTest {
    SloveneStemmer stemmer = new SloveneStemmer();

    private void stem(String str) {
        stemmer.setCurrent(str);
        stemmer.stem();
    }

    @Test

    public void testStemmingGeneral() {
        assertSloveneStemming("imam", "imam");
        		assertSloveneStemming("probl", "probleme");
        		assertSloveneStemming("z", "z");
        		assertSloveneStemming("očmi", "očmi");
        		assertSloveneStemming("in", "in");
        		assertSloveneStemming("bi", "bi");
        		assertSloveneStemming("šel", "šel");
        		assertSloveneStemming("rad", "rad");
        		assertSloveneStemming("v", "v");
        		assertSloveneStemming("kakšn", "kakšne");
        		assertSloveneStemming("terme", "terme");
        		assertSloveneStemming("pri", "pri");
        		assertSloveneStemming("mursk", "murski");
        		assertSloveneStemming("sobot", "soboti");
    }

    @Test
    public void testSlovenRoot() {
        assertSloveneStemming("sloven", "sloven");
        assertSloveneStemming("sloven", "slovenca");
        assertSloveneStemming("sloven", "slovence");
        assertSloveneStemming("sloven", "slovencem");
        assertSloveneStemming("sloven", "slovencev");
        assertSloveneStemming("sloven", "slovenci");
        assertSloveneStemming("sloven", "slovencih");
        assertSloveneStemming("sloven", "slovenec");
        assertSloveneStemming("sloven", "slovenija");
        assertSloveneStemming("sloven", "sloveniji");
        assertSloveneStemming("sloven", "slovenijo");
        assertSloveneStemming("sloven", "slovenko");
        assertSloveneStemming("sloven", "slovenska");
        assertSloveneStemming("sloven", "slovenske");
        assertSloveneStemming("sloven", "slovenskega");
        assertSloveneStemming("sloven", "slovenskem");
        assertSloveneStemming("sloven", "slovenskemu");
        assertSloveneStemming("sloven", "slovenski");
        assertSloveneStemming("sloven", "slovenskih");
        assertSloveneStemming("sloven", "slovenskim");
        assertSloveneStemming("sloven", "slovenskimi");
        assertSloveneStemming("sloven", "slovensko");
        assertSloveneStemming("sloven", "slovenstva");
        assertSloveneStemming("sloven", "slovenacina");
        assertSloveneStemming("sloven", "slovenacini");
        assertSloveneStemming("sloven", "slovenacino");
        assertSloveneStemming("sloven", "slovenačina");
        assertSloveneStemming("sloven", "slovenačini");
        assertSloveneStemming("sloven", "slovenačino");
    }

    @Test
    public void testTelovRoot() {
        assertSloveneStemming("telov", "telovadbe");
        assertSloveneStemming("telov", "telovadcem");
        assertSloveneStemming("telov", "telovadcev");
        assertSloveneStemming("telov", "telovadi");
        assertSloveneStemming("telov", "telovadil");
        assertSloveneStemming("telov", "telovaditi");
        assertSloveneStemming("telov", "telovadne");
        assertSloveneStemming("telov", "telovadni");
        assertSloveneStemming("telov", "telovadno");
        assertSloveneStemming("telovn", "telovnik");
    }

    @Test
    public void testTemaRoot() {
        assertSloveneStemming("tem", "tem");
        assertSloveneStemming("tema", "tema");
        assertSloveneStemming("temacn", "temacna");
        assertSloveneStemming("temacn", "temacni");
        assertSloveneStemming("temacn", "temacno");
    }

    @Test
    public void testBesedRoot() {

        assertSloveneStemming("besed", "besed");

        assertSloveneStemming("besed", "beseda");

        assertSloveneStemming("besed", "besedah");

        assertSloveneStemming("besed", "besedam");

        assertSloveneStemming("besed", "besedami");

        assertSloveneStemming("besed", "besede");

        assertSloveneStemming("besed", "besedi");

        assertSloveneStemming("besed", "besedice");

        assertSloveneStemming("besed", "besedico");

        assertSloveneStemming("besed", "besedila");

        assertSloveneStemming("besed", "besedilmiran");

        assertSloveneStemming("besed", "besedilo");

//        assertSloveneStemming("besed", "besedno");
    }

    @Test
    public void testNonSlovene() {
        // words with non-Slovak Latin characters, or non-Latin characters
        assertSloveneStemming("əliağ", "əliağa");

//        stem("año"); // "año" // Spanish
//        assertThat(stemmer.getCurrent(), is("año"));
//
//        stem("аблютомания"); // "аблютомания" // Russian
//        assertThat(stemmer.getCurrent(), is("аблютомания"));
//
//        stem("вищій"); // "вищій" // Ukrainian
//        assertThat(stemmer.getCurrent(), is("вищій"));
//
//        stem("βικιπαίδεια"); // "βικιπαίδεια" // Greek
//        assertThat(stemmer.getCurrent(), is("βικιπαίδεια"));
//
//        stem("ვიკიპედია"); // "ვიკიპედია" // Georgian
//        assertThat(stemmer.getCurrent(), is("ვიკიპედია"));
//
//        stem("위키백과"); // "위키백과" // Korean
//        assertThat(stemmer.getCurrent(), is("위키백과"));
//
//        stem("ውክፔዲያ"); // "ውክፔዲያ" // Amharic
//        assertThat(stemmer.getCurrent(), is("ውክፔዲያ"));
//
//        stem("ᐅᐃᑭᐱᑎᐊ"); // "ᐅᐃᑭᐱᑎᐊ" // Inuktitut
//        assertThat(stemmer.getCurrent(), is("ᐅᐃᑭᐱᑎᐊ"));
    }

    private void assertSloveneStemming(final String expected, final String toStem)
    {
        stem(toStem);
        assertEquals(expected, stemmer.getCurrent(), "Slovene stemming of " + toStem);
    }

}

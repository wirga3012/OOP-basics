
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();


        Book bookA = new Book();
        bookA.setTitle("Aplink mane vien idiotai");
        bookA.setPages(216);
        bookA.setYear(2019);

        Book bookB = new Book();
        bookB.setTitle("Laimė ir meditacija");
        bookB.setPages(250);
        bookB.setYear(2015);

        Book bookC = new Book();
        bookC.setTitle("Praeis");
        bookC.setPages(263);
        bookC.setYear(2019);

        books.add(bookA);
        books.add(bookB);
        books.add(bookC);

        Book bookD = new Book("Pranašystės - ", 160, 2009);
        Book bookE = new Book("Ten kur gieda vėžiai - ", 260, 2022);
        Book bookF = new Book("Psichologinis tvirtumas - ", 312, 2012);

        books.add(bookD);
        books.add(bookE);
        books.add(bookF);

//      System.out.println(Arrays.asList(bookA, bookB, C, D, E, F));

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book);
        }


        System.out.println("--------------------------------------------------------------------");
        ArrayList<Plant> plants = new ArrayList<>();

        Plant plant1 = new Plant();
        plant1.setSpecies("Gooseberry");
        plant1.setSpeciesInLatin("Ribes uva-crispa");
        plant1.setAnnual(false);
        plant1.setContinent("Europe");
        plant1.setHeight(40);
        plant1.setEdible(true);

        Plant plant2 = new Plant();
        plant2.setSpecies("Lilac");
        plant2.setSpeciesInLatin("Syringa");
        plant2.setAnnual(false);
        plant2.setContinent("Europe");
        plant2.setHeight(200);
        plant2.setEdible(false);

        Plant plant3 = new Plant();
        plant3.setSpecies("Buttercup");
        plant3.setSpeciesInLatin("Ranunculaceae");
        plant3.setAnnual(false);
        plant3.setContinent("Europe");
        plant3.setHeight(100);
        plant3.setEdible(true);

        Plant plant4 = new Plant();
        plant4.setSpecies("Grapevine");
        plant4.setSpeciesInLatin("Vitis");
        plant4.setAnnual(false);
        plant4.setContinent("Europe");
        plant4.setHeight(400);
        plant4.setEdible(true);

        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }
    }


}
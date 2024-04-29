package MeslekPolimorfizm;

public class Doktor extends Meslek{

   private String meslekAdi;

    Doktor(String meslekAdi) {
        super("Doktor");
    }


    public void meslekTanımı() {
        System.out.println(": Hastalıkları teşhis eder ve tedavi eder.");
    }
}

